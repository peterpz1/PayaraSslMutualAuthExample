package org.peterpz.payara.test;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "/webservice/soap/TestService")
public class TestService {
    @WebMethod
    public String hello() {
        return "hello";
    }
}
