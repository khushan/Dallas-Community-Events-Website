package webTest;

public class HelloWorldProxy implements webTest.HelloWorld {
  private String _endpoint = null;
  private webTest.HelloWorld helloWorld = null;
  
  public HelloWorldProxy() {
    _initHelloWorldProxy();
  }
  
  public HelloWorldProxy(String endpoint) {
    _endpoint = endpoint;
    _initHelloWorldProxy();
  }
  
  private void _initHelloWorldProxy() {
    try {
      helloWorld = (new webTest.HelloWorldServiceLocator()).getHelloWorld();
      if (helloWorld != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)helloWorld)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)helloWorld)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (helloWorld != null)
      ((javax.xml.rpc.Stub)helloWorld)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webTest.HelloWorld getHelloWorld() {
    if (helloWorld == null)
      _initHelloWorldProxy();
    return helloWorld;
  }
  
  public java.lang.String decrypt(java.lang.String strToDecrypt) throws java.rmi.RemoteException{
    if (helloWorld == null)
      _initHelloWorldProxy();
    return helloWorld.decrypt(strToDecrypt);
  }
  
  public boolean insertLoginData(java.lang.String user, java.lang.String pwd) throws java.rmi.RemoteException{
    if (helloWorld == null)
      _initHelloWorldProxy();
    return helloWorld.insertLoginData(user, pwd);
  }
  
  public void insertHostEventData(java.lang.String eventName, java.lang.String eventDesc, java.lang.String eventVenue, java.lang.String eventDate, java.lang.String eventTime) throws java.rmi.RemoteException{
    if (helloWorld == null)
      _initHelloWorldProxy();
    helloWorld.insertHostEventData(eventName, eventDesc, eventVenue, eventDate, eventTime);
  }
  
  public java.lang.String sayHello(java.lang.String name) throws java.rmi.RemoteException{
    if (helloWorld == null)
      _initHelloWorldProxy();
    return helloWorld.sayHello(name);
  }
  
  public void sendEmail(java.lang.String email, java.lang.String eventName) throws java.rmi.RemoteException{
    if (helloWorld == null)
      _initHelloWorldProxy();
    helloWorld.sendEmail(email, eventName);
  }
  
  public java.lang.String[] getEventsData() throws java.rmi.RemoteException{
    if (helloWorld == null)
      _initHelloWorldProxy();
    return helloWorld.getEventsData();
  }
  
  public void updateRegistrationData(java.lang.String[] eventName) throws java.rmi.RemoteException{
    if (helloWorld == null)
      _initHelloWorldProxy();
    helloWorld.updateRegistrationData(eventName);
  }
  
  public void insertRegisterData(java.lang.String user, java.lang.String pwd, java.lang.String address, java.lang.String email, java.lang.String contact, java.lang.String[] eventName, java.lang.String date, java.lang.String note) throws java.rmi.RemoteException{
    if (helloWorld == null)
      _initHelloWorldProxy();
    helloWorld.insertRegisterData(user, pwd, address, email, contact, eventName, date, note);
  }
  
  
}