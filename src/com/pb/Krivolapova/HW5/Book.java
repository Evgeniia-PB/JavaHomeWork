package com.pb.Krivolapova.HW5;

public class Book {
    String title;
    String autor;
    String year;

    public Book(String title, String autor, String year) {
        this.title = title;
        this.autor = autor;
        this.year = year;
    }
    public Book() {
    }
     public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        title = title;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        autor = autor;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        year = year;
    }
    public String getInfo() {
        return "{" +
                "Название книги '" + title + '\'' +
                ", Автор " + autor +
                ", Издано в " + year + '\'' +
                '}';
    }

}
