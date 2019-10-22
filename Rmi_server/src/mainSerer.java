import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class mainSerer {

	public static void main(String[] args)  {
		try {
			System.err.println(" Server : COnstruction de l implimentation");
			LocateRegistry.createRegistry(1099);
			Hello rev = new Helloimplimentation();
			System.out.println("object reserver lie dans le Rmi Registriy");
			Context nomContexte = new InitialContext();
			
			nomContexte.rebind("rmi:Hello", rev);
			System.out.println("Attente des invocations des clients ...");
		} catch (Exception e) {
System.out.println("Erreur de liaison de l'object Reveres");
e.printStackTrace();}
	}

}
