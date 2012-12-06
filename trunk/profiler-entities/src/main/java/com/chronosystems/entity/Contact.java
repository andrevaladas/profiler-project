package com.chronosystems.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.chronosystems.entity.enumerator.ContactType;

/**
 * Contact Entity
 * 
 * @author Andre Valadas
 */
@Entity
public class Contact implements Serializable {

	private static final long serialVersionUID = 8733927062522482875L;

	@Id @GeneratedValue
	private Long id;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private ContactType type = ContactType.PHONE;

	@Column(nullable = false)
	private String description;

	@ManyToOne
	private BusinessTemplateDetail businessDetail;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the type
	 */
	public ContactType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(ContactType type) {
		this.type = type;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the businessDetail
	 */
	public BusinessTemplateDetail getBusinessDetail() {
		return businessDetail;
	}

	/**
	 * @param businessDetail the businessDetail to set
	 */
	public void setBusinessDetail(BusinessTemplateDetail businessDetail) {
		this.businessDetail = businessDetail;
	}
}