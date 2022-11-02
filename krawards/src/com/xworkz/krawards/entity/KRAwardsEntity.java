package com.xworkz.krawards.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Data
@Table(name="kr_awards")

public class KRAwardsEntity {
@Id
	@Column(name="id") 
	int id;
	@Column(name="name")
	String name;
	@Column(name="year")
	int year;
	@Column(name="achievement")
	String achievement;
	@Column(name="alive")
	boolean alive;
	@Column(name="age")
	int age;
	@Column(name="place")
	String place;
	

}
