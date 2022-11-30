package com.balatsch.shoppingCart.Services;

import com.balatsch.shoppingCart.entities.Category;

import java.util.List;

public interface CategoryService {
    public Category createCategory(Category category);
    public void deleteCategory(Category category);
    public List<Category> getCategories();

}
