package Codeblock;

public class codeblock {
    public static void main(String[] args) {
        Movie hello = new Movie("hello");
        Movie movie = new Movie("tt", 100, "chen");
    }
}

class Movie{
    private String name;
    private double price;
    private String director;

    //代码块
    //不管调用哪个构造器，创建对象，都会先调用代码块的内容
    //代码块调用的顺序优先于代码块
    {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
    }

    //构造器

    public Movie(String name) {
        System.out.println("public Movie(String name)被调用");
        this.name = name;
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        System.out.println("public Movie(String name, double price, String director)");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
