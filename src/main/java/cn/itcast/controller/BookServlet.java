package cn.itcast.controller;

import cn.itcast.service.BookService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BookServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;utf-8");
        BookService bookService=new BookService();
        String pages = request.getParameter("pages");
        System.out.println(pages);
        request.setAttribute("bookList",bookService.findAll(pages));
        request.getRequestDispatcher("/list.jsp").forward(request, response);
        return;
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

   doGet(request,response);
    }
}
