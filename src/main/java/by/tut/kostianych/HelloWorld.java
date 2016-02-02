package by.tut.kostianych;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text) throws CustomFault;
}

