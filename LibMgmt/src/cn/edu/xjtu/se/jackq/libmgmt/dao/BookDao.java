package cn.edu.xjtu.se.jackq.libmgmt.dao;

import cn.edu.xjtu.se.jackq.libmgmt.entity.Book;
import cn.edu.xjtu.se.jackq.libmgmt.entity.BookComment;
import cn.edu.xjtu.se.jackq.libmgmt.entity.BookCopy;

import java.util.List;

public interface BookDao {
    Book addBook(Book book);

    Book updateBook(Book book);

    boolean removeBook(Book book);

    Book getBookById(int id);

    List<Book> listBook();

    boolean AddCopy(BookCopy bookCopy);

    boolean updateBookCopy(BookCopy bookCopy);

    List<Book> searchBook(String query, boolean byCode, boolean byName, boolean byAuthor);

    void addComment(BookComment bookComment);

    BookComment getComment(int commentId);

    boolean updateBookComment(BookComment bookComment);

    boolean isBookCodeAvailable(String bookCode);

    BookCopy getBookCopy(int id);
}
