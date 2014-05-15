package com.mallgo.old.persistence;

import java.util.List;

import com.mallgo.old.domain.Category;

public interface CategoryMapper {

  List<Category> getCategoryList();

  Category getCategory(String categoryId);

}
