import java.util.Objects;

public class Author {
    private String nameAuthor;         //Поля
    private String secondNameAuthor;   //


    public Author(String nameAuthor, String secondNameAuthor) { // Конструктор
        this.nameAuthor = nameAuthor;                             //
        this.secondNameAuthor = secondNameAuthor;                 //

    }

    public String getNameAuthor() {  //Сеттер
        return this.nameAuthor;
    }

    public String getSecondNameAuthor() { //Сеттер
        return this.secondNameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nameAuthor, author.nameAuthor) && Objects.equals(secondNameAuthor, author.secondNameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, secondNameAuthor);
    }

    @Override
    public String toString() {
        return "Author{" +
                "nameAuthor='" + nameAuthor + '\'' +
                ", secondNameAuthor='" + secondNameAuthor + '\'' +
                '}';
    }
}
