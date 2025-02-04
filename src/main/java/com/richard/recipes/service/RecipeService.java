package com.richard.recipes.service;

import com.richard.recipes.api.RecipeAPI;
import com.richard.recipes.response.RecipeResponse;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {
    private final RecipeAPI recipeAPI;

    public RecipeService(final RecipeAPI recipeAPI) {
        this.recipeAPI = recipeAPI;
    }

    public RecipeResponse find(final String name) {
        return recipeAPI.find(name);
    }
}
