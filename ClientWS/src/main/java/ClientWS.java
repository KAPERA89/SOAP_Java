import proxy.BankService;
import proxy.BankWs;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BankService stub = new BankWs().getBankServicePort();
        System.out.println(stub.convert(10));
        Compte cp1 =  stub.getAccount(1);
        System.out.println(cp1.getCode());
        System.out.println(cp1.getSolde());
    }
}
