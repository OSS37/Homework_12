public class App {

    public static void main(String[] args) {
        Author oscarWilde = new Author ("Oscar ", "Wilde");
        Book dorianGray = new Book ("The Picture of Dorian Gray", oscarWilde,1830 );
        dorianGray.setYear(1890);
        System.out.println("Автор книги: " + dorianGray.getAuthor().getName() + dorianGray.getAuthor().getSurname());
        System.out.println("Название книги: " + dorianGray.getTitle());
        System.out.println("Год издания книги: " + dorianGray.getYear());

        System.out.println();

        Author mLermontov = new Author ("Oscar ", "Wilde");
        Book aHeroOfOurTime = new Book ("The Picture of Dorian Gray", mLermontov,1840 );
        System.out.println("Автор книги: " + aHeroOfOurTime.getAuthor().getName() + aHeroOfOurTime.getAuthor().getSurname());
        System.out.println("Название книги: " + aHeroOfOurTime.getTitle());
        System.out.println("Год издания книги: " + aHeroOfOurTime.getYear());

        System.out.println();

        System.out.println(dorianGray);
        System.out.println(aHeroOfOurTime);

        System.out.println();

        System.out.println(oscarWilde.equals(mLermontov));
        System.out.println(dorianGray.equals(aHeroOfOurTime));

    }
}
