import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Books01[] book = new Books01[n];
        for (int i = 0; i < n; i++) {
            String bookName = scanner.nextLine().trim();
            String authorName = scanner.nextLine().trim();
            int ISBNNumber = scanner.nextInt();
            book[i] = new Books01(bookName, authorName, ISBNNumber);
        }
        for (int j = 0; j < n; j++) {
            System.out.print("-----------------------------");
            System.out.print(book[j]);
        }
    }
}
class Books01{
    private String bookName;
    private String authorName;
    private long ISBNNumber;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public long getISBNNumber() {
        return ISBNNumber;
    }

    public void setISBNNumber(long ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    public Books01(String bookName, String authorName, long ISBNNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBNNumber = ISBNNumber;
    }

    @Override
    public String toString() {
        return String.
                format(getBookName(), getAuthorName(), getISBNNumber());
    }
}
