package com.example.bookstoremvc;

import com.example.bookstoremvc.dao.AuthorDao;
import com.example.bookstoremvc.dao.BookDao;
import com.example.bookstoremvc.dao.CategoryDao;
import com.example.bookstoremvc.entity.Author;
import com.example.bookstoremvc.entity.Book;
import com.example.bookstoremvc.entity.BookStatus;
import com.example.bookstoremvc.entity.Category;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;


import java.time.LocalDate;
@SpringBootApplication
@RequiredArgsConstructor
public class BookStoreMvcApplication {
    private final CategoryDao categoryDao;
    private final AuthorDao authorDao;
    private final BookDao bookDao;
    @Bean @Transactional
    public ApplicationRunner runner(){
        return r -> {
            //for BestSellers
            Category category=new Category();
            category.setCategoryName("Programming");

            Author author1=new Author("Robert.C","Martin","martin@gmail.com",
                    LocalDate.of(1952,12,5),
                    "Uncle Bob is a living legend in the software industry " +
                            "and his work has had a profound impact on the way " +
                            "that software is developed today. He is a mentor to many " +
                            "and is always willing to share his knowledge and expertise." +
                            " He is a true inspiration to all software engineers.",
                    "uncle_bob");

            Book book1=new Book("Clean Code",40.5,LocalDate.of(2008,3,11),
                    "Pearson", BookStatus.BESTSELLERS,"clean_code");


            Category category2=new Category();
            category2.setCategoryName("Science");

            Author author2=new Author("Stephan","Hawking",
                    "stephan@gmail.com",LocalDate.of(1942,1,8),
                    "He was a theoretical physicist, cosmologist, and author" +
                            " who made significant contributions to " +
                            "our understanding of black holes and the Big Bang.",
                    "hawking");

            Book book2=new Book("A Brief History of Time",
                    18.99,LocalDate.of(1988,1,1),"Bantam Dell"
                    ,BookStatus.BESTSELLERS,
                    "history_of_time");

            Category category3=new Category();
            category3.setCategoryName("Programming");

            Author author3=new Author("Joshua","Bloch","bloch@gmail.com",
                    LocalDate.of(1961,8,28),
                    "a software engineer and author who was involved in " +
                            "the design and implementation of" +
                            " numerous Java platform features.","bloch");

            Book book3=new Book("Effective Java",55.2,LocalDate.of(2017,12,27),
                    "Addison-Wesley",
                    BookStatus.BESTSELLERS,
                    "effective_java");

          //Eh

            Category category4=new Category();
            category4.setCategoryName("Novel");

            Author author4=new Author("Thomas","Hardy","thomas@gmail.com",
                    LocalDate.of(1840,6,2),
                    "His novels are often characterized by their tragic plots and their exploration of themes such as love, loss, and fate.",
                    "hardy");

            Book book4=new Book("Far From the",32.5,LocalDate.of(1874,1,1),
                    "Collins",BookStatus.BESTSELLERS,"far");

            Author author5=new Author("Yasunari","Kawabata","kawabata@gmail.com",
                    LocalDate.of(1899,1,1),
                    "he soon developed his own unique style, which was characterized by its simplicity, its focus on the inner lives of his characters, and its use of symbolism.",
                    "kawabata");
            Book book5=new Book("Snow Country",
                    20.5,LocalDate.of(1948,1,1),
                    "Pole Star",BookStatus.BESTSELLERS,
                    "snow");

            Author author6 = new Author("Charles","Dicken","charles@gmail.com",
                    LocalDate.of(1812,2,7),
                    "Charles John Huffam Dickens was an English novelist and social critic who created some of " +
                            "the world's best-known fictional characters, and is regarded by many as the greatest novelist of the Victorian era.",
                    "charles");
            Book book6=new Book("David Copperfield",35.3,
                    LocalDate.of(1850,1,1),
                    "Amazon",BookStatus.RECOMMENDED,"david");
            Book book7=new Book("The Great Expectations",40.3,
                    LocalDate.of(1861,1,1),
                    "Amazon",
                    BookStatus.RECOMMENDED,"great");

            Book book8= new Book("Oliver Twist",33.5,LocalDate.of(1838,1,1),
                    "Sun",BookStatus.RECOMMENDED,"oliver");

            Book book9 = new Book("Pride and Prejudice",30.5,
                    LocalDate.of(2008,5,16),
                    "Amazon",BookStatus.RECOMMENDED,"pride");

            Book book10= new Book("Emma",30,
                    LocalDate.of(2003,5,6),
                    "Amazon",BookStatus.RECOMMENDED,"emma");

            Book book11= new Book("The Catcher in the Rye",40,
                    LocalDate.of(1991,5,1),
                    "Amazon",BookStatus.NEW,"catcher");

            Book book12 = new Book("The Queen's Gambit",39,
                    LocalDate.of(1983,2,4),
                    "New York Times",BookStatus.NEW,"TheQueensGambit");
            Book book13 = new Book("Ma Kyi Pyar and Her Negative Love",40,
                    LocalDate.of(1998,2,4),
                    "Sky Blue",BookStatus.NEW,"kyipyar");
            Book book14 = new Book("Thit Khet Nhar",24,LocalDate.of(1988,2,4),
                    "Sky Blue",BookStatus.NEW,"thitkhet");

            Author author7 = new Author("Jane","Austen","jane@gmail.com",
                    LocalDate.of(1775,12,16),
                    "Jane Austen was an English novelist known primarily for her six novels, which implicitly interpret, critique, and comment upon the British landed gentry at the end " +
                            "of the 18th century. Austen's plots often explore the dependence of women on marriage for the pursuit of favourable social standing and economic security.",
                    "jane");
            Author author8 = new Author("J.D","Salinger","salinger@gmail.com",
                    LocalDate.of(1919,7,30),"erome David Salinger was an American author best known for his 1951 novel The Catcher in the Rye. Salinger published" +
                    " several short stories in Story magazine in 1940, before serving in World War II.","salinger");
            Author author9 = new Author("Walter","Tevis","walter@gmail.com",
                    LocalDate.of(1928,2,28),
                    "Walter Stone Tevis Jr. (February 28, 1928[4] – August 9, 1984[5]) was an American novelist and screenwriter. Three of his six novels were adapted into major films: The Hustler, The Color of Money and The Man Who Fell to Earth. A fourth," +
                            " The Queen’s Gambit, was adapted into a miniseries with the same title and shown on Netflix in 2020. His books have been translated into at least 18 languages.",
                    "tevis");
            Author author10= new Author("Ni Ko","Ye","yewin@gmail.com",
                    LocalDate.of(1996,1,2),
                    "Ye Win born on November 2, 1966 in Yangon, Myanmar. In 1993, he graduated from Yangon University with a degree in botany. After graduating, his first novel, Ma Kyi Pyar and Her Negative Love was released in February 1998. The book was made into a successful film as Sky Blue Negative and Me, starring Lwin Moe and Htun Eindra Bo." +
                            " He married Ma Naing Naing Win in 1999. Ngar doht Sarpay(Burmese: ငါတို့စာေပ) republished his first novel, Ma Kyi Pyar and Her Negative Love, a second time in November 2015.",
                    "nikoye");


            category4.addBook(book6);
            category4.addBook(book7);
            category4.addBook(book8);
            category4.addBook(book9);
            category4.addBook(book10);
            category4.addBook(book11);
            category4.addBook(book12);
            category4.addBook(book13);
            category4.addBook(book14);

            author6.addBook(book6);
            author6.addBook(book7);
            author6.addBook(book8);
            author7.addBook(book9);
            author7.addBook(book10);
            author8.addBook(book11);
            author9.addBook(book12);
            author10.addBook(book13);
            author10.addBook(book14);

            category4.addBook(book5);
            author5.addBook(book5);

            category4.addBook(book4);
            author4.addBook(book4);

            category.addBook(book1);
            author1.addBook(book1);

            category2.addBook(book2);
            author2.addBook(book2);

            category3.addBook(book3);
            author3.addBook(book3);


            categoryDao.save(category);
            categoryDao.save(category2);
            categoryDao.save(category3);
            categoryDao.save(category4);

            authorDao.save(author1);
            authorDao.save(author2);
            authorDao.save(author3);
            authorDao.save(author4);
            authorDao.save(author5);
            authorDao.save(author6);
            authorDao.save(author7);
            authorDao.save(author8);
            authorDao.save(author9);
            authorDao.save(author10);


            bookDao.save(book1);
            bookDao.save(book2);
            bookDao.save(book3);
            bookDao.save(book4);
            bookDao.save(book5);
            bookDao.save(book6);
            bookDao.save(book7);
            bookDao.save(book8);
            bookDao.save(book9);
            bookDao.save(book10);
            bookDao.save(book11);
            bookDao.save(book12);
            bookDao.save(book13);
            bookDao.save(book14);



        };
    }

    public static void main(String[] args) {
        SpringApplication.run(BookStoreMvcApplication.class, args);
    }

}
