package com.myWeb.service.impl;

import java.util.List;
import javax.inject.Inject;
import com.myWeb.dao.ICategoryDAO;
import com.myWeb.model.CategoryModel;
import com.myWeb.service.ICategoryService;

public class CategoryService implements ICategoryService {

	@Inject
	private ICategoryDAO cTD;
	
//	private ICategoryDAO cTD;
//	public CategoryService() {
//		cTD = new CategoryDAO();
//	}

	@Override
	public List<CategoryModel> findAll() {

		return cTD.findAll();
	}

}
