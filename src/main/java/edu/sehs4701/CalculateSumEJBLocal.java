package edu.sehs4701;

import jakarta.ejb.Local;

@Local
public interface CalculateSumEJBLocal {

    String SumByEJB(float num1, float num2);

    boolean isInteger(String str);

    boolean isNumeric(String str);
}
