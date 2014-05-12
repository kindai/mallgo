package com.mallgo.persistence;

import java.util.List;

import com.mallgo.domain.Category;

public interface CategoryMapper {

  List<Category> getCategoryList();

  Category getCategory(String categoryId);

}
