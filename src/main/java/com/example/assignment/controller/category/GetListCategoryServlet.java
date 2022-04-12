package com.example.assignment.controller.category;

import com.example.assignment.entity.Category;
import com.example.assignment.model.CategoryModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GetListCategoryServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        CategoryModel model = new CategoryModel();
        List<Category> listObj = model.findAll();
        req.setAttribute("listObj",listObj);
        req.getRequestDispatcher("/admin/category/list_category.jsp").forward(req,resp);
    }
}
