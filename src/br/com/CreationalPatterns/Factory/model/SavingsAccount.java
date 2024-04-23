package br.com.CreationalPatterns.Factory.model;

import br.com.CreationalPatterns.Factory.entity.Account;

public class SavingsAccount extends Account {
    private double fees = 0.01;

    public SavingsAccount() {
        super();
    }

    public void interestIncome() {
        this.setBalance(this.getBalance() * this.fees);
    }

}
