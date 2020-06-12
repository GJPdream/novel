package cn.itcast.dao;

import cn.itcast.domain.Book;
import cn.itcast.domain.Context;
import cn.itcast.domain.PagesContext;
import org.junit.Test;

import java.util.List;

public class testdao {
    BookDao bookDao=new BookDao();
    @Test
    public void fun()
    {
        Context context = bookDao.findContext("2");
        System.out.println(context);
    }

    @Test
    public void fun1()
    {
        List<Book> all = bookDao.findAll("斗罗大陆");
        System.out.println(all);
    }
}
