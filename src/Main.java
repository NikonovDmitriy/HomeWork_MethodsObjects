public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Виктор", "Пелевин");
        Book book1 = new Book("Евгений Онегин", author1, 1000);
        Book book2 = new Book("Шлем ужаса", author2, 2000);
        book1.setYearPublic(1050);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book1.hashCode() == book2.hashCode());
        System.out.println(book1.equals(book2));

    }
}