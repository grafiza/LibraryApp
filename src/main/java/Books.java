public class Books {
    /*
        - Bir kütüphane yönetimi uygulaması geliştiriyorsunuz.
        - Kullanıcılar, kütüphaneye yeni kitap ekleyebilmeli, kitapları sıralayabilmeli ve
        - kitapları kütüphaneden silebilmelidir.
        - Ayrıca, kullanıcılara kütüphaneyi tamamen sıfırlama seçeneği de sunmanız isteniyor.
        */
    private String bookName;
    private String authorName;
    private String bookType;
    private String publisherName;

    public Books() {
    }

    public Books(String bookName, String authorName, String bookType, String publisherName) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookType = bookType;
        this.publisherName = publisherName;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getBookType() {
        return bookType;
    }

    public String getPublisherName() {
        return publisherName;
    }
}
