package com.zororocks.moneymanager1.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name="USER")
public class User {
	
	@Id
	private Long id;
	
	private String name;
	
	private String email;
}
