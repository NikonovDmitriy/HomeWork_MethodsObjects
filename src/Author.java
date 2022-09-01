public class Author {
    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getTotalName() {
        return this.name + " " + this.surname;
    }

    @Override
    public String toString() {
        return getTotalName();
    }

    @Override
    public boolean equals(Object o) {
       if(this == o) return true;
       if(o==null || getClass()!=o.getClass()) return false;
       Author author = (Author) o;
        return name.equals(author.name) && surname.equals(author.surname);
    }

    @Override
    public int hashCode() {
        return Object.hash(name, surname);
    }
}
