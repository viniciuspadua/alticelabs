package pt.winprovit.exercicio.api.controller;

import java.math.BigInteger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pt.winprovit.exercicio.api.model.AlticciOutput;
import pt.winprovit.exercicio.service.AlticciService;

@Path("/alticci")
public class AlticciController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{n}")
    public AlticciOutput hello(BigInteger n) {
        if (n.compareTo(BigInteger.valueOf(0)) >= 0) {
            BigInteger resul = AlticciService.getNumber(n);
            return new AlticciOutput(n, resul);
        }

        return new AlticciOutput(BigInteger.valueOf(-1), BigInteger.valueOf(-1));
    }
}