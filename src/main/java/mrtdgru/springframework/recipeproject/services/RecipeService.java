package mrtdgru.springframework.recipeproject.services;

import mrtdgru.springframework.recipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
