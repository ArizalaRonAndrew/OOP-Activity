class Book {
    private int book_number;
    private float book_price;
    private String book_title, book_author;

    public void set_book_number(int book_number) {
        this.book_number = book_number;
    }

    public void set_book_price(float book_price) {
        this.book_price = book_price;
    }

    public void set_book_title(String book_title) {
        this.book_title = book_title;
    }

    public void set_book_author(String book_author) {
        this.book_author = book_author;
    }

    public int get_book_number() {
        System.out.println("Book Number: " + book_number);
        return book_number;
    }

    public float get_book_price() {
        System.out.println("Book Price: " + book_price);
        return book_price;
    }

    public String get_book_title() {
        System.out.println("Book Title: " + book_title);
        return book_title;
    }

    public String get_book_author() {
        System.out.println("Book Author: " + book_author);
        return book_author;
    }
}
