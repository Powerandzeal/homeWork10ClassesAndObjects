public class Book {
   private String name ;
   Author author ;     //поля
   private int yearOfPublic;        //поля



    public Book(String name,Author author, int yearOfPublic) { // Конструктор
        this.name = name;
        this.author = author;//
        this.yearOfPublic = yearOfPublic;
        //
    }

    public  String getName() {  //Геттер
        return this.name = name ;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {      //Геттер
        return this.yearOfPublic;
    }

    public void setYearOfPublic(int yearOfPublic) {     //Сеттер
        this.yearOfPublic = yearOfPublic;
    }

}
