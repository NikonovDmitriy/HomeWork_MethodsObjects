import java.util.Objects;

public class Book {
    private final String nazvanie;
    private final Author author;
    private int yearPublic;

    public Book(String nazvanie, Author author, int yearPublic) {
        this.nazvanie = nazvanie;
        this.author = author;
        this.yearPublic = yearPublic;
    }

    public String getNazvanie() {
        return this.nazvanie;
    }

    public Author getAuthorName() {
        return this.author;
    }

    public int getYearPublic() {
        return this.yearPublic;
    }

    public void setYearPublic(int yearPublic) {
        this.yearPublic = yearPublic;
    }

    @Override
    public String toString() {
        return "Книга " + "название = '" + nazvanie + '\''+ ", автор = " +author+", год публикации = " + yearPublic + '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this==o) return true;
        if (o==null || getClass()!=o.getClass()) return false;
        Book book = (Book) o;
        return yearPublic == book.yearPublic && nazvanie.equals(book.nazvanie) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazvanie, author, yearPublic);
    }

}