package com.ac.dto;

public class Plan {
protected String planName;
protected String planType;
protected int validity;
protected double amount;
public Plan(){
	
}
public Plan(String planName, String planType, int validity, double amount) {
	this.planName = planName;
	this.planType = planType;
	this.validity = validity;
	this.amount = amount;
}
public String getPlanName() {
	return planName;
}
public void setPlanName(String planName) {
	this.planName = planName;
}
public String getPlanType() {
	return planType;
}
public void setPlanType(String planType) {
	this.planType = planType;
}
public int getValidity() {
	return validity;
}
public void setValidity(int validity) {
	this.validity = validity;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}

}
