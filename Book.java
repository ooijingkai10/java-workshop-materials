import java.text.Format;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }

    public String getBookName() {
        return String.format("%s by %s", this.title, this.author);
        //return (this.title + "by" + this.author);
    }
}
