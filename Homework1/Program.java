package Homework1;

public class Program {
    public static void main(String[] args) {
        Eggs eggs = new Eggs("Яйцо куриное С1", "дес.", 10, 9, "11.01.23", 10);
        System.out.println(eggs.toString());
        Lemonade lemonade = new Lemonade("Буратино", "бут.", 2.90, 10, 0.5);
        System.out.println(lemonade.toString());
    }

}
