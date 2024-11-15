public class Activity {
    public static void main(String[] args) {

        Book book1 = new Book();

        book1.set_book_number(1);
        book1.set_book_title("It Ends With Us");
        book1.set_book_author("Coleen Hoover");
        book1.set_book_price(500);

        book1.get_book_number();
        book1.get_book_title();
        book1.get_book_author();
        book1.get_book_price();

    }
}
