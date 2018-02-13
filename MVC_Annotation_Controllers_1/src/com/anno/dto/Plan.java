package com.anno.dto;

public class Plan {
private String planName;
private double amount;
private String  validity;
public Plan(String planName, double amount, String validity) {
	this.planName = planName;
	this.amount = amount;
	this.validity = validity;
}
public String getPlanName() {
	return planName;
}
public void setPlanName(String planName) {
	this.planName = planName;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public String getValidity() {
	return validity;
}
public void setValidity(String validity) {
	this.validity = validity;
}


}
