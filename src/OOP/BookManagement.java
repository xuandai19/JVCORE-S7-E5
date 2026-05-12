package OOP;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {
        Book[] arr = new Book[3];
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n****** MENU ******");
            System.out.println("1. Nhập thông tin sách");
            System.out.println("2. Hiển thị thông tin sách");
            System.out.println("3. Tính lợi nhuận");
            System.out.println("4. Sắp xếp sách theo lợi nhuận giảm dần");
            System.out.println("5. Tìm kiếm sách theo tên");
            System.out.println("6. Thoát");

            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println("\nNhập sách thứ " + (i + 1));

                        arr[i] = new Book();
                        arr[i].nhapthongtin(sc);

                        int profit = arr[i].loinhuan(
                                arr[i].getPriceIn(),
                                arr[i].getPriceOut()
                        );

                        arr[i].setProfit(profit);
                    }
                    break;

                case 2:
                    System.out.println("\n===== DANH SÁCH SÁCH =====");

                    for (Book b : arr) {
                        if (b != null) {
                            b.hienthithongtin();
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n===== LỢI NHUẬN =====");

                    for (Book b : arr) {
                        if (b != null) {
                            System.out.println(
                                    "Tên sách: " + b.getBookName()
                                            + " - Lợi nhuận: "
                                            + b.getProfit()
                            );
                        }
                    }
                    break;

                case 4:
                    Arrays.sort(arr, new Comparator<Book>() {
                        @Override
                        public int compare(Book o1, Book o2) {
                            if (o1 == null || o2 == null) {
                                return 0;
                            }
                            return o2.getProfit() - o1.getProfit();
                        }
                    });

                    System.out.println("\nĐã sắp xếp giảm dần theo lợi nhuận");
                    for (Book b : arr) {
                        if (b != null) {
                            b.hienthithongtin();
                        }
                    }
                    break;

                case 5:
                    System.out.print("Nhập tên sách cần tìm: ");
                    String keyword = sc.nextLine();

                    boolean found = false;

                    for (Book b : arr) {
                        if (b != null &&
                                b.getBookName().toLowerCase()
                                        .contains(keyword.toLowerCase())) {

                            b.hienthithongtin();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Không tìm thấy sách");
                    }

                    break;

                case 6:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn từ 1-6");
            }
        } while (true);
    }
}