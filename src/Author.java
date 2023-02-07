public class Author {
    private String name;
    private String surname;
    public Author (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String toString() {
        return "Автор: " + name + surname;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
            Author mLermontov = (Author) other;
            return name.equals(mLermontov.name);
    }

    public int hashCode() {
        return java.util.Objects.hash(name);
    }


    }

