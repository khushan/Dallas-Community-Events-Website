/**
 * SendRequestServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webTest;

public class SendRequestServiceLocator extends org.apache.axis.client.Service implements webTest.SendRequestService {

    public SendRequestServiceLocator() {
    }


    public SendRequestServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SendRequestServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for sendRequest
    private java.lang.String sendRequest_address = "http://localhost:8080/WebServiceTest/services/sendRequest";

    public java.lang.String getsendRequestAddress() {
        return sendRequest_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String sendRequestWSDDServiceName = "sendRequest";

    public java.lang.String getsendRequestWSDDServiceName() {
        return sendRequestWSDDServiceName;
    }

    public void setsendRequestWSDDServiceName(java.lang.String name) {
        sendRequestWSDDServiceName = name;
    }

    public webTest.SendRequest getsendRequest() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(sendRequest_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getsendRequest(endpoint);
    }

    public webTest.SendRequest getsendRequest(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            webTest.SendRequestSoapBindingStub _stub = new webTest.SendRequestSoapBindingStub(portAddress, this);
            _stub.setPortName(getsendRequestWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setsendRequestEndpointAddress(java.lang.String address) {
        sendRequest_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (webTest.SendRequest.class.isAssignableFrom(serviceEndpointInterface)) {
                webTest.SendRequestSoapBindingStub _stub = new webTest.SendRequestSoapBindingStub(new java.net.URL(sendRequest_address), this);
                _stub.setPortName(getsendRequestWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("sendRequest".equals(inputPortName)) {
            return getsendRequest();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webTest", "sendRequestService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webTest", "sendRequest"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("sendRequest".equals(portName)) {
            setsendRequestEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
