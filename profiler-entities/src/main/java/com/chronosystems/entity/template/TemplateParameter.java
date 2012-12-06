package com.chronosystems.entity.template;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Template Parameter Entity
 * 
 * @author Andre Valadas
 */
@Entity
@Table(name = "template_parameter")
public class TemplateParameter implements Serializable {

	private static final long serialVersionUID = -4851860354476908520L;

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String name;
	private String defaultThemeColor;

	private Integer numOfPanoramicImages;
	private Integer numOfGaleryImages;
	private Integer numOfServiceCategories;
	private Integer numOfContacts;

	@ManyToOne
	private Template template;

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
	 * @return the defaultThemeColor
	 */
	public String getDefaultThemeColor() {
		return defaultThemeColor;
	}

	/**
	 * @param defaultThemeColor the defaultThemeColor to set
	 */
	public void setDefaultThemeColor(String defaultThemeColor) {
		this.defaultThemeColor = defaultThemeColor;
	}

	/**
	 * @return the numOfPanoramicImages
	 */
	public Integer getNumOfPanoramicImages() {
		return numOfPanoramicImages;
	}

	/**
	 * @param numOfPanoramicImages the numOfPanoramicImages to set
	 */
	public void setNumOfPanoramicImages(Integer numOfPanoramicImages) {
		this.numOfPanoramicImages = numOfPanoramicImages;
	}

	/**
	 * @return the numOfGaleryImages
	 */
	public Integer getNumOfGaleryImages() {
		return numOfGaleryImages;
	}

	/**
	 * @param numOfGaleryImages the numOfGaleryImages to set
	 */
	public void setNumOfGaleryImages(Integer numOfGaleryImages) {
		this.numOfGaleryImages = numOfGaleryImages;
	}

	/**
	 * @return the numOfServiceCategories
	 */
	public Integer getNumOfServiceCategories() {
		return numOfServiceCategories;
	}

	/**
	 * @param numOfServiceCategories the numOfServiceCategories to set
	 */
	public void setNumOfServiceCategories(Integer numOfServiceCategories) {
		this.numOfServiceCategories = numOfServiceCategories;
	}

	/**
	 * @return the numOfContacts
	 */
	public Integer getNumOfContacts() {
		return numOfContacts;
	}

	/**
	 * @param numOfContacts the numOfContacts to set
	 */
	public void setNumOfContacts(Integer numOfContacts) {
		this.numOfContacts = numOfContacts;
	}

	/**
	 * @return the template
	 */
	public Template getTemplate() {
		return template;
	}

	/**
	 * @param template the template to set
	 */
	public void setTemplate(Template template) {
		this.template = template;
	}
}