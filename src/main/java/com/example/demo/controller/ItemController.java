package com.example.demo.controller;

import com.example.demo.model.Item;
import com.example.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/items")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping
    public String getAllItems(Model model) {
        List<Item> items = itemService.getAllItems();
        model.addAttribute("items", items);
        return "listItems";  // Thymeleaf view
    }

    @GetMapping("/{id}")
    public String getItemById(@PathVariable Long id, Model model) {
        Optional<Item> item = itemService.getItemById(id);
        item.ifPresent(i -> model.addAttribute("item", i));
        return "editItem";  // Thymeleaf view for edit
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("item", new Item());
        return "createItem";  // Thymeleaf view for create
    }

    @PostMapping
    public String createItem(@ModelAttribute Item item) {
        itemService.createItem(item);
        return "redirect:/items";  // Redirect to list
    }

    @PostMapping("/{id}")
    public String updateItem(@PathVariable Long id, @ModelAttribute Item itemDetails) {
        itemService.updateItem(id, itemDetails);
        return "redirect:/items";  // Redirect to list
    }

    @GetMapping("/delete/{id}")
    public String deleteItem(@PathVariable Long id, Model model) {
        Optional<Item> item = itemService.getItemById(id);
        item.ifPresent(i -> model.addAttribute("item", i));
        return "deleteItem";  // Thymeleaf view for delete confirmation
    }

    @PostMapping("/delete/{id}")
    public String deleteItemConfirm(@PathVariable Long id) {
        itemService.deleteItem(id);
        return "redirect:/items";  // Redirect to list
    }
}
