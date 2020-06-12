package cn.itcast.domain;

import javax.xml.soap.Text;

public class Context {
    private int bookid;
    private String booktext;
    private  String bookchaper;

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBooktext() {
        return booktext;
    }

    public void setBooktext(String booktext) {
        this.booktext = booktext;
    }

    public String getBookchaper() {
        return bookchaper;
    }

    public void setBookchaper(String bookchaper) {
        this.bookchaper = bookchaper;
    }

    @Override
    public String toString() {
        return "Context{" +
                "bookid=" + bookid +
                ", booktext='" + booktext + '\'' +
                ", bookchaper='" + bookchaper + '\'' +
                '}';
    }
}
