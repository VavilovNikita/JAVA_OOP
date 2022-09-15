package OOP.Restore.impl;

import OOP.Restore.Account;
import OOP.Restore.AccountNotActiveHandler;

public final class DisableAccountNotActiveHandler implements AccountNotActiveHandler {
    @Override
    public String handle(Account account) {
        return null;
    }
}
