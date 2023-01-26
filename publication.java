package assingment4;

import java.util.*;

public class publication {

    private String title;
    private float price;

    public publication() {
    }

    public publication(String title, float price) {
        this.title = title;
        this.price = price;
    }

    public void readdata() {
        System.out.println("enter book title");
        Scanner t = new Scanner(System.in);
        title = t.next();
        this.title = title;

        System.out.println("enter book price");
        Scanner p = new Scanner(System.in);
        price = p.nextFloat();
        this.price = price;
    }

    public void printdata() {
        System.out.println("book title : " + title + "\n book price : " + price +" $ ");

    }

}
