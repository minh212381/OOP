
package controller;

public class Display {

    public static void menu() {
        System.out.println("====== Login Program ======");
        System.out.println("1. Vietnamese");
        System.out.println("2. English");
        System.out.println("3. Exit");
    }
    public static void displayErr(String err) {
        System.err.println(err);
    }
}
