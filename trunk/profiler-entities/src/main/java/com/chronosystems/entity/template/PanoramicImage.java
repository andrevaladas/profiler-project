package com.chronosystems.entity.template;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.chronosystems.entity.BusinessTemplateDetail;

/**
 * Panoramic Image Entity
 * 
 * @author Andre Valadas
 */
@Entity
@Table(name = "panoramic_image")
public class PanoramicImage implements Serializable {

	private static final long serialVersionUID = 2940679953879530725L;

	@Id @GeneratedValue
	private Long id;
	private byte [] image;
	private String title;
	private String description;
	private Integer index;

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
	 * @return the index
	 */
	public Integer getIndex() {
		return index;
	}
	/**
	 * @param index the index to set
	 */
	public void setIndex(Integer index) {
		this.index = index;
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