package dev.practice.order.common.util;

import org.apache.commons.lang3.RandomStringUtils;

public class TokenGenerator {
    private static final int TOKEN_LENGTH = 20;

    public static String randonCharacter(int length) {
        return RandomStringUtils.randomAlphanumeric(length);
    }

    public static String randonCharacterWithPrefix(String prefix) {
        return prefix + randonCharacter(TOKEN_LENGTH - prefix.length());
    }
}
