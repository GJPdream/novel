package cn.itcast.domain;

/**
 * domain层，主要Javabean装返回值的
 */
public class Book {
    private int bookid;
   private String bookname;
    private  String bookchaper;
    private  String bookauthor;
    private  String bookimage;
    private String booktext;

    public String getBookimage() {
        return bookimage;
    }

    public void setBookimage(String bookimage) {
        this.bookimage = bookimage;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookchaper() {
        return bookchaper;
    }

    public void setBookchaper(String bookchaper) {
        this.bookchaper = bookchaper;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }

    public String getBooktext() {
        return booktext;
    }

    public void setBooktext(String booktext) {
        this.booktext = booktext;
    }

    public Book() {
       super();
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookid=" + bookid +
                ", bookname='" + bookname + '\'' +
                ", bookchaper='" + bookchaper + '\'' +
                ", bookauthor='" + bookauthor + '\'' +
                ", bookimage='" + bookimage + '\'' +
                ", booktext='" + booktext + '\'' +
                '}';
    }
}
