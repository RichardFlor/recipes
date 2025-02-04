package com.richard.recipes.controller;

import com.richard.recipes.response.RecipeResponse;
import com.richard.recipes.service.RecipeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/recipes")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(final RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/dish")
    public ResponseEntity<RecipeResponse> find(@RequestParam("name") String name) {
        return ResponseEntity.ok().body(recipeService.find(name));
    }
}
