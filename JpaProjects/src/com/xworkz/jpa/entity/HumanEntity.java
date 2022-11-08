package com.xworkz.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="human_info")

public class HumanEntity{

	
	@Id
	@Column(name="id")
	private int id;
	
    @Column(name="name")
    private String name;
    
	@Column(name="age")
      private int age;
	
	@Column(name="work")
    private String work;
	
	@Column(name="salary")
    private double salary;
	
	@Column(name="lover")
    private boolean lover;
	
	@Column(name="colour")
    private String colour;
	
	@Column(name="alive")
     private boolean alive;
	
	@Column (name="height")
	private String height;
	
	@Column(name="weight")
	private double weight;
	
	@Column (name="mobile")
	private boolean mobile;
	
	@Column(name="honest")
	private boolean honest;
	
	@Column (name="creativeMind")
	private boolean creativeMind;
	
	@Column(name="goodListnear")
	private boolean goodListnear;
	
	@Column (name="responsiblePerson")
	private boolean responsiblePerson;

}
