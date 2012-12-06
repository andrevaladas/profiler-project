package com.chronosystems.entity.template;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.chronosystems.entity.enumerator.YesNo;

/**
 * Template Entity
 * 
 * @author Andre Valadas
 */
@Entity
public class Template implements Serializable {

	private static final long serialVersionUID = -4851860354476908520L;

	@Id @GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String path;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String description;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private YesNo active = YesNo.YES;

	@ManyToOne
	private TemplateCategory category;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "template", cascade = CascadeType.ALL)
	private Set<TemplateParameter> parameters = new HashSet<TemplateParameter>(0);

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
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
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
	 * @return the active
	 */
	public YesNo getActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(YesNo active) {
		this.active = active;
	}

	/**
	 * @return the category
	 */
	public TemplateCategory getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(TemplateCategory category) {
		this.category = category;
	}

	/**
	 * @return the parameters
	 */
	public Set<TemplateParameter> getParameters() {
		return parameters;
	}

	/**
	 * @param parameters the parameters to set
	 */
	public void setParameters(Set<TemplateParameter> parameters) {
		this.parameters = parameters;
	}
}