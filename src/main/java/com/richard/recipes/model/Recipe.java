package com.richard.recipes.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Recipe(
        String publisher,
        String title,
        @JsonProperty("source_url") String SourceUrl,
        @JsonProperty("recipe_id")String recipeId,
        @JsonProperty("image_url")String imageUrl,
        @JsonProperty("social_rank")Integer socialRank,
        @JsonProperty("publisher_url")String publisherUrl

) {
}
