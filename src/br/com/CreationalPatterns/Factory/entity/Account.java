package br.com.CreationalPatterns.Factory.entity;

import java.util.UUID;

public abstract class Account {
    private final String id = UUID.randomUUID().toString();
    private double balance = 0;

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double value) {
        if (value <= 0) {
            System.out.println("Invalid value");
        } else {
            this.balance += value;
        }
    }
}
