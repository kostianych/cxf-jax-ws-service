
package by.tut.kostianych;

import javax.jws.WebService;

@WebService(endpointInterface = "by.tut.kostianych.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) throws CustomFault {
        FaultBean faultBean = new FaultBean();
        faultBean.setCustomField("some value");

        if ("John".equals(text)) {
            throw new CustomFault("Error occured", faultBean);
        } else {
            return "Hello " + text;
        }

    }
}

