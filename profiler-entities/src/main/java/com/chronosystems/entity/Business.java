package com.chronosystems.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.chronosystems.entity.location.Address;

/**
 * Business Entity
 * 
 * @author Andre Valadas
 */
@Entity
public class Business implements Serializable {

	private static final long serialVersionUID = -7863742816254314511L;

	@Id @GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String businessID;

	@Column(nullable = false)
	private String name;
	private String slogan;
	private String description;

	@Lob
	@Column(nullable = false)
	private byte[] logo;

	@ManyToOne
	private ActivityArea activityArea;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "business")
	private Set<Address> addresses = new HashSet<Address>(0);

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "business", cascade = CascadeType.ALL)
	private BusinessTemplateDetail templateDetail;

	@ManyToOne
	private Business headquarters;

	@ManyToOne
	private User user;

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
	 * @return the businessID
	 */
	public String getBusinessID() {
		return businessID;
	}

	/**
	 * @param businessID the businessID to set
	 */
	public void setBusinessID(String businessID) {
		this.businessID = businessID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the slogan
	 */
	public String getSlogan() {
		return slogan;
	}

	/**
	 * @param slogan the slogan to set
	 */
	public void setSlogan(String slogan) {
		this.slogan = slogan;
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
	 * @return the logo
	 */
	public byte[] getLogo() {
		return logo;
	}

	/**
	 * @param logo the logo to set
	 */
	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	/**
	 * @return the activityArea
	 */
	public ActivityArea getActivityArea() {
		return activityArea;
	}

	/**
	 * @param activityArea the activityArea to set
	 */
	public void setActivityArea(ActivityArea activityArea) {
		this.activityArea = activityArea;
	}

	/**
	 * @return the addresses
	 */
	public Set<Address> getAddresses() {
		return addresses;
	}

	/**
	 * @param addresses the addresses to set
	 */
	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	/**
	 * @return the templateDetail
	 */
	public BusinessTemplateDetail getTemplateDetail() {
		return templateDetail;
	}

	/**
	 * @param templateDetail the templateDetail to set
	 */
	public void setTemplateDetail(BusinessTemplateDetail templateDetail) {
		this.templateDetail = templateDetail;
	}

	/**
	 * @return the headquarters
	 */
	public Business getHeadquarters() {
		return headquarters;
	}

	/**
	 * @param headquarters the headquarters to set
	 */
	public void setHeadquarters(Business headquarters) {
		this.headquarters = headquarters;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
}