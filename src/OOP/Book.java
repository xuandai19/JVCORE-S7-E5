package OOP;

import java.util.Scanner;

public class Book {
    private String bookId;
    private String bookName;
    private int priceIn;
    private int priceOut;
    private int profit;
    private String author;
    private String status;

    public Book() {

    }

    public Book(String bookId, String bookName, int priceIn, int priceOut, int profit, String author, String status) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.priceIn = priceIn;
        this.priceOut = priceOut;
        this.profit = profit;
        this.author = author;
        this.status = status;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPriceIn() {
        return priceIn;
    }

    public void setPriceIn(int priceIn) {
        this.priceIn = priceIn;
    }

    public int getPriceOut() {
        return priceOut;
    }

    public void setPriceOut(int priceOut) {
        this.priceOut = priceOut;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void nhapthongtin(Scanner scanner) {
        System.out.println("Nhập mã sách: ");
        this.bookId = scanner.nextLine();
        System.out.println("Nhập tên sách: ");
        this.bookName = scanner.nextLine();
        System.out.println("Nhập giá sách nhập: ");
        this.priceIn = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giá sách xuất: ");
        this.priceOut = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên tác giả: ");
        this.author = scanner.nextLine();
        System.out.println("Nhập trạng thái sách: ");
        this.status = scanner.nextLine();
    }

    public void hienthithongtin() {
        System.out.printf(
                "Mã sách: %s - Tên sách: %s - Giá nhập: %d - Giá xuất: %d - Lợi nhuận: %d - Tác giả: %s - Trạng thái: %s\n",
                this.bookId,
                this.bookName,
                this.priceIn,
                this.priceOut,
                this.profit,
                this.author,
                this.status
        );
    }

    public int loinhuan(int priceIn, int priceOut) {
        return priceOut - priceIn;
    }
}
