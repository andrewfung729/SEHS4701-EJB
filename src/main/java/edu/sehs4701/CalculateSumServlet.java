package edu.sehs4701;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateSum", value = "/CalculateSum")
public class CalculateSumServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @EJB
    private CalculateSumEJBLocal calculateSumEJB;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculateSumServlet() {
        super();
    }


    /**
     * @see HttpServlet#doGet(HttpServletRequest, HttpServletResponse)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.println("We only support two numeric parameters num1 and num2!");
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        pw.println("Your input was: num1 = " + num1 + " and num2 = " + num2);

        if (calculateSumEJB.isNumeric(num1) && calculateSumEJB.isNumeric(num2)) {
            pw.println(calculateSumEJB.SumByEJB(Float.parseFloat(num1), Float.parseFloat(num2)));
        } else {
            pw.println("Error: Both inputs must be numeric.");
        }
    }
}