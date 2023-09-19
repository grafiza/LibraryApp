import java.util.Scanner;

public class LibraryRunner {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        start();

    }

    private static void start() {
        int secim = -1;
        do {
            System.out.println("Kütühane App");
            System.out.println("-------------------");
            System.out.println("1. Kitap Ekle");
            System.out.println("2. Kitap Sil");
            System.out.println("3. Kitapları Listele");
            System.out.println("4. Kütüphaneyi sil");
            System.out.println("0. Çıkış");
            secim = scan.nextInt();
            switch (secim) {
                case 1:
                    kitapEkle();
                    break;
                case 2:
                    kitapSil();
                    break;
                case 3:
                    BookService.printBooks();
                    break;
                case 4:
                    BookService.deleteLibrary();
                    break;
            }
        } while (secim != 0);
    }

    private static void kitapSil() {
        BookService.printBooks();
        int kitapSec;
        System.out.println("Silmek istediğiniz kitabın numarasını giriniz:");
        kitapSec = scan.nextInt();
        BookService.deleteBook(kitapSec);
    }

    private static void kitapEkle() {
        Books book = new Books();
        scan = new Scanner(System.in);
        String bookName, bookType, authorName, publisherName;
        String secim;
        do {
            System.out.println("Lütfen Kitap Adını Giriniz");
            bookName = scan.nextLine();
            System.out.println("Lütfen Yazarını Giriniz");
            authorName = scan.nextLine();
            System.out.println("Lütfen Kitap Türünü Seçiniz Giriniz");
            System.out.println("1.Roman");
            System.out.println("2.Hikaye");
            System.out.println("3.Bilişim");
            System.out.println("4.Edebiyat");
            System.out.println("5.Dini");

            bookType = scan.nextLine();
            switch (bookType) {
                case "1":
                    bookType = Turler.ROMAN.getTypeName();
                    break;
                case "2":
                    bookType = Turler.HIKAYE.getTypeName();
                    break;
                case "3":
                    bookType = Turler.BILISIM.getTypeName();
                    break;
                case "4":
                    bookType = Turler.EDEBIYAT.getTypeName();
                    break;
                case "5":
                    bookType = Turler.DINI.getTypeName();
                    break;
                default:

            }
            System.out.println("Lütfen Kitap Yayınevini Giriniz");
            publisherName = scan.nextLine();
            BookService.addBook(bookName, authorName, bookType, publisherName);
            System.out.println("Yeni kitap eklemek ister misiniz (E/H)");
            secim = scan.nextLine();
        } while (secim.equals("E"));
        BookService.printBooks();
    }
}
