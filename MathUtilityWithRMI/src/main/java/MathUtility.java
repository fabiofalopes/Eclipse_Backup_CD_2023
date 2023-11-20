
import java.rmi.*;
import java.rmi.RemoteException;

import javax.jws.WebService;

@WebService(targetNamespace = "http://utility.math.com/", portName = "MathUtilityPort", serviceName = "MathUtilityService")
public class MathUtility {
	
    public int addIntegers(int firstNum, int secondNum) throws RemoteException {
    	int result = 0;
    	try {
    		String addServerURL = "rmi://172.16.191.1/AddServer";
            AddServerIntf addServerIntf = (AddServerIntf)Naming.lookup(addServerURL);	
            result = addServerIntf.add(firstNum, secondNum);
    	}
    	catch(Exception e) {
    	      System.out.println("Exception: " + e);
    	}
        return result;
    }   
    
    public int factorial(int n) {
        int result = 1;        
        for (int i = 1; i <= n; i++) {  
            result = result * i;
        }        
        return result;
    }
}
