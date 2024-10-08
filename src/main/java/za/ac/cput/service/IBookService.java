package za.ac.cput.service;

import za.ac.cput.domain.Book;

import java.util.List;

public interface IBookService extends IService<Book, Integer>{

    void delete(Integer bookID);
    List<Book> getall();

}
