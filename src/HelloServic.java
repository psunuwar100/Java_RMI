import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloServic extends Remote {
    public String  printMsg() throws RemoteException;
}
