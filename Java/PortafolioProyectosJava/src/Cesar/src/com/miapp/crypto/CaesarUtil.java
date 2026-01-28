package com.miapp.crypto;

/**
 * Utilidad para cifrado y descifrado con el método César.
 */
public class CaesarUtil {
    public static String encrypt(String plain, int shift) {
        StringBuilder cipher = new StringBuilder();
        shift = ((shift % 26) + 26) % 26;
        for (char c : plain.toCharArray()) {
            if (Character.isUpperCase(c)) {
                cipher.append((char)('A' + (c - 'A' + shift) % 26));
            } else if (Character.isLowerCase(c)) {
                cipher.append((char)('a' + (c - 'a' + shift) % 26));
            } else {
                cipher.append(c);
            }
        }
        return cipher.toString();
    }

    public static String decrypt(String cipher, int shift) {
        return encrypt(cipher, 26 - ((shift % 26) + 26) % 26);
    }
}