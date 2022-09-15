package OOP.Restore;

public interface EmailService {
    void SendPasswordResetEmail(String email, String code);
}
