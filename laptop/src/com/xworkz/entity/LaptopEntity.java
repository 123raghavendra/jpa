package com.xworkz.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "LaptopDetails")
@NamedQuery(name = "readAll", query = "select read from LaptopEntity read ")
@NamedQuery(name = "findByBrand", query = "select r from LaptopEntity r where brand=:ab")
@NamedQuery(name = "findByColour", query = "select n from LaptopEntity n where colour=:bc")
@NamedQuery(name = "findByHardDisk", query = "select y from LaptopEntity y where hardDisk=:jk")
@NamedQuery(name = "findByBrandAndColour", query = "select h from LaptopEntity  h where brand=:kk and colour=:pp")
@NamedQuery(name = "findByRamSizeAndId", query = "select j from LaptopEntity j where ramSize=:uu and id=:tt")
@NamedQuery(name = "findColourAndRamSizeByBrand", query = "select t.colour,t.ramSize from LaptopEntity t where brand=:bb")
@NamedQuery(name = "findBrandByColour", query = "select y.brand from LaptopEntity y where colour=:cv")
@NamedQuery(name = "updateBrandByColour", query = "update LaptopEntity c set c.brand=:d where c.colour=:e")
@NamedQuery(name = "updateRamSizeByHardDisk",query = "update LaptopEntity h set h.ramSize=:ra where h.hardDisk=:ha")
@NamedQuery(name = "deleteById",query = "delete from LaptopEntity c where id=:i ")
@NamedQuery(name = "deleteByBrand",query = "delete from LaptopEntity b where b.brand=:br")






public class LaptopEntity {

	@Id
	private int id;
	private String brand;
	private String colour;
	private int ramSize;
	private boolean mouseAvailable;
	private int hardDisk;

	public LaptopEntity() {
		// TODO Auto-generated constructor stub
		System.out.println("Created LaptopEntity ");
	}

	public LaptopEntity(int id, String brand, String colour, int ramSize, boolean mouseAvailable, int hardDisk) {
		super();
		this.id = id;
		this.brand = brand;
		this.colour = colour;
		this.ramSize = ramSize;
		this.mouseAvailable = mouseAvailable;
		this.hardDisk = hardDisk;
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

	public boolean isMouseAvailable() {
		return mouseAvailable;
	}

	public void setMouseAvailable(boolean mouseAvailable) {
		this.mouseAvailable = mouseAvailable;
	}

	public int getHardDisk() {
		return hardDisk;
	}

	public void setHardDisk(int hardDisk) {
		this.hardDisk = hardDisk;
	}

	@Override
	public String toString() {
		return "LaptopEntity [id=" + id + ", brand=" + brand + ", colour=" + colour + ", ramSize=" + ramSize
				+ ", mouseAvailable=" + mouseAvailable + ", hardDisk=" + hardDisk + "]";
	}

	

}
