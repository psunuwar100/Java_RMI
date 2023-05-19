import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

    public class HelloServant extends UnicastRemoteObject implements HelloServic{
        protected HelloServant() throws RemoteException {
            super();
        }

        @Override
        public String printMsg()  throws RemoteException{
            return "hello";
        }
    }

