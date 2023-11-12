package rmiservice;
import rmiservice.IConversion;

import java.rmi.RemoteException;
public class ConversionImpl implements IConversion {
    @Override
    public double convertirMontant(double mt)throws RemoteException {
        return mt*3.5;
    }
}
