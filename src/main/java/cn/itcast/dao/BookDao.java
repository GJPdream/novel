package cn.itcast.dao;


import java.sql.SQLException;
import java.util.List;

import cn.itcast.domain.Book;
import cn.itcast.domain.Context;
import cn.itcast.domain.PagesContext;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

public class BookDao{
    QueryRunner qr=new QueryRunner(C3p0.getDataSource());

    /**
     * 进行小说书名的查询
     * @param pages
     * @return
     */
    public List<Book> findAll(String pages) {
	// TODO Auto-generated method stub
        String pa="%"+pages+"%";
	String sql="select distinct bookname,bookauthor,bookimage from book where bookname like ? ";
	try {
	    Object[]params={pa};
		return qr.query(sql, new BeanListHandler<Book>(Book.class),params);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		throw new RuntimeException(e);
	}
}

    /**
     * 根据小说查找所有小说的章节
     * @param bookname
     * @return
     */
    public List<PagesContext> findPagesAll(String bookname)
{
    String sql="select bookname,bookid,bookchaper from book where bookname=?";
    try {
        Object[] params={bookname};
        return qr.query(sql,new BeanListHandler<PagesContext>(PagesContext.class),params);
    }catch (Exception e)
    {
        throw new RuntimeException();
    }

}

    /**
     * 查询小说内容
     * @param bid
     * @return
     */
    public Context findContext(String bid)
    {

        String sql="select bookid,booktext,bookchaper from book where bookid=?";
        try {int id = Integer.parseInt(bid);
           /* System.out.println(id);*/
            Object[]params={id};
            return qr.query(sql,new BeanHandler<Context>(Context.class),params);
        }catch (Exception e)
        {
            throw new RuntimeException();
        }

    }

}
