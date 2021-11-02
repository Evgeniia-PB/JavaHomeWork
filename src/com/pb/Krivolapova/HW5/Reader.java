package com.pb.Krivolapova.HW5;


public class Reader {
    String FullName;
    int libraryCardNumber;
    String faculty;
    String DateOfBirth;
    String phone;

    public Reader(String FullName, int libraryCardNumber, String faculty, String DateOfBirth, String phone) {
        this.FullName = FullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.DateOfBirth = DateOfBirth;
        this.phone = phone;
    }

    public String getFullName() {
        return  FullName;
    }
    public void setFullName(String FullName) {
        FullName = FullName;
    }
    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }
    public void setLibraryCardNumber(int libraryCardNumber) {
        libraryCardNumber = libraryCardNumber;
    }
    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        faculty = faculty;
    }
    public String getDateOfBirth() {
        return DateOfBirth;
    }
    public void setDateOfBirth(String DateOfBirth) {
        DateOfBirth = DateOfBirth;
    }
    public String getPhone() { return phone;    }
    public void setPhone(String phone) {
        phone = phone;
    }
    public void takeBook(int libraryCardNumber) {
        System.out.println(FullName + " взял " + libraryCardNumber + " книги.");
    }
    public void takeBook(String... books) {
        System.out.println(FullName + " взял следующие книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }
    public void takeBook(Book... books) {
        System.out.println(FullName + " взял следующие книги:");
        for (Book book : books) {
            System.out.println(book.getTitle() + "(" + book.getAutor() +" " + book.getYear() + ")");
        }
        System.out.println();
    }
    public void returnBook(int libraryCardNumber) {
        System.out.println(FullName + " вернул " + libraryCardNumber + " книги.");
    }
    public void returnBook(String... books) {
        System.out.println(FullName + " вернул следующие книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }
    public void returnBook(Book... books) {
        System.out.println(FullName + " вернул следующие книги:");
        for (Book book : books) {
            System.out.println(book.getTitle() + "(" + book.getAutor() +" " + book.getYear() + ")");
        }
        System.out.println();
    }
    public String getInfo() {
        return "{" +
                "Имя читателя " + FullName +
                ", Читательский номер:" + libraryCardNumber +
                ", Факультет " + faculty  +
                ", Дата рождения " + DateOfBirth  +
                ", Телефон " + phone  +
                "}";
    }
}
