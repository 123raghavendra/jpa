package com.bus.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "BusInfo")
@NamedQuery(name = "findByBusName", query = "select i from BusEntity i where busName=:ab") // hql query
@NamedQuery(name = "findByColour", query = "select b from BusEntity b where b.colour=:cd")
@NamedQuery(name = "findByNumberAndBusName" , query = "select r from BusEntity r where r.number=:jk and r.busName=:lm")
@NamedQuery(name = "readAll" ,query = "select i from BusEntity i")
@NamedQuery(name="findColourByBusName", query = "select t.colour  from BusEntity t where t.busName=:nb")
@NamedQuery(name = "findNumberById", query = "select d.number from BusEntity d where d.id=:cc")
@NamedQuery(name = "updateColourByNumber", query = "update BusEntity m set m.colour=:c where m.number=:n")
@NamedQuery(name = "updateBusNameAndNumberById",query = "update BusEntity v set v.number=:b ,v.busName=:o where v.id=:p")
@NamedQuery(name = "deleteById",query = "delete from BusEntity c where id=:i ")

public class BusEntity {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "busName")
	private String busName;
	@Column(name = "number")
	private int number;
	@Column(name = "colour")
	private String colour;

	public BusEntity() {
		System.out.println("Bus entity created");
	}

	public BusEntity(String busName, int number, String colour) {

		this.busName = busName;
		this.number = number;
		this.colour = colour;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "BusEntity [id=" + id + ", busName=" + busName + ", number=" + number + ", colour=" + colour + "]";
	}

}
