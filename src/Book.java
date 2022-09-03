import java.util.Objects;

public class Book {
    private String name;            //поля
    private Author author;          //поля
    private int yearOfPublic;       //поля


    public Book(String name, Author author, int yearOfPublic) { // Конструктор
        this.name = name;                                       //
        this.author = author;                                   //
        this.yearOfPublic = yearOfPublic;                       // Конструктор
        //
    }

    public String getName() {  //Геттер
        return this.name = name;
    }// Геттер

    public Author getAuthor() {
        return this.author;
    }// Геттер

    public int getYear() {      //Геттер
        return this.yearOfPublic;
    }// Геттер

    public void setYearOfPublic(int yearOfPublic) {     //Сеттер
        this.yearOfPublic = yearOfPublic;
    }// Сеттер

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublic == book.yearOfPublic && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearOfPublic);
    }

    @Override
    public String toString() {
        return "Book{" + "name='" + name + '\'' + ", author=" + author.toString() + ", yearOfPublic=" + yearOfPublic + '}';
    }
}
