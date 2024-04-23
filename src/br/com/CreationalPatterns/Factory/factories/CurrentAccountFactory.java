package br.com.CreationalPatterns.Factory.factories;

import br.com.CreationalPatterns.Factory.entity.Account;
import br.com.CreationalPatterns.Factory.interfaces.IAccountFactory;
import br.com.CreationalPatterns.Factory.model.CurrentAccount;

public class CurrentAccountFactory implements IAccountFactory {
    @Override
    public Account create() {
        return new CurrentAccount();
    }
}
