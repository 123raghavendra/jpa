package com.xworkz.jpaproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Data
@Entity// entity is mapping to sql 
@Table(name="mobileinfo")
@NamedQuery(name = "updateBrandById",query = "update  MobileEntity me set me.brand=:br where me.id=:i")
@NamedQuery (name = "findByBrand",query = "select m from MobileEntity m where m.brand=:b")// by brand i am reading all 
public class MobileEntity {

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "brand")
	private String brand;
	@Column(name = "price")
	private double price;
	@Column(name = "colour")
	private String colour;
	@Column(name = "ramSize")
	private int ramSize;
	@Column(name = "camera")
	private boolean camera;

	public MobileEntity() {
		// TODO Auto-generated constructor stub
		System.out.println("this is default constructor of  MobileEntity");
	}

	public MobileEntity( String brand, double price, String colour, int ramSize, boolean camera) {
		super();
	
		this.brand = brand;
		this.price = price;
		this.colour = colour;
		this.ramSize = ramSize;
		this.camera = camera;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	public boolean isCamera() {
		return camera;
	}

	public void setCamera(boolean camera) {
		this.camera = camera;
	}

	@Override
	public String toString() {
		return "MobileEntity [id=" + id + ", brand=" + brand + ", price=" + price + ", colour=" + colour + ", ramSize="
				+ ramSize + ", camera=" + camera + "]";
	}

}
