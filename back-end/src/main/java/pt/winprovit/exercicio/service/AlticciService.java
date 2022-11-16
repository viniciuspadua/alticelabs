package pt.winprovit.exercicio.service;

import java.math.BigInteger;

import pt.winprovit.exercicio.exception.AlticciException;

public class AlticciService {

    public static BigInteger getNumber(BigInteger n) {

        try {
            BigInteger result = MockDB.getNumber(n);
            return result;
        } catch (AlticciException e) {
        }

        if (n.intValue() == 0) {
            return BigInteger.valueOf(0);
        } else if (n.intValue() == 1 || n.intValue() == 2) {
            return BigInteger.valueOf(1);
        }

        BigInteger n3Aux = n.subtract(BigInteger.valueOf(3));
        BigInteger n3 = getNumber(n3Aux);
        MockDB.insertNumber(n3Aux, n3);

        BigInteger n2Aux = n.subtract(BigInteger.valueOf(2));
        BigInteger n2 = getNumber(n2Aux);
        MockDB.insertNumber(n2Aux, n2);

        BigInteger sum = n2.add(n3);
        MockDB.insertNumber(n, sum);
        return sum;
    }
}