package ua.logos.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="model")
public class Model extends BaseEntity{
	
	@Column(name="name_model")
	private String nameModel;
	
	private Brand brand;
	
	@Column(name="description")
	private String description;

	public Model() {

	}

	public Model(String nameModel, String description) {
		this.nameModel = nameModel;
		this.description = description;
	}
	
	

	public String getNameModel() {
		return nameModel;
	}

	public void setNameModel(String nameModel) {
		this.nameModel = nameModel;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Model [nameModel=" + nameModel + ", brand=" + brand + ", description=" + description + ", getId()="
				+ getId() + "]";
	}

	
	

	
	
	
}
