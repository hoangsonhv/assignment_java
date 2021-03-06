package com.example.assignment.controller.account;

import com.example.assignment.entity.Account;
import com.example.assignment.entity.PasswordHandler;
import com.example.assignment.model.AccountModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Calendar;

public class RegisterServlet extends HttpServlet {

    private AccountModel accountModel = new AccountModel();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/register.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String fullname = req.getParameter("fullname");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        Account account = new Account();
        account.setUsername(username);
        account.setFullName(fullname);
        String salt = PasswordHandler.generateSalt();
        account.setSalt(salt);

        String passwordHash = PasswordHandler.getMd5(password, salt);
        account.setPasswordHash(passwordHash);
        account.setStatus(1);
        account.setCreateAt(Calendar.getInstance().getTime().toString());
        boolean result = accountModel.save(account);
        if(result){
            resp.sendRedirect("/login");
        }else {
            resp.getWriter().println("Errors!");
        }
    }
}
