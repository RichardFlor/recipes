package com.richard.recipes.response;

import com.richard.recipes.model.Recipe;

import java.util.List;


public record RecipeResponse(
        Integer count,
        List<Recipe> recipes
) {
}
