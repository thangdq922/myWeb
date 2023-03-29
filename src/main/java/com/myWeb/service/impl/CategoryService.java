package com.myWeb.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.myWeb.dao.ICategoryDAO;
import com.myWeb.model.CategoryModel;
import com.myWeb.service.ICategoryService;

public class CategoryService implements ICategoryService {
	
	@Inject
	private ICategoryDAO categoryDao;

	@Override
	public List<CategoryModel> findAll() {
		return categoryDao.findAll();
	}
}
