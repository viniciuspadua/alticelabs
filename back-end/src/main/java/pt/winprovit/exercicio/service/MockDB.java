package pt.winprovit.exercicio.service;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

import pt.winprovit.exercicio.exception.AlticciException;

public class MockDB {

    private static HashMap<BigInteger, BigInteger> mockBD;

    private static void getInstance() {
        if (mockBD == null) {
            mockBD = new HashMap<>();
        }
    }

    public static BigInteger getNumber(BigInteger n) throws AlticciException {
        getInstance();

        if (mockBD.containsKey(n)) {
            return mockBD.get(n);
        }
        throw new AlticciException("Não encontrado");
    }

    public static void insertNumber(BigInteger n, BigInteger result) {
        getInstance();

        if (!mockBD.containsKey(n)) {
            mockBD.put(n, result);
        }
    }

    public static Set<Entry<BigInteger, BigInteger>> getAll() {
        getInstance();
        return mockBD.entrySet();
    }
}