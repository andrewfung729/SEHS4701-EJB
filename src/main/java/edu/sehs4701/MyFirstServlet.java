package edu.sehs4701;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyFirstServlet", value = "/MyFirstServlet")
public class MyFirstServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @EJB
    private MyFirstEJBLocal sayGreetings;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyFirstServlet() {
        super();
    }


    /**
     * @see HttpServlet#doGet(HttpServletRequest, HttpServletResponse)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.println("Client parameter = " + request.getParameter("greeting"));
        pw.println("Message from EJB = " + sayGreetings.PassMessage(request.getParameter("greeting")));
    }
}