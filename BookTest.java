public class BookTest{
    public static void main(String[] args){
        Book book = new Book("Harry Potter and the Goblet of Fire", "JK Rowling");
        book.setTitle("Harry Potter and the Chamber of Secrets");
        System.out.println(book.getBookName());
        System.out.println(StaticMethod.squared(5));
    }
}