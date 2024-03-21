package edu.sehs4701;

import jakarta.ejb.Local;

@Local
public interface MyFirstEJBLocal {
    public String PassMessage(String message);
}
