package com.richard.recipes.api;

import com.richard.recipes.response.RecipeResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "recipes", url = "https://forkify-api.herokuapp.com/api/search")
public interface RecipeAPI {

    @GetMapping
    public RecipeResponse find(@RequestParam("q") String name);
}
