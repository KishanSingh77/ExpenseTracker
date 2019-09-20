package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity
//@Data
//@AllArgsConstructor
@NoArgsConstructor
@Table(name="category")
@Getter @Setter
public class Category {
	
	@Id
	private Long id;
	@NonNull
	private String name;
	
//	@ManyToOne(cascade=CascadeType.PERSIST)
//	private User user;
	
	

}
