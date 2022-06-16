package C8049_MDBAndSessionBeanNamingConv;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import java.rmi.RemoteException;

public class MDBAndSessionBeanNamingConvention_GOOD {
    public class SomeBean implements SessionBean {
        @Override
        public void setSessionContext(SessionContext sessionContext) throws EJBException, RemoteException {

        }

        @Override
        public void ejbRemove() throws EJBException, RemoteException {

        }

        @Override
        public void ejbActivate() throws EJBException, RemoteException {

        }

        @Override
        public void ejbPassivate() throws EJBException, RemoteException {

        }
    }
}
