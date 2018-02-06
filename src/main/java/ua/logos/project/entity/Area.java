package ua.logos.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="area")
public class Area extends BaseEntity{

	@Column(name="name_country")
	private String nameArea;

	public Area() {
		
	}

	public Area(String nameArea) {
		this.nameArea = nameArea;
	}

	public String getNameArea() {
		return nameArea;
	}

	public void setNameArea(String nameArea) {
		this.nameArea = nameArea;
	}

	@Override
	public String toString() {
		return "Area [nameArea=" + nameArea + ", getId()=" + getId() + "]";
	}


	
	
	
	
}
