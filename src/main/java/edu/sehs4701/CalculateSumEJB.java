package edu.sehs4701;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;

@Stateless
@LocalBean
public class CalculateSumEJB implements CalculateSumEJBLocal {
    public CalculateSumEJB() {
    }

    public String SumByEJB(float num1, float num2) {
        return "Sum of " + num1 + " and " + num2 + " is " + (num1 + num2);
    }

    public boolean isInteger(String str) {
        return str != null && str.matches("\\d+");
    }

    public boolean isNumeric(String str) {
        return str != null && str.matches("-?\\d+(\\.\\d+)?");
    }

}
