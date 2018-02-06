package ua.logos.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="concern")
public class Concern extends BaseEntity{

	@Column(name="name")
	private String name;
	
	
	private Country country;

	@Column(name="description")
	private String description;

	public Concern() {

	}
	
	public Concern(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Concern [name=" + name + ", description=" + description + ", getId()=" + getId() + "]";
	}

}
