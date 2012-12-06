package com.chronosystems.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.chronosystems.entity.template.GaleryImage;
import com.chronosystems.entity.template.PanoramicImage;
import com.chronosystems.entity.template.ServiceCategory;
import com.chronosystems.entity.template.TemplateParameter;

/**
 * Business Teamplate Detail Entity
 * 
 * @author Andre Valadas
 */
@Entity
@Table(name = "business_template_detail")
public class BusinessTemplateDetail implements Serializable {

	private static final long serialVersionUID = 5154259075914856925L;

	@Id
	@GeneratedValue(generator = "generator")
	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "business"))
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private Business business;

	private String themeColor;

	@ManyToOne
	private TemplateParameter templateParameter;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "businessDetail")
	private Set<PanoramicImage> panoramicImages = new HashSet<PanoramicImage>(0);

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "businessDetail")
	private Set<GaleryImage> galeryImages = new HashSet<GaleryImage>(0);

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "businessDetail")
	private Set<ServiceCategory> categories = new HashSet<ServiceCategory>(0);

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "businessDetail")
	private Set<Contact> contacts = new HashSet<Contact>(0);

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
	 * @return the business
	 */
	public Business getBusiness() {
		return business;
	}

	/**
	 * @param business the business to set
	 */
	public void setBusiness(Business business) {
		this.business = business;
	}

	/**
	 * @return the themeColor
	 */
	public String getThemeColor() {
		return themeColor;
	}

	/**
	 * @param themeColor the themeColor to set
	 */
	public void setThemeColor(String themeColor) {
		this.themeColor = themeColor;
	}

	/**
	 * @return the templateParameter
	 */
	public TemplateParameter getTemplateParameter() {
		return templateParameter;
	}

	/**
	 * @param templateParameter the templateParameter to set
	 */
	public void setTemplateParameter(TemplateParameter templateParameter) {
		this.templateParameter = templateParameter;
	}

	/**
	 * @return the panoramicImages
	 */
	public Set<PanoramicImage> getPanoramicImages() {
		return panoramicImages;
	}

	/**
	 * @param panoramicImages the panoramicImages to set
	 */
	public void setPanoramicImages(Set<PanoramicImage> panoramicImages) {
		this.panoramicImages = panoramicImages;
	}

	/**
	 * @return the galeryImages
	 */
	public Set<GaleryImage> getGaleryImages() {
		return galeryImages;
	}

	/**
	 * @param galeryImages the galeryImages to set
	 */
	public void setGaleryImages(Set<GaleryImage> galeryImages) {
		this.galeryImages = galeryImages;
	}

	/**
	 * @return the categories
	 */
	public Set<ServiceCategory> getCategories() {
		return categories;
	}

	/**
	 * @param categories the categories to set
	 */
	public void setCategories(Set<ServiceCategory> categories) {
		this.categories = categories;
	}

	/**
	 * @return the contacts
	 */
	public Set<Contact> getContacts() {
		return contacts;
	}

	/**
	 * @param contacts the contacts to set
	 */
	public void setContacts(Set<Contact> contacts) {
		this.contacts = contacts;
	}
}