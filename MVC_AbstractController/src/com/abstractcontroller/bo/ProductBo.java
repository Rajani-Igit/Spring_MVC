package com.abstractcontroller.bo;

public class ProductBo {
private int	product_id;
private String product_name;
private String product_category;
private String product_brand;
private String product_price;
public String getProduct_price() {
	return product_price;
}
public void setProduct_price(String product_price) {
	this.product_price = product_price;
}
public int getProduct_id() {
	return product_id;
}
public void setProduct_id(int product_id) {
	this.product_id = product_id;
}
public String getProduct_name() {
	return product_name;
}
public void setProduct_name(String product_name) {
	this.product_name = product_name;
}
public String getProduct_category() {
	return product_category;
}
public void setProduct_category(String product_category) {
	this.product_category = product_category;
}
public String getProduct_brand() {
	return product_brand;
}
public void setProduct_brand(String product_brand) {
	this.product_brand = product_brand;
}
@Override
public String toString() {
	return "ProductBo [product_id=" + product_id + ", product_name=" + product_name + ", product_category="
			+ product_category + ", product_brand=" + product_brand + ", product_price=" + product_price + "]";
}


}
