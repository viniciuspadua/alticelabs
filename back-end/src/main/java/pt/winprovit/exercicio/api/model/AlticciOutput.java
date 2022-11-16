package pt.winprovit.exercicio.api.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import pt.winprovit.exercicio.service.MockDB;

public class AlticciOutput {
    private NumberOutput current;

    private List<NumberOutput> previous;

    public AlticciOutput() {
    }

    public AlticciOutput(BigInteger n, BigInteger result) {
        current = new NumberOutput(n, result);
    }

    public NumberOutput getCurrent() {
        return current;
    }

    public void setCurrent(NumberOutput current) {
        this.current = current;
    }

    public List<NumberOutput> getPrevious() {
        previous = new ArrayList<>();
        MockDB.getAll().stream().sorted((a, b) -> a.getValue().compareTo(b.getValue()))
                .forEach(item -> previous.add(new NumberOutput(item.getKey(), item.getValue())));
        return previous;
    }

    public void setPrevious(List<NumberOutput> previous) {
        this.previous = previous;
    }
}
