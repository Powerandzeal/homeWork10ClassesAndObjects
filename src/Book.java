public class Book {
   private String name ;            //поля
   private int yearOfPublic;        //поля



    public Book(String name, int yearOfPublic) { // Конструктор
        this.name = name;                        //
        this.yearOfPublic = yearOfPublic;        //
    }

    public  String getName() {  //Геттер
        return this.name = name ;
    }

    public int getYear() {      //Геттер
        return this.yearOfPublic;
    }

    public void setName(String name) {      //Сеттер
        this.name = name;
    }

    public void setYearOfPublic(int yearOfPublic) {     //Сеттер
        this.yearOfPublic = yearOfPublic;
    }

}
