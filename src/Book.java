public class Book {
    private String title;
    private Author author;
    private int year;
    public Book (String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public String getTitle() {
        return this.title;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String toString () {
        return " " + author + " Название книги: " + title + " Год публикации: " + year;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book dorianGray  = (Book) other;
        return title.equals(dorianGray.title);
    }

    public int hashCode() {
        return java.util.Objects.hash(title);
    }
}
