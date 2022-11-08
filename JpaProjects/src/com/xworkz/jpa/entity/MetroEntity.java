package com.xworkz.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name=" metro_info")

public class MetroEntity {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="metroName")
	private String metroName;
	@Column(name="announcement")
	private boolean announcement;
	@Column(name="screen")
	private boolean screen;
	@Column(name="colour")
	private String colour;
	@Column(name="noOfStation")
	private int noOfStation;
	@Column(name="noOfCompartment")
	private int noOfCompartment;
	@Column(name="timeing")
	private double timeing;
	@Column(name="noOfPassengers")
	private int noOfPassengers;
	@Column(name="securityAvailable")
	private boolean securityAvailable;
	

}
