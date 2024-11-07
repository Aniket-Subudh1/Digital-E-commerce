package com.digitalecommerce.digital.e_commerce.services.admin.category;


import com.digitalecommerce.digital.e_commerce.dto.CategoryDto;
import com.digitalecommerce.digital.e_commerce.entity.Category;
import com.digitalecommerce.digital.e_commerce.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl  implements CategoryService{
    private final CategoryRepository categoryRepository;


    public Category createCategory(CategoryDto categoryDto) {
        Category category = new Category();
        category.setName(categoryDto.getName());
        category.setDescription(categoryDto.getDescription());


        return categoryRepository.save(category);
    }
}
