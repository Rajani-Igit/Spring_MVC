package com.abstractcontroller.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.abstractcontroller.bo.ProductBo;

public class ProductDao {
private final String SQL_GET_PRODUCTS="SELECT PRODUCT_ID, PRODUCT_NAME, PRODUCT_CATEGORY, PRODUCT_BRAND, PRODUCT_PRICE FROM PRODUCT_TBL";
private JdbcTemplate jdbctemplate;
public void setJdbctemplate(JdbcTemplate jdbctemplate) {
	this.jdbctemplate = jdbctemplate;
}
public JdbcTemplate getJdbctemplate() {
	return jdbctemplate;
}
public List<ProductBo> getProducts(){
	System.out.println(jdbctemplate);
	return jdbctemplate.query(SQL_GET_PRODUCTS, new RowMapper<ProductBo>(){
		ProductBo bo=new ProductBo();
		@Override
		public ProductBo mapRow(ResultSet rs, int count) throws SQLException {
			// TODO Auto-generated method stub
			bo.setProduct_id(rs.getInt(1));
			bo.setProduct_name(rs.getString(2));
			bo.setProduct_category(rs.getString(3));
			bo.setProduct_brand(rs.getString(4));
			bo.setProduct_price(rs.getString(5));
			return bo;
		}
		
	});
}
}
