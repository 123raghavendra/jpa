package com.xworkz.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString

@NamedQuery(name = "findByMetroName", query = "select m from MetroEntity m where metroName=:mn")
@NamedQuery(name = "findByColour",query = "select m from MetroEntity m where colour=:co")
@NamedQuery(name = "findByPrice", query = "select p from MetroEntity p where price=:pr")
@NamedQuery(name = "findBymetroNameAndprice", query = "select u from MetroEntity u where metroName=:mn and price=:pr")
@NamedQuery(name = "findColourBynoOfSeatsAndprice", query = "select c.colour from MetroEntity c where c.noOfSeats=:ns and c.price=:pr")
@NamedQuery(name = "findMetroNameByNoOfSeats", query = "Select m.metroName from MetroEntity m where  m.noOfSeats=:ms")
@NamedQuery(name = "findAllColour", query = "select c.colour from MetroEntity c")
@NamedQuery(name = "findAllprice", query = "select p.price from MetroEntity p ")
@NamedQuery(name = "updateColourByNoOfSeats", query = " update MetroEntity m set m.colour=:co where m.noOfSeats=:ns")
@NamedQuery(name = "deleteByColour",query = " delete from MetroEntity m where m.colour=:co")





//select metroName from metroentity where noOfSeats=4000;
public class MetroEntity {
	@Id
	private int id;
	private String metroName;
	private double price;
	private int noOfSeats;
	private String colour;
	private boolean radio;

	public MetroEntity() {
		System.out.println("CREATED  MetroEntity CLASS");
	}

	public MetroEntity(int id, String metroName, double price, int noOfSeats, String colour, boolean radio) {
		super();
		this.id = id;
		this.metroName = metroName;
		this.price = price;
		this.noOfSeats = noOfSeats;
		this.colour = colour;
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "MetroEntity [id=" + id + ", metroName=" + metroName + ", price=" + price + ", noOfSeats=" + noOfSeats
				+ ", colour=" + colour + ", radio=" + radio + "]";
	}

}
