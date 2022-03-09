package com.db.awmd.challenge.exception;

@SuppressWarnings("serial")
public class AccountNotFoundException extends AccountException {

	public AccountNotFoundException(String accountId) {
		super("Account #" + accountId + " is not found.");
	}
}
