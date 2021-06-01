package com.loan.model;

import javax.validation.constraints.Size;



//import org.springframework.lang.NonNull;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


public class LoanError {
	@NotNull(message = "must not be null")
	@Size(min = 4, max = 30, message = "size must be between 4 and 30")
	public String name;

	@NotNull(message = "must not be null")
	public String gender;

	@NotEmpty(message = "must not be empty")
	@Email(message = "must be a well-formed email address")
	public String email;

	@NotNull(message = "must not be null")
	public Double income;

	@NotEmpty(message = "must not be empty")
	public String loan_type;

	@NotNull(message = "must not be null")
	public Double amount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double monthlyIncome) {
		this.income = income;
	}

	/*public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}*/



	


}
