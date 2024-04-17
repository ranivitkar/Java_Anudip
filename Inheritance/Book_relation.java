class Author {
    String authorName;
    int age;
    String place;

    Author(String name, int age, String place) {
        this.authorName = name;
        this.age = age;
        this.place = place;
    }

}

public class Book_relation {

    String name;
    int price;

    Author author;

    Book_relation(String n, int p, Author author) {
        this.name = n;
        this.price = p;
        this.author = author;
    }

    public static void main(String[] args) {
        Author author = new Author("Rani", 21, "India");

        Book_relation b = new Book_relation("Java For Begginer", 800, author);

        System.out.println("Book name: " + b.name);
        System.out.println("Book Price:" + b.price);
        System.out.println("------------Author Details----------");

        System.out.println("Author Name: " + b.author.authorName);
        System.out.println("Author Age: " + b.author.age);
        System.out.println("Author Place: " + b.author.place);

    }
}
