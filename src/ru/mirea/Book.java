package ru.mirea;

public class Book {
    private String author;
    private String name;
    private int year;
    private int size;
    private  String izdanie;
    public Book(String author, String name, int year, int size,String izdanie) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.size=size;
        this.izdanie=izdanie;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", size=" + size +
                ", izdanie='" + izdanie + '\'' +
                '}';
    }
}

