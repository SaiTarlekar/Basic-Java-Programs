package com.prowings.bank;

import java.util.ArrayList;
import java.util.List;

public class TransactionLog {

	private List<String> log;

	public TransactionLog() {
		this.log = new ArrayList<>();
	}

	public void logTransaction(String transaction) {
		log.add(transaction);
	}

	public void printTransactions() {
		for (String entry : log)
			System.out.println(entry);
	}

}
