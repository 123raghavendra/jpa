package com.xworkz.ownProject.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class BusEntity {
	private String name;
	private int id;
	private String driverName;

}
