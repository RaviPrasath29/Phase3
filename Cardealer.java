package com.samples.s01springcoreDI;

import java.util.Set;

public class Cardealer {
	
	private String name;
	private Set<String> models;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getModels() {
		return models;
	}
	public void setModels(Set<String> models) {
		this.models = models;
	}
	@Override
	public String toString() {
		return "Cardealer [name=" + name + ", models=" + models + "]";
	}
	
	

}
