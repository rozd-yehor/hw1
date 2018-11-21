package ua.org.oa.erozdolovskiy;

/**
 * Book object is described in the above class. Class contains methods which
 * put the book on the bookshelf, set location of the book on the bookshelf,
 * calculate the number of days when user will finish the book and display
 * the short info about the book (also taking into account described actions).
 */

public class LibraryBook {
    int bookshelfNumber;                    //Number of the bookshelf where the book is located.
    int numberOfPages;                      //Number of pages in the book.
    int pagesPerDay;                        //Approximate number of pages which user reads per day.
    float bookRatingFromZeroToFive;
    float readingDays;                      //Approximate number of days when user will finish the book.
    String bookAuthor;
    String bookTitle;
    String locationOnTheBookshelf;          //Location of the book on the bookshelf.

    /**
     * Method puts the book on the bookshelf according to the rating of the book.
     * The higher is the book rating the higher the book gets.
     *
     * @param bookRatingFromZeroToFive
     *
     * @return Number of the bookshelf where the book is located.
     */
    int putTheBookOnTheBookshelf(float bookRatingFromZeroToFive) {
        this.bookRatingFromZeroToFive = bookRatingFromZeroToFive;
        if (bookRatingFromZeroToFive >= 0 && bookRatingFromZeroToFive <= 1) {
            return bookshelfNumber = 1;
        } else if (bookRatingFromZeroToFive > 1 && bookRatingFromZeroToFive <= 2) {
            return bookshelfNumber = 2;
        } else if (bookRatingFromZeroToFive > 2 && bookRatingFromZeroToFive <= 3) {
            return bookshelfNumber = 3;
        } else if (bookRatingFromZeroToFive > 3 && bookRatingFromZeroToFive <= 4) {
            return bookshelfNumber = 4;
        } else if (bookRatingFromZeroToFive > 4 && bookRatingFromZeroToFive <= 5) {
            return bookshelfNumber = 5;
        } else return bookshelfNumber = 0;
    }

    /**
     * Method sets the location of the book on the bookshelf according to the first
     * letter of the BookTitle.
     *
     * @param BookTitle
     *
     * @return Approximate location of the book on the bookshelf.
     */
    String setLocationOnTheBookshelf(String BookTitle) {
        this.bookTitle = BookTitle;
        String FirstLetterOfTitle = BookTitle.substring(0, 1);
        /*http://proglang.su/java/strings-substring*/
        switch (FirstLetterOfTitle) {
            case "A": case "Б": case "В": case "Г": case "Д": case "Е": case "Ё": case "Ж": case "З": case "И": case "Й":
                locationOnTheBookshelf = "в начале";
                break;
            case "К": case "Л": case "М": case "Н": case "О": case "П": case "Р": case "С": case "Т": case "У": case "Ф":
                locationOnTheBookshelf = "на середине";
                break;
            case "Х": case "Ц": case "Ч": case "Ш": case "Щ": case "Ъ": case "Ы": case "Ь": case "Э": case "Ю": case "Я":
                locationOnTheBookshelf = "в конце";
                break;
            default:
                locationOnTheBookshelf = "error";
                break;
        }
        return locationOnTheBookshelf;
    }

    /**
     * Method gets number of days which user needs to finish the reading of the book.
     * Number of pages in the book and approximate number of pages which user reads
     * per day are taken into account.
     *
     * @param pagesPerDay
     *
     * @return Approximate number of days when user will finish the book.
     */
    float getReadingDays(int pagesPerDay) {
        this.pagesPerDay = pagesPerDay;
        readingDays = (float) numberOfPages / pagesPerDay;
        return readingDays;
    }

    /**
     * Method prints short info about the book. It's called as final method in the main method.
     */
    void printInfo() {
        System.out.println("При заданном рейтинге книги в " + bookRatingFromZeroToFive + " книга располагается на " + bookshelfNumber + " полке.");
        System.out.println("Учитывая название книги \"" + bookTitle + "\" она находится " + locationOnTheBookshelf + " полки.");
        System.out.println("Автором книги является " + bookAuthor + " .");
        System.out.println("При заданной скорости чтения книги в " + pagesPerDay + " страниц в день Вы прочтёте книгу примерно за " + readingDays + " дней.");
    }
}