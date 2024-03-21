package edu.sehs4701;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;

@Stateless
@LocalBean
public class CalculateSumEJB implements CalculateSumEJBLocal {
    public CalculateSumEJB() {
    }

    public String SumByEJB(int num1, int num2) {
        return "Sum of " + num1 + " and " + num2 + " is " + (num1 + num2);
    }

    public boolean isInteger(String str) {
        return str != null && str.matches("\\d+");
    }
}
