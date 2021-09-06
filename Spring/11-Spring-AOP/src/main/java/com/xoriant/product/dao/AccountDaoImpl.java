package com.xoriant.product.dao;

import org.springframework.stereotype.Repository;

import com.xoriant.product.model.Account;

@Repository
public class AccountDaoImpl {

	public boolean isFundsAvailable(Account acc, double amount) {
		if (acc.getBalance() >= amount) {
			return true;
		}
		return false;
	}

	public boolean isAccountValid(Account acc) {
		// list of saved account numbers needed
		return true;
	}

	public boolean destinationAccountTransferStatus(Account acc) {
		return true;
	}

	
	public boolean transferFunds(Account srcAcc, Account destAcc, double amount) {

		if (isFundsAvailable(srcAcc, amount)) {
			// initiate transfer process
			// credit into destination account
			if (isAccountValid(destAcc) && destinationAccountTransferStatus(destAcc)) {
				destAcc.setBalance(destAcc.getBalance() + amount);
			} else {
				System.out.println("Account is Not valid");
				return false;
			}
			// bebit from source account if destination account credit is sucess
			if (destinationAccountTransferStatus(destAcc)) {
				srcAcc.setBalance(srcAcc.getBalance() - amount);
			} else {
				System.out.println("Issue while crediting amount to destination account. Transfer not successful");
				return  false;
			}

		} else {
			System.out.println("Source account not having Enough Funds");
			return false;
		}
		return true;

	}

}
