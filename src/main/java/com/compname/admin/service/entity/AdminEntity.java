package com.compname.admin.service.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admins")

public class AdminEntity {
	@Id
	private int adminId;
	double adminContactNumber;
	String adminFirstName;
	String adminLastName; 
	String adminAddress;
	double adminBankAccountNumber;
	
	public AdminEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminEntity(int adminId, double adminContactNumber, String adminFirstName, String adminLastName,
			String adminAddress, double adminBankAccountNumber) {
		super();
		this.adminId = adminId;
		this.adminContactNumber = adminContactNumber;
		this.adminFirstName = adminFirstName;
		this.adminLastName = adminLastName;
		this.adminAddress = adminAddress;
		this.adminBankAccountNumber = adminBankAccountNumber;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public double getAdminContactNumber() {
		return adminContactNumber;
	}

	public void setAdminContactNumber(double adminContactNumber) {
		this.adminContactNumber = adminContactNumber;
	}

	public String getAdminFirstName() {
		return adminFirstName;
	}

	public void setAdminFirstName(String adminFirstName) {
		this.adminFirstName = adminFirstName;
	}

	public String getAdminLastName() {
		return adminLastName;
	}

	public void setAdminLastName(String adminLastName) {
		this.adminLastName = adminLastName;
	}

	public String getAdminAddress() {
		return adminAddress;
	}

	public void setAdminAddress(String adminAddress) {
		this.adminAddress = adminAddress;
	}

	public double getAdminBankAccountNumber() {
		return adminBankAccountNumber;
	}

	public void setAdminBankAccountNumber(double adminBankAccountNumber) {
		this.adminBankAccountNumber = adminBankAccountNumber;
	}

	@Override
	public String toString() {
		return "AdminEntity [adminId=" + adminId + ", adminContactNumber=" + adminContactNumber + ", adminFirstName="
				+ adminFirstName + ", adminLastName=" + adminLastName + ", adminAddress=" + adminAddress
				+ ", adminBankAccountNumber=" + adminBankAccountNumber + "]";
	}

	
	
	
	
}
