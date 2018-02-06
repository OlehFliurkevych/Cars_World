package ua.logos.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="brand")
public class Brand extends BaseEntity{
	
	@Column(name="name_brand")
	private String nameBrand;
	
	private Country country;
	
	private Concern concern;
	
	private Area area;
	
	@Column(name="description")
	private String description;
	
	public Brand() {
		
	}

	public Brand(String nameBrand, String description) {
		this.nameBrand = nameBrand;
		this.description = description;
	}

	public String getNameBrand() {
		return nameBrand;
	}

	public void setNameBrand(String nameBrand) {
		this.nameBrand = nameBrand;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Concern getConcern() {
		return concern;
	}

	public void setConcern(Concern concern) {
		this.concern = concern;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Brand [nameBrand=" + nameBrand + ", description=" + description + ", getId()=" + getId() + "]";
	}


}
