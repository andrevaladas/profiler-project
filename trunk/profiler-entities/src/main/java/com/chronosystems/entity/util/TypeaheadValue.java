/**
 * 
 */
package com.chronosystems.entity.util;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Andre Valadas
 *
 */
public class TypeaheadValue {

	private Set<String> options = new HashSet<String>();

	public void addOption(final String value) {
		options.add(value);
	}

	/**
	 * @return the options
	 */
	public Set<String> getOptions() {
		return options;
	}

	/**
	 * @param options the options to set
	 */
	public void setOptions(Set<String> options) {
		this.options = options;
	}
}
