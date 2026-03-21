package com.gla.SmartLibrarySystem;

public class SmartLibrarySystem {
    class Book {
        int bookId;
        String title;
        double price;
        static String libraryName = "City Central Library";

        Book(int bookId, String title, double price) {
            this.bookId = bookId;
            this.title = title;
            this.price = price;
        }

        double calculateFine(int daysLate) {
            return 0;
        }

        void display() {
            System.out.println("Library: " + libraryName);
            System.out.println("Book ID: " + bookId);
            System.out.println("Title: " + title);
            System.out.println("Price: ₹" + price);
        }
    }

    class TextBook extends Book {
        TextBook(int bookId, String title, double price) {
            super(bookId, title, price);
        }

        @Override
        double calculateFine(int daysLate) {
            return daysLate * 2; // ₹2 per day
        }
    }

    static class Magazine extends Book {

        Magazine(int bookId, String title, double price) {
            super(bookId, title, price);
        }

        @Override
        double calculateFine(int daysLate) {
            return daysLate * 5; // ₹5 per day
        }
    }

    public class SmartLibrarySystem {
        public void main(String[] args) {
            Book b1 = new TextBook(101, "Java Programming", 450);
            Book b2 = new Magazine(201, "Tech Monthly", 150);
            b1.display();
            System.out.println("Fine (TextBook, 3 days late): ₹" + b1.calculateFine(3));
            System.out.println("----------------------");
            b2.display();
            System.out.println("Fine (Magazine, 3 days late): ₹" + b2.calculateFine(3));
        }
    }
}
