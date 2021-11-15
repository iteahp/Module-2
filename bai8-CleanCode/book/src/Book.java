import java.util.Date;

public class Book {
    private  int id;
    private String name;
    private float createTime;
    private  String language;
    private long amount;
    private String author;
    private static int idNumber = 0;
    public Book() {
    }

    public Book( String name, String language,  String author,long amount) {
        this.id = idNumber++;
        this.name = name;
        this.createTime = createTime;
        this.language = language;
        this.amount = amount;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCreateTime() {
        return createTime;
    }

    public void setCreateTime(float createTime) {
        this.createTime = createTime;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                ", language='" + language + '\'' +
                ", amount=" + amount +
                ", author='" + author + '\'' +
                '}';
    }

}
