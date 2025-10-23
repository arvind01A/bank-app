package service;

import java.util.List;

import domain.Account;
import domain.Transaction;

public interface BankService {
	String openAccount(String name, String email, String accountType);
	List<Account> listAccount();
	void deposit(String accountNumber, Double amount, String note);
	void withdraw(String accountNumber, Double amount, String note);
	void transfer(String from, String to, Double amount, String note);
	List<Transaction> getStatement(String account);
	List<Account> searchAccountByCustomerName(String q);
}
