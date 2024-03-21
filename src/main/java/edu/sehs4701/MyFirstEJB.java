package edu.sehs4701;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;

@Stateless
@LocalBean
public class MyFirstEJB implements MyFirstEJBLocal {
    public MyFirstEJB() {
    }

    public String PassMessage(String message) {
        return "Hi SEHS4701 students, " + message + "! This is a message from the EJB.";
    }
}
