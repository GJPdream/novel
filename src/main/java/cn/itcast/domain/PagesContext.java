package cn.itcast.domain;

/**
 * 页面层。进行查找的章节的domain函数
 */
public class PagesContext {
    /**
     *首先我是想把所有章节都进行汇总，然后在进行查询章节内容
     */
    private  String bookname;
    private int bookid;
    private String bookchaper;
    private String text;

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getBookchaper() {
        return bookchaper;
    }

    public void setBookchaper(String bookchaper) {
        this.bookchaper = bookchaper;
    }

    @Override
    public String toString() {
        return "PagesContext{" +
                "bookname='" + bookname + '\'' +
                ", bookid=" + bookid +
                ", bookchaper='" + bookchaper + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
