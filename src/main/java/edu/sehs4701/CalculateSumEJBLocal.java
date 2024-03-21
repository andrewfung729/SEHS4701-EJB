package edu.sehs4701;

import jakarta.ejb.Local;

@Local
public interface CalculateSumEJBLocal {

    String SumByEJB(int num1, int num2);

    boolean isInteger(String str);
}
