package assingment4;

import java.util.Scanner;

public class soundbook extends publication {

    float time;

    public soundbook() {
    }

    public soundbook(float time, String title, float price) {
        super(title, price);
        this.time = time;
    }

    @Override
    public void readdata() {
        super.readdata();
        System.out.println("time : ");
        Scanner ti = new Scanner(System.in);
        time = ti.nextFloat();
        this.time = time;
    }

    @Override
    public void printdata() {
        super.printdata();
        System.out.println(" time : " + time + " seconds");
    }

}
