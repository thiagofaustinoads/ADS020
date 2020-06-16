
import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thiag
 */
public interface CalculadoraRemota extends Remote {
    
     public int somar(int a, int b) throws RemoteException;
     public int subtrair(int a, int b) throws RemoteException;
     public int multiplicar(int a, int b) throws RemoteException;
     public int dividir(int a, int b) throws RemoteException;
     

    
}
