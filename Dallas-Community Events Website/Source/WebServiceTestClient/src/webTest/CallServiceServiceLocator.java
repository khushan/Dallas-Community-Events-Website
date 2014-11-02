/**
 * CallServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webTest;

public class CallServiceServiceLocator extends org.apache.axis.client.Service implements webTest.CallServiceService {

    public CallServiceServiceLocator() {
    }


    public CallServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CallServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CallService
    private java.lang.String CallService_address = "http://localhost:8080/WebServiceTest/services/CallService";

    public java.lang.String getCallServiceAddress() {
        return CallService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CallServiceWSDDServiceName = "CallService";

    public java.lang.String getCallServiceWSDDServiceName() {
        return CallServiceWSDDServiceName;
    }

    public void setCallServiceWSDDServiceName(java.lang.String name) {
        CallServiceWSDDServiceName = name;
    }

    public webTest.CallService getCallService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CallService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCallService(endpoint);
    }

    public webTest.CallService getCallService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            webTest.CallServiceSoapBindingStub _stub = new webTest.CallServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCallServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCallServiceEndpointAddress(java.lang.String address) {
        CallService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (webTest.CallService.class.isAssignableFrom(serviceEndpointInterface)) {
                webTest.CallServiceSoapBindingStub _stub = new webTest.CallServiceSoapBindingStub(new java.net.URL(CallService_address), this);
                _stub.setPortName(getCallServiceWSDDServiceName());
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
        if ("CallService".equals(inputPortName)) {
            return getCallService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webTest", "CallServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webTest", "CallService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CallService".equals(portName)) {
            setCallServiceEndpointAddress(address);
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
