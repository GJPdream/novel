package cn.itcast.service;

import cn.itcast.dao.BookDao;
import cn.itcast.domain.Book;
import cn.itcast.domain.Context;
import cn.itcast.domain.PagesContext;

import java.util.List;


public class BookService {
 BookDao bookDao=new BookDao();

    /**
     * 查找页的
     * @param pages
     * @return
     */

 public List<Book> findAll(String pages)
 { return bookDao.findAll(pages);}

    /**
     * 进行所有章节的查询
     * @param bookname
     * @return
     */
 public List<PagesContext> findPagesAll(String bookname)
 {
     return  bookDao.findPagesAll(bookname);
 }

 public Context findContext(String bid)
 {
     return bookDao.findContext(bid);
 }

}
