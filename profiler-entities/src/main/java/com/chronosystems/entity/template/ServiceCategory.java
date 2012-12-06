package com.chronosystems.entity.template;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.chronosystems.entity.BusinessTemplateDetail;
import com.chronosystems.entity.enumerator.ServiceCategoryType;

/**
 * Service Category Entity
 * 
 * @author Andre Valadas
 */
@Entity
@Table(name = "service_category")
public class ServiceCategory implements Serializable {

	private static final long serialVersionUID = 517360688137109468L;

	@Id @GeneratedValue
	private Long id;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private ServiceCategoryType categoryType = ServiceCategoryType.NONE;

	@Column(nullable = false)
	private String title;

	@Column(nullable = false)
	private String summary;

	private String description;

	private byte [] image;

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
	 * @return the categoryType
	 */
	public ServiceCategoryType getCategoryType() {
		return categoryType;
	}

	/**
	 * @param categoryType the categoryType to set
	 */
	public void setCategoryType(ServiceCategoryType categoryType) {
		this.categoryType = categoryType;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the summary
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * @param summary the summary to set
	 */
	public void setSummary(String summary) {
		this.summary = summary;
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
	 * @return the image
	 */
	public byte[] getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(byte[] image) {
		this.image = image;
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