package br.com.CreationalPatterns.Factory;

import br.com.CreationalPatterns.Factory.entity.Account;
import br.com.CreationalPatterns.Factory.factories.CurrentAccountFactory;
import br.com.CreationalPatterns.Factory.factories.SavingsAccountFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account account;
        System.out.println("What type of account do you want to open?\n1 - Current account\n2 - Savings account\n");
        int choice = sc.nextInt();

        if (choice == 1) {
            CurrentAccountFactory factory = new CurrentAccountFactory();
            account = factory.create();
        }
        if (choice == 2) {
            SavingsAccountFactory factory = new SavingsAccountFactory();
            account = factory.create();
        }
    }
}
