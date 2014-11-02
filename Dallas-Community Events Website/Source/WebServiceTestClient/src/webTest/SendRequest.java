/**
 * SendRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webTest;

public interface SendRequest extends java.rmi.Remote {
    public java.lang.String decrypt(java.lang.String strToDecrypt) throws java.rmi.RemoteException;
    public java.lang.String encrypt(java.lang.String strToEncrypt) throws java.rmi.RemoteException;
    public java.lang.String acceptRequest(java.lang.String name, java.lang.String address, java.lang.String contact, java.lang.String email, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
}
