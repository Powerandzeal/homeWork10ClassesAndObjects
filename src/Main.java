public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Michail", "Lermontov");
        Book book1 = new Book("Hero out time", author1, 1022);

        Author author2 = new Author("Michail", "Lermontov");
        Book book2 = new Book("Hero out time", author2, 1022);


        System.out.println(book1);

        System.out.println(book1.hashCode() == book2.hashCode());
        System.out.println(book1.equals(book2));



    }
}