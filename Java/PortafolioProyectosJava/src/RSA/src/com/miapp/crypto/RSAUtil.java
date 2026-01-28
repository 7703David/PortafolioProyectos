package com.miapp.crypto;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * Utilidad para generación de claves RSA, cifrado y descifrado.
 */
public class RSAUtil {

    /**
     * Par de claves RSA.
     */
    public static class KeyPair {
        public final BigInteger n; // módulo
        public final BigInteger e; // exponente público
        public final BigInteger d; // exponente privado

        public KeyPair(BigInteger n, BigInteger e, BigInteger d) {
            this.n = n;
            this.e = e;
            this.d = d;
        }
    }

    private static final SecureRandom random = new SecureRandom();

    /**
     * Genera un par de claves RSA.
     * @param bitLength longitud en bits de cada primo p y q (recomendado >= 512).
     * @return objeto KeyPair con n, e y d.
     */
    public static KeyPair generateKeyPair(int bitLength) {
        // 1. Generar primos p y q
        BigInteger p = BigInteger.probablePrime(bitLength, random);
        BigInteger q = BigInteger.probablePrime(bitLength, random);
        // 2. Calcular n = p * q
        BigInteger n = p.multiply(q);
        // 3. Calcular phi = (p-1)*(q-1)
        BigInteger phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        // 4. Elegir e coprimo con phi
        BigInteger e;
        do {
            e = new BigInteger(bitLength * 2, random);
        } while (e.compareTo(BigInteger.ONE) <= 0 
                || e.compareTo(phi) >= 0 
                || !e.gcd(phi).equals(BigInteger.ONE));
        // 5. Calcular d = e^(-1) mod phi
        BigInteger d = e.modInverse(phi);
        return new KeyPair(n, e, d);
    }

    /**
     * Cifra un mensaje representado como BigInteger.
     * @param message mensaje como BigInteger (0 <= message < n)
     * @param e exponente público
     * @param n módulo
     * @return texto cifrado
     */
    public static BigInteger encrypt(BigInteger message, BigInteger e, BigInteger n) {
        return message.modPow(e, n);
    }

    /**
     * Descifra un mensaje representado como BigInteger.
     * @param ciphertext texto cifrado
     * @param d exponente privado
     * @param n módulo
     * @return mensaje original como BigInteger
     */
    public static BigInteger decrypt(BigInteger ciphertext, BigInteger d, BigInteger n) {
        return ciphertext.modPow(d, n);
    }

    /**
     * Convierte un string a BigInteger usando codificación UTF-8.
     */
    public static BigInteger stringToBigInteger(String text) {
        return new BigInteger(text.getBytes());
    }

    /**
     * Convierte un BigInteger a string usando codificación UTF-8.
     */
    public static String bigIntegerToString(BigInteger bigInt) {
        return new String(bigInt.toByteArray());
    }

    // Método de prueba básico
    public static void main(String[] args) {
        // Generar claves
        KeyPair keys = generateKeyPair(512);
        System.out.println("n: " + keys.n);
        System.out.println("e: " + keys.e);
        System.out.println("d: " + keys.d);

        // Mensaje de prueba
        String mensaje = "Hola RSA";
        BigInteger m = stringToBigInteger(mensaje);
        // Encriptar
        BigInteger c = encrypt(m, keys.e, keys.n);
        System.out.println("Cifrado: " + c);
        // Descifrar
        BigInteger m2 = decrypt(c, keys.d, keys.n);
        String mensajeDescifrado = bigIntegerToString(m2);
        System.out.println("Descifrado: " + mensajeDescifrado);
    }
}
