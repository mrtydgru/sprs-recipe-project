package mrtdgru.springframework.recipeproject.repositories;

import mrtdgru.springframework.recipeproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
