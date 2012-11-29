package com.chronosystems.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Entidade padrão exemplo
 * 
 * @author Andre Valadas
 */
@Root
@Entity
public class Customer implements Serializable {

	private static final long serialVersionUID = 7666928870904385070L;

	@Element(required=false)
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Element(required=false)
	@Column(nullable = false)
	private String name;

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
}