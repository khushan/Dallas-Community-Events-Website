package webTest;

public class CallServiceProxy implements webTest.CallService {
  private String _endpoint = null;
  private webTest.CallService callService = null;
  
  public CallServiceProxy() {
    _initCallServiceProxy();
  }
  
  public CallServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCallServiceProxy();
  }
  
  private void _initCallServiceProxy() {
    try {
      callService = (new webTest.CallServiceServiceLocator()).getCallService();
      if (callService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)callService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)callService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (callService != null)
      ((javax.xml.rpc.Stub)callService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webTest.CallService getCallService() {
    if (callService == null)
      _initCallServiceProxy();
    return callService;
  }
  
  public void main(java.lang.String[] args) throws java.rmi.RemoteException{
    if (callService == null)
      _initCallServiceProxy();
    callService.main(args);
  }
  
  public java.lang.String hello(java.lang.String name) throws java.rmi.RemoteException{
    if (callService == null)
      _initCallServiceProxy();
    return callService.hello(name);
  }
  
  public boolean signUp(java.lang.String firstName, java.lang.String lastName, java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException{
    if (callService == null)
      _initCallServiceProxy();
    return callService.signUp(firstName, lastName, userName, password);
  }
  
  public java.lang.String[] ajaxCall(java.lang.String country) throws java.rmi.RemoteException{
    if (callService == null)
      _initCallServiceProxy();
    return callService.ajaxCall(country);
  }
  
  public java.lang.String[] fetchPickupDetails() throws java.rmi.RemoteException{
    if (callService == null)
      _initCallServiceProxy();
    return callService.fetchPickupDetails();
  }
  
  public java.lang.String addCartDetails(java.lang.String id1, int q1, float subTot1, java.lang.String id2, int q2, float subTot2, java.lang.String id3, int q3, float subTot3, float total, java.lang.String firstName, java.lang.String lastName, java.lang.String country, java.lang.String state, java.lang.String city, java.lang.String address1, java.lang.String address2, java.lang.String cardType, java.lang.String cardNo, int securityNo, int expiryMonth, int expiryYear) throws java.rmi.RemoteException{
    if (callService == null)
      _initCallServiceProxy();
    return callService.addCartDetails(id1, q1, subTot1, id2, q2, subTot2, id3, q3, subTot3, total, firstName, lastName, country, state, city, address1, address2, cardType, cardNo, securityNo, expiryMonth, expiryYear);
  }
  
  public boolean insertPickupDetails(java.lang.String firstName, java.lang.String lastName, java.lang.String state, java.lang.String city, java.lang.String address1, java.lang.String address2, java.lang.String datetime, java.lang.String contact, java.lang.String message) throws java.rmi.RemoteException{
    if (callService == null)
      _initCallServiceProxy();
    return callService.insertPickupDetails(firstName, lastName, state, city, address1, address2, datetime, contact, message);
  }
  
  public java.lang.String addSubscriptionDetails(java.lang.String userName, java.lang.String id1, int q1, float subTot1, java.lang.String id2, int q2, float subTot2, float total, java.lang.String firstName, java.lang.String lastName, java.lang.String country, java.lang.String state, java.lang.String city, java.lang.String address1, java.lang.String address2, java.lang.String cardType, java.lang.String cardNo, int securityNo, int expiryMonth, int expiryYear) throws java.rmi.RemoteException{
    if (callService == null)
      _initCallServiceProxy();
    return callService.addSubscriptionDetails(userName, id1, q1, subTot1, id2, q2, subTot2, total, firstName, lastName, country, state, city, address1, address2, cardType, cardNo, securityNo, expiryMonth, expiryYear);
  }
  
  
}