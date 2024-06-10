package org.example.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "PageServlet", value = "/page-servlet")

public class PageServlet extends HttpServlet {

    private String nom;

    @Override
    public void init() throws ServletException {
        nom = "Page servlet";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setAttribute("nom", nom);
        getServletContext().getRequestDispatcher("/page.jsp").forward(req, res);
    }

    @Override
    public void destroy() {
    }
}
