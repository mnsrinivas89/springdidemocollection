package com.verizontraining.springdidemocollection;

import java.util.List;
import java.util.Set;

public class Country {

	private String name;
	private Set<String> languages;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getLanguages() {
		return languages;
	}

	public void setLanguages(Set<String> languages) {
		this.languages = languages;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", languages=" + languages + "]";
	}

}
