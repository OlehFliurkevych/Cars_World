package ua.logos.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class Country extends BaseEntity{
	
	@Column(name="name_country")
	private String nameCountry;

	public Country() {
		
	}

	public Country(String nameCountry) {
		this.nameCountry = nameCountry;
	}

	public String getNameCountry() {
		return nameCountry;
	}

	public void setNameCountry(String nameCountry) {
		this.nameCountry = nameCountry;
	}

	@Override
	public String toString() {
		return "Country [nameCountry=" + nameCountry + ", getId()=" + getId() + "]";
	}


}
