package com.zororocks.moneymanager1.Models;

import java.time.Instant;

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
@Table (name="transaction")
public class Transaction {	
	
	@Id
	private Long id;
	
	private Long userID;
	
	private Boolean income;
	
	private Long amount;
	
	private Instant date;
	
	private String description;

}
