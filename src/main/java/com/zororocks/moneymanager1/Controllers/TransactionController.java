package com.zororocks.moneymanager1.Controllers;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zororocks.moneymanager1.Models.Transaction;
import com.zororocks.moneymanager1.Repositories.TransactionRepository;

@RestController
@RequestMapping("/api")
public class TransactionController {
	
	private TransactionRepository transactionRepository;

	public TransactionController(TransactionRepository transactionRepository) {
		super();
		this.transactionRepository = transactionRepository;
	}
	
	@GetMapping("/alltransaction")
	Collection<Transaction> transactions() {
		return transactionRepository.findAll();
	}

}
