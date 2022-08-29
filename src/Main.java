public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Michail","Lermontov");
        Book book1 = new Book("Hero out time",author1,1022);
        Author author2 = new Author("Hemingway","Ernest");
        Book book2 = new Book("The Old Man and the Sea",author2,1958);
        book1.setYearOfPublic(232);

        System.out.println(book1.getYear());



    }
}