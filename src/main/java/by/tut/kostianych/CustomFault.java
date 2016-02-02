package by.tut.kostianych;;

import javax.xml.ws.WebFault;

/**
 * Custom fault
 */
@WebFault(name = "CustomFault", faultBean = "by.tut.kostianych.FaultBean", targetNamespace = "http://kostianych.tut.by")
public class CustomFault extends RuntimeException {

    private static final long serialVersionUID = 1719842637512461073L;

    private FaultBean faultBean;

    public CustomFault() {
        super();
    }

    public CustomFault(String message, FaultBean faultBean, Throwable cause) {
        super(message, cause);
        this.faultBean = faultBean;
    }

    public CustomFault(String message, FaultBean faultBean) {
        super(message);
        this.faultBean = faultBean;
    }

    public FaultBean getFaultInfo() {
        return faultBean;
    }
}
