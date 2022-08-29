public  class Author {
     private String nameAuthor;         //Поля
     private String secondNameAuthor;   //
     public  Author (String nameAuthor, String secondNameAuthor) { // Конструктор
         this.nameAuthor = nameAuthor;                             //
         this.secondNameAuthor = secondNameAuthor;                 //

     }

    public String getNameAuthor() {  //Сеттер
         return this.nameAuthor;
    }

    public String getSecondNameAuthor() { //Сеттер
         return this.secondNameAuthor;
    }


}
