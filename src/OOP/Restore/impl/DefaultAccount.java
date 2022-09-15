package OOP.Restore.impl;

import OOP.Restore.Account;

public final class DefaultAccount implements Account {
    private final String email;
    private String code;
    private final boolean active;

    public DefaultAccount(String email, boolean active) {
        this.active = active;
        this.email = email;
    }

    @Override
    public boolean isNotActive() {
        return active;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    public String getEmail() {
        return email;
    }
}
