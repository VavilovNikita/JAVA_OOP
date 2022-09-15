package OOP.Restore.impl;

import OOP.Restore.Account;
import OOP.Restore.AccountRepository;

public final class FromRAMaccountRepository implements AccountRepository {

    private final DefaultAccount[] accounts = {
            new DefaultAccount("vavilovnik002@mail.ru",true),
            new DefaultAccount("vavilovnik00@mail.ru",false)};

    @Override
    public Account findByEmail(String email) {
        for(DefaultAccount account : accounts)
            if(email.equals(account.getEmail())){
                return account;
            }else{
                return null;
            }
        return null;
    }

    @Override
    public void update(Account account) {

    }
}
