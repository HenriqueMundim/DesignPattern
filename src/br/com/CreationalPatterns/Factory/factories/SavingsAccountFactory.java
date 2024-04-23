package br.com.CreationalPatterns.Factory.factories;

import br.com.CreationalPatterns.Factory.entity.Account;
import br.com.CreationalPatterns.Factory.interfaces.*;
import br.com.CreationalPatterns.Factory.model.SavingsAccount;

public class SavingsAccountFactory implements IAccountFactory {
    @Override
    public Account create() {
        return new SavingsAccount();
    }
}
