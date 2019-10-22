import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Helloimplimentation extends UnicastRemoteObject  implements Hello{

	protected Helloimplimentation() throws RemoteException {
		super();
	
	}

	@Override
	public String HelloRmi(String nom) throws RemoteException {
	
		return "hello"+nom;
	}

}
