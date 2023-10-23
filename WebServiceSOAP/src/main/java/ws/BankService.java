package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BankWs")
public class BankService  {
    @WebMethod(operationName = "Convert")
    public double Convert(@WebParam(name = "montant") double montant){
        return montant*10.89;
    }

    @WebMethod
    public Compte getAccount(@WebParam(name = "code") int code){
        return new Compte(code, Math.random()*7000, new Date());
    }

    @WebMethod
    public List<Compte> getAllAccounts(){
        return List.of(
                new Compte(1, Math.random()*7000, new Date()),
                new Compte(2, Math.random()*8000, new Date()),
                new Compte(3, Math.random()*9000, new Date()),
                new Compte(4, Math.random()*10000, new Date())
        );
    }
}
