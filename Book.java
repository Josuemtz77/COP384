package Week3_Inheritance;

class Book extends LibraryItem {
    private String genre;
    private int numberOfPages;

    public Book(String title, String creator, int itemId, String genre, int numberOfPages) {
        super(title, creator, itemId);

        this.genre = genre;
        this.numberOfPages = numberOfPages;
    }

    public String toString() {
        return "Book: \n"
                + super.toString()
                + "\nGenre: " + genre
                + "\nNumber of Pages: " + numberOfPages;
    }
}
