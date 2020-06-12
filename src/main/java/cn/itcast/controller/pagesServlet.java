package cn.itcast.controller;

import cn.itcast.domain.PagesContext;
import cn.itcast.service.BookService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class pagesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;utf-8");
        String bookname = request.getParameter("bookname");
        BookService bookService=new BookService();
        List<PagesContext> pagesAll = bookService.findPagesAll(bookname);
        request.setAttribute("pages",pagesAll);
        request.getRequestDispatcher("/main.jsp").forward(request,response);
    }
}
