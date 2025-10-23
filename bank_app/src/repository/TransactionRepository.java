package repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import domain.Transaction;

public class TransactionRepository {
	private final Map<String, List<Transaction>> txByAccount = new HashMap<>();

	public void add(Transaction transaction) {
		List<Transaction> list = txByAccount.computeIfAbsent(transaction.getAccountNumber(), 
					k -> new ArrayList<>());
		
		list.add(transaction);
	}

	public List<Transaction> findByAccount(String account) {
		return new ArrayList<>(txByAccount.getOrDefault(account, Collections.emptyList()));
	}

}
