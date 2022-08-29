public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Hero out time", 1840);
        book1.getName();
        System.out.println(book1.getName());
        book1.setName("Three hundred bucks");
        System.out.println("book1.getName() = " + book1.getName());


    }
}