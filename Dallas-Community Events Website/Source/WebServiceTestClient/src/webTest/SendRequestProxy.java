package webTest;

public class SendRequestProxy implements webTest.SendRequest {
  private String _endpoint = null;
  private webTest.SendRequest sendRequest = null;
  
  public SendRequestProxy() {
    _initSendRequestProxy();
  }
  
  public SendRequestProxy(String endpoint) {
    _endpoint = endpoint;
    _initSendRequestProxy();
  }
  
  private void _initSendRequestProxy() {
    try {
      sendRequest = (new webTest.SendRequestServiceLocator()).getsendRequest();
      if (sendRequest != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sendRequest)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sendRequest)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sendRequest != null)
      ((javax.xml.rpc.Stub)sendRequest)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webTest.SendRequest getSendRequest() {
    if (sendRequest == null)
      _initSendRequestProxy();
    return sendRequest;
  }
  
  public java.lang.String decrypt(java.lang.String strToDecrypt) throws java.rmi.RemoteException{
    if (sendRequest == null)
      _initSendRequestProxy();
    return sendRequest.decrypt(strToDecrypt);
  }
  
  public java.lang.String encrypt(java.lang.String strToEncrypt) throws java.rmi.RemoteException{
    if (sendRequest == null)
      _initSendRequestProxy();
    return sendRequest.encrypt(strToEncrypt);
  }
  
  public java.lang.String acceptRequest(java.lang.String name, java.lang.String address, java.lang.String contact, java.lang.String email, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (sendRequest == null)
      _initSendRequestProxy();
    return sendRequest.acceptRequest(name, address, contact, email, username, password);
  }
  
  
}