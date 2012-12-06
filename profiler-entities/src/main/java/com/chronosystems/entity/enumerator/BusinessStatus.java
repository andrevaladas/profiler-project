/**
 * 
 */
package com.chronosystems.entity.enumerator;

import java.io.Serializable;

/**
 * Business Status Enumerator
 * 
 * @author Andre Valadas
 *
 */
public enum BusinessStatus implements Serializable {
	NEW, ACTIVE, INACTIVE, EXPIRED, REVIEW;
}