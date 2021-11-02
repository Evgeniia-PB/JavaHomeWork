package com.pb.Krivolapova.HW5;

public class Library {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В.В.", 1, "ФИОТ", "26.10.1994", "+38093998965");
        Reader reader2 = new Reader("Резвая О. А.", 2, "ФИОТ", "01.09.1995", "+380502335978");
        Reader reader3 = new Reader("Тарасова Е. Д.", 3, "ФИОТ", "15.01.1995", "+380637895612");
        Reader[] readers = {reader1, reader2, reader3};
        System.out.println(reader1);

        Book book1 = new Book("Приключения", "Иванов И. И.","2000 г.");
        Book book2 = new Book("Словарь", "Сидоров А. В", "1980 г.");
        Book book3 = new Book("Энциклопедия", "Гусев К. В.", "2010 г.");
        Book[] books = {book1, book2, book3};

        printReaders(readers);
        printBooks(books);

        reader1.takeBook(3);
        reader1.takeBook("Приключения", "Словарь", "Энциклопедия");
        reader1.takeBook(book1, book2, book3);

        reader1.returnBook(3);
        reader1.returnBook("Приключения", "Словарь", "Энциклопедия");
        reader1.returnBook(book1, book2, book3);
    }

    private static void printBooks(Book[] books) {
        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println();
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println( reader.getInfo());
        }
        System.out.println();
    }
}
