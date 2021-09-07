package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="licenses")
public class License {
	
	
	
	@Override
	public String toString() {
		return "License [liscenseId=" + liscenseId + ", description=" + description + ", organisationId="
				+ organisationId + ", productName=" + productName + ", liscenseType=" + liscenseType + ", comment="
				+ comment + "]";
	}
	@Id
    @Column(name="license_id" ,nullable=false)
	private String liscenseId;
	private String description;
	@Column(name="organisation_id" ,nullable=false)
	private String organisationId;
	@Column(name = "product_name", nullable = false)
	private String productName;
	@Column(name = "license_type", nullable = false)
	private String liscenseType;
	@Column(name="comment")
	private String comment;
	
	
	public String getLiscenseId() {
		return liscenseId;
	}
	public void setLiscenseId(String liscenseId) {
		this.liscenseId = liscenseId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOrganisationId() {
		return organisationId;
	}
	public void setOrganisationId(String organisationId) {
		this.organisationId = organisationId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getLiscenseType() {
		return liscenseType;
	}
	public void setLiscenseType(String liscenseType) {
		this.liscenseType = liscenseType;
	}
	

}
