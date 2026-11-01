public class book_information_parameterized_constructor {
    String title;
    String author;
    int publicationYear;

    // Parameterized constructor
    public book_information_parameterized_constructor(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    }

    public static void main(String[] args) {
        book_information_parameterized_constructor book1 = new book_information_parameterized_constructor("To Kill a Mockingbird", "Harper Lee", 1960);
        book1.displayDetails();
    }
}
