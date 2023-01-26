package assingment4;

import java.util.Scanner;

public class book extends publication {

    private int pagecount;

    public book() {
    }

    public book(String title, float price, int pagecount) {
        super(title, price);
        this.pagecount = pagecount;
    }

    @Override
    public void readdata() {
        super.readdata();
        System.out.println("enter page count : " );
        Scanner p = new Scanner(System.in);
        pagecount = p.nextInt();
        this.pagecount = pagecount;
    }

    @Override
    public void printdata() {
        super.printdata();
        System.out.println("page count : " + pagecount + " pages ");
    }

}
