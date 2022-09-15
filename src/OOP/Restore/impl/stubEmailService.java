package OOP.Restore.impl;

import OOP.Restore.EmailService;

public final class stubEmailService implements EmailService {
    @Override
    public void SendPasswordResetEmail(String email, String code) {
        System.out.println("Send code= " + code + " to " + email + " email!");
    }
}
