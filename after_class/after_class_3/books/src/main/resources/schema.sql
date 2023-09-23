DROP TABLE IF EXISTS book;
DROP TABLE IF EXISTS author;
DROP TABLE IF EXISTS publisher;

DROP DATABASE IF EXISTS `coder-books-2`;

CREATE DATABASE `coder-books-2`;

USE `coder-books-2`;

CREATE TABLE author(
	author_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(250) NOT NULL,
    last_name VARCHAR(250) NOT NULL,
    age INT NOT NULL
);

CREATE TABLE publisher(
	publisher_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(250) NOT NULL,
    foundation_year INT NOT NULL,
    country VARCHAR(250) NOT NULL
);

CREATE TABLE book(
	book_id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(250) NOT NULL,
    description TEXT NOT NULL,
    year INT NOT NULL,
    publisher_id INT NOT NULL,
    author_id INT NOT NULL,
    
    FOREIGN KEY(publisher_id) REFERENCES publisher(publisher_id),
    FOREIGN KEY(author_id) REFERENCES author(author_id)
);

-- INSERT INTO author (name, last_name, age)
-- VALUES
-- ("James", "Dashner", 50),
-- ("Stephen", "King", 76),
-- ("Joanne", "Rowling", 58);
                    
-- INSERT INTO publisher(name, foundation_year, country)
-- VALUES
-- ("Bloomsbury Publishing", 1986, "England"),
-- ("Delacorte Press", 1921, "USA"),
-- ("Viking", 1925, "USA");
                    
-- INSERT INTO book(title, description, publisher_id, author_id, year)
-- VALUES
-- ("Maze Runner", "Thomas wakes up in a metal elevator that brings him to the Glade. He has no memory of who he is or how he got there, except for his name. He gradually discovers that the Glade is run by two boys: Alby, the leader, and Newt, the second-in-charge, who both maintain order by enforcing simple but effective rules. ", 2, 1, 2009),
-- ("IT", "It is a 1986 horror novel by American author Stephen King. It was his 22nd book and his 17th novel written under his own name. The story follows the experiences of seven children as they are terrorized by an evil entity that exploits the fears of its victims to disguise itself while hunting its prey.", 3, 2, 1986),
-- ("Harry Potter and the Philosopher's Stone", "Harry Potter and the Philosopher's Stone is a fantasy novel written by British author J. K. Rowling. The first novel in the Harry Potter series and Rowling's debut novel, it follows Harry Potter, a young wizard who discovers his magical heritage on his eleventh birthday, when he receives a letter of acceptance to Hogwarts School of Witchcraft and Wizardry.", 1, 3, 1997);

-- SELECT book.book_id, book.title, book.year, author.author_id, author.name, author.last_name, author.age, publisher.publisher_id, publisher.name FROM book
-- INNER JOIN author ON book.author_id = author.author_id
-- INNER JOIN publisher ON book.publisher_id = publisher.publisher_id;