package com.myWeb.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.myWeb.dao.ICategoryDAO;
import com.myWeb.model.CategoryModel;

public class CategoryDAO implements ICategoryDAO {

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jspservletjdbc";
			String user = "root";
			String pass = "";
			return DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException | SQLException e) {

			return null;
		}
	}

	public List<CategoryModel> findAll() {
		List<CategoryModel> results = new ArrayList<CategoryModel>();
		String sql = "SELECT User FROM category ;";

		Connection con = getConnection();
		PreparedStatement stm = null;
		ResultSet rS = null;

		try {
			stm = con.prepareStatement(sql);
			rS = stm.executeQuery();

			while (rS.next()) {
				CategoryModel cT = new CategoryModel();
				cT.setId(rS.getLong("id"));
				cT.setCode(rS.getString("code"));
				cT.setName(rS.getString("name"));
				results.add(cT);

			}
//			return results;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (stm != null) {
					stm.close();
				}
				if (rS != null) {
					rS.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return results;
	}
}
