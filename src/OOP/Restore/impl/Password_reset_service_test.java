package OOP.Restore.impl;

import OOP.Restore.Password_reset_service;

final class Password_reset_service_test {

    private final Password_reset_service service;

    public Password_reset_service_test(Password_reset_service service) {
        this.service = service;
    }

    public void test(String email) {
        System.out.println(email + " -> " + service.reset(email));
    }

    public static void main(String[] args) {
        Password_reset_service_test password_reset_service_test = new Password_reset_service_test(new Password_reset_service(
                new FromRAMaccountRepository(),
                new DisplayAccountNotFoundByEmailHandler(),
                new DisableAccountNotActiveHandler(),
                new DefaultNumberVerificationCodeGenerator(6),
                new stubEmailService()));
        password_reset_service_test.test("vavilovnik00@mail.ru");
        password_reset_service_test.test("vavilovnik002@mail.ru");
        password_reset_service_test.test("vavilovnik002@mail.ru");
    }
}
