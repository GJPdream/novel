package cn.itcast.controller;

import cn.itcast.domain.Context;
import cn.itcast.service.BookService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ContextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;utf-8");
        BookService bookService=new BookService();
        String bid = request.getParameter("bid");
        Context context = bookService.findContext(bid);
        request.setAttribute("context",context);
        request.getRequestDispatcher("/context.jsp").forward(request,response);
        return;
    }
}
