package OOP.Restore.impl;

import OOP.Restore.VerificationCodeGenerator;

import java.util.Random;

public final class DefaultNumberVerificationCodeGenerator implements VerificationCodeGenerator {

    private final Random random = new Random();

    private final int length;

    public DefaultNumberVerificationCodeGenerator(int length) {
        this.length = length;
    }
    public DefaultNumberVerificationCodeGenerator() {
        this(20);
    }

    @Override
    public String generate() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(random.nextInt(10));
        }
        return stringBuilder.toString();
    }
}
