package mrtdgru.springframework.recipeproject.repositories;

import mrtdgru.springframework.recipeproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
