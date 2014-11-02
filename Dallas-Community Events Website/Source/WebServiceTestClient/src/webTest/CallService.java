/**
 * CallService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webTest;

public interface CallService extends java.rmi.Remote {
    public void main(java.lang.String[] args) throws java.rmi.RemoteException;
    public java.lang.String hello(java.lang.String name) throws java.rmi.RemoteException;
    public boolean signUp(java.lang.String firstName, java.lang.String lastName, java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.String[] ajaxCall(java.lang.String country) throws java.rmi.RemoteException;
    public java.lang.String[] fetchPickupDetails() throws java.rmi.RemoteException;
    public java.lang.String addCartDetails(java.lang.String id1, int q1, float subTot1, java.lang.String id2, int q2, float subTot2, java.lang.String id3, int q3, float subTot3, float total, java.lang.String firstName, java.lang.String lastName, java.lang.String country, java.lang.String state, java.lang.String city, java.lang.String address1, java.lang.String address2, java.lang.String cardType, java.lang.String cardNo, int securityNo, int expiryMonth, int expiryYear) throws java.rmi.RemoteException;
    public boolean insertPickupDetails(java.lang.String firstName, java.lang.String lastName, java.lang.String state, java.lang.String city, java.lang.String address1, java.lang.String address2, java.lang.String datetime, java.lang.String contact, java.lang.String message) throws java.rmi.RemoteException;
    public java.lang.String addSubscriptionDetails(java.lang.String userName, java.lang.String id1, int q1, float subTot1, java.lang.String id2, int q2, float subTot2, float total, java.lang.String firstName, java.lang.String lastName, java.lang.String country, java.lang.String state, java.lang.String city, java.lang.String address1, java.lang.String address2, java.lang.String cardType, java.lang.String cardNo, int securityNo, int expiryMonth, int expiryYear) throws java.rmi.RemoteException;
}
