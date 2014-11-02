/**
 * GetDataServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webTest;

public class GetDataServiceLocator extends org.apache.axis.client.Service implements webTest.GetDataService {

    public GetDataServiceLocator() {
    }


    public GetDataServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetDataServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GetData
    private java.lang.String GetData_address = "http://localhost:8080/WebServiceTest/services/GetData";

    public java.lang.String getGetDataAddress() {
        return GetData_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GetDataWSDDServiceName = "GetData";

    public java.lang.String getGetDataWSDDServiceName() {
        return GetDataWSDDServiceName;
    }

    public void setGetDataWSDDServiceName(java.lang.String name) {
        GetDataWSDDServiceName = name;
    }

    public webTest.GetData getGetData() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GetData_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGetData(endpoint);
    }

    public webTest.GetData getGetData(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            webTest.GetDataSoapBindingStub _stub = new webTest.GetDataSoapBindingStub(portAddress, this);
            _stub.setPortName(getGetDataWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGetDataEndpointAddress(java.lang.String address) {
        GetData_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (webTest.GetData.class.isAssignableFrom(serviceEndpointInterface)) {
                webTest.GetDataSoapBindingStub _stub = new webTest.GetDataSoapBindingStub(new java.net.URL(GetData_address), this);
                _stub.setPortName(getGetDataWSDDServiceName());
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
        if ("GetData".equals(inputPortName)) {
            return getGetData();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webTest", "GetDataService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webTest", "GetData"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GetData".equals(portName)) {
            setGetDataEndpointAddress(address);
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
