package com.xworkz.soapentity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name=" soap_details  ")
public class SoapEntity {
	@Id
	@Column(name =" id")
	private int id;
	@Column(name=" brand")
	private String brand;
	@Column(name=" price")
	private double price;
	@Column(name= "validatyDate")
	private LocalDate  validatyDate;
	@Column(name = "companyLocation")
	private String companyLocation;

}
