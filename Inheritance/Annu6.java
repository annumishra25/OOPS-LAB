public class Annu6 {

    String title;
    String author;
    int year;
    public Annu6(String author, String title) {
        this.title = title;
        this.author = author;
        this.year = 0;   // default year
    }

    // Constructor with year
    public Annu6(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }
    public void display() {
        System.out.println("=================================");
        System.out.println("Book Details");
        System.out.println("---------------------------------");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Year   : " + year);
        System.out.println("=================================\n");
    }

    public static void main(String[] args) {

        Annu6 b1 = new Annu6("Robert Kiyosaki", "Rich Dad Poor Dad", 1997);
        Annu6 b2 = new Annu6("Stephen Covey", "7 Habits of Highly Effective People", 1989);

        System.out.println(" Library Records\n");

        b1.display();
        b2.display();
    }
}