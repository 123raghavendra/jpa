package com.xworkz.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.jpa.constants.Type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="stadium")

public class StadiumEntity {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="foundedYear")
	private int foundedYear;
	@Column(name="capacity")
	private int capacity;
	@Column(name="entryFees")
	private double entryFees;
	@Column (name="type")
	private Type type;
	
	

}
