package book;

import book.entity.Book;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class BookHelper {
    private SessionFactory sf;

    public BookHelper() {
        sf = HibernateUtil.getSessionFactory();
    }

    public Book getBookById(long id) {
        Session session = sf.openSession();
        Book book = session.get(Book.class, id);
        session.close();
        return book;
    }

    public List<Book> getAll() {
        Session session = sf.openSession();
        Criteria criteria = session.createCriteria(Book.class);
        List<Book> list = criteria.list();
        session.close();
        return list;
    }

    public void addBook(Book book) {
        Session session = sf.openSession();
        session.beginTransaction();
        session.save(book);
        session.getTransaction().commit();
        session.close();
    }


}
