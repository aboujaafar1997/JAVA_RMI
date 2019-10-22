import java.rmi.RemoteException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Clientrmi {

	public static void main(String[] args) throws RemoteException {
	try {
		Context context = new InitialContext();
		Hello rev = (Hello) context.lookup("rmi://localhost:1099/Hello");
		System.out.println("othmane");
		System.out.println(rev.HelloRmi("bla"));
		
	} catch (NamingException e) {
		e.printStackTrace();
	}

	}

}
