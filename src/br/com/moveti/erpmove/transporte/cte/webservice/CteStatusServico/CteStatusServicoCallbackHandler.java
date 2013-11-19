/**
 * CteStatusServicoCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */
package br.com.moveti.erpmove.transporte.cte.webservice.CteStatusServico;

/**
 *  CteStatusServicoCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class CteStatusServicoCallbackHandler {

    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public CteStatusServicoCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public CteStatusServicoCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for cteStatusServicoCT method
     * override this method for handling normal response from cteStatusServicoCT operation
     */
    public void receiveResultcteStatusServicoCT(
            br.com.moveti.erpmove.transporte.cte.webservice.CteStatusServico.CteStatusServicoStub.CteStatusServicoCTResult result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from cteStatusServicoCT operation
     */
    public void receiveErrorcteStatusServicoCT(java.lang.Exception e) {
    }
}
