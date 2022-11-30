package com.balatsch.shoppingCart.Services;

import com.balatsch.shoppingCart.entities.Category;
import com.balatsch.shoppingCart.repositories.CateogryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService{

    @Autowired
    CateogryRepository cateogryRepository;

    @Override
    public Category createCategory(Category category) {
        return cateogryRepository.save(category);
    }

    @Override
    public void deleteCategory(Category category) {
        cateogryRepository.delete(category);
    }

    @Override
    public List<Category> getCategories() {
        return cateogryRepository.findAll();
    }
}
