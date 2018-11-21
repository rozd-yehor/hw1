package ua.org.oa.erozdolovskiy;

public class Runner {
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook();
        //
        book.bookRatingFromZeroToFive = 4.4f;
        book.bookTitle = "Преступление и наказание";
        book.bookAuthor = "Достоевский Ф. М.";
        book.numberOfPages = 331;
        book.pagesPerDay = 100;
        //
        book.putTheBookOnTheBookshelf(book.bookRatingFromZeroToFive);
        book.setLocationOnTheBookshelf(book.bookTitle);
        book.getReadingDays(book.pagesPerDay);
        //
        book.printInfo();
    }
}
