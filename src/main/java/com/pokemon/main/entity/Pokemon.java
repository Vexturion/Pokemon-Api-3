package com.pokemon.main.entity;

import javax.persistence.Entity;

@Entity
public class Pokemon {

	private Integer id;
	
	private String name;
	
	private String abilities;
	
	private String baseExperience;
	
	private String heldItems;
	
	private String locationAreaEncounters;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
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
	 * @return the abilities
	 */
	public String getAbilities() {
		return abilities;
	}

	/**
	 * @param abilities the abilities to set
	 */
	public void setAbilities(String abilities) {
		this.abilities = abilities;
	}

	/**
	 * @return the baseExperience
	 */
	public String getBaseExperience() {
		return baseExperience;
	}

	/**
	 * @param baseExperience the baseExperience to set
	 */
	public void setBaseExperience(String baseExperience) {
		this.baseExperience = baseExperience;
	}

	/**
	 * @return the heldItems
	 */
	public String getHeldItems() {
		return heldItems;
	}

	/**
	 * @param heldItems the heldItems to set
	 */
	public void setHeldItems(String heldItems) {
		this.heldItems = heldItems;
	}

	/**
	 * @return the locationAreaEncounters
	 */
	public String getLocationAreaEncounters() {
		return locationAreaEncounters;
	}

	/**
	 * @param locationAreaEncounters the locationAreaEncounters to set
	 */
	public void setLocationAreaEncounters(String locationAreaEncounters) {
		this.locationAreaEncounters = locationAreaEncounters;
	}
	
	
	
}
