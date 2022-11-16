package pt.winprovit.exercicio.api.model;

import java.math.BigInteger;

public class NumberOutput {
    private BigInteger n;

    private BigInteger result;

    public NumberOutput() {
    }

    public NumberOutput(BigInteger n, BigInteger result) {
        this.n = n;
        this.result = result;
    }

    public BigInteger getN() {
        return n;
    }

    public void setN(BigInteger n) {
        this.n = n;
    }

    public BigInteger getResult() {
        return result;
    }

    public void setResult(BigInteger result) {
        this.result = result;
    }

}
