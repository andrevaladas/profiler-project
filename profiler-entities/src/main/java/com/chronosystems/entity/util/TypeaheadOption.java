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
public class TypeaheadOption {

	private Set<Option> options = new HashSet<Option>();

	public void add(final Option option) {
		options.add(option);
	}

	/**
	 * @return the options
	 */
	public Set<Option> getOptions() {
		return options;
	}

	/**
	 * @param options the options to set
	 */
	public void setOptions(Set<Option> options) {
		this.options = options;
	}
}
