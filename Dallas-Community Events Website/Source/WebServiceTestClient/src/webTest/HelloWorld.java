/**
 * HelloWorld.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webTest;

public interface HelloWorld extends java.rmi.Remote {
    public java.lang.String decrypt(java.lang.String strToDecrypt) throws java.rmi.RemoteException;
    public boolean insertLoginData(java.lang.String user, java.lang.String pwd) throws java.rmi.RemoteException;
    public void insertHostEventData(java.lang.String eventName, java.lang.String eventDesc, java.lang.String eventVenue, java.lang.String eventDate, java.lang.String eventTime) throws java.rmi.RemoteException;
    public java.lang.String sayHello(java.lang.String name) throws java.rmi.RemoteException;
    public void sendEmail(java.lang.String email, java.lang.String eventName) throws java.rmi.RemoteException;
    public java.lang.String[] getEventsData() throws java.rmi.RemoteException;
    public void updateRegistrationData(java.lang.String[] eventName) throws java.rmi.RemoteException;
    public void insertRegisterData(java.lang.String user, java.lang.String pwd, java.lang.String address, java.lang.String email, java.lang.String contact, java.lang.String[] eventName, java.lang.String date, java.lang.String note) throws java.rmi.RemoteException;
}
