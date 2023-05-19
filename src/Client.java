import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        HelloServic obj= (HelloServic) Naming.lookup("rmi://localhost:1234/hello");
        System.out.println(obj.printMsg());
    }
}
