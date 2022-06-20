package C80DF_StaticEJBFieldShouldBeFinal;

import javax.ejb.*;
import java.rmi.RemoteException;

public class StaticEJBFieldShouldBeFinal_BAD {
    static class SomeEJB implements EJBLocalHome, EJBObject {
        private static int CountA;

        @Override
        public void remove(Object o) throws RemoveException, EJBException {

        }

        @Override
        public EJBHome getEJBHome() throws RemoteException {
            return null;
        }

        @Override
        public Object getPrimaryKey() throws RemoteException {
            return null;
        }

        @Override
        public void remove() throws RemoteException, RemoveException {

        }

        @Override
        public Handle getHandle() throws RemoteException {
            return null;
        }

        @Override
        public boolean isIdentical(EJBObject ejbObject) throws RemoteException {
            return false;
        }
    }
}
