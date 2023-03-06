package Homework1;

public class Program {
    public static void printProductProps(Product product) {
        System.out.println(product.toString());
    }

    public static void main(String[] args) {
        Bread bread = new Bread("Хлеб Дарницкий", "шт.", 12.5, 5,
                "24.01.2021", "цельнозерновой");
        printProductProps(bread);

        Diapers diapers = new Diapers("Подгузники Хаггис", "упак.", 1500,
                150, "6 мес.", false, "2", 4,
                6, "для девочек");
        printProductProps(diapers);

        Eggs eggs = new Eggs("Яйцо куриное С1", "дес.", 10, 9,
                "11.01.23", 10);
        printProductProps(eggs);

        Lemonade lemonade = new Lemonade("Буратино", "бут.", 2.90, 10, 0.5);
        printProductProps(lemonade);

        Masks masks = new Masks("Маска защитная", "шт.", 5, 100, 1);
        printProductProps(masks);

        Milk milk = new Milk("Молоко цельное", "бут.", 90.0, 24,
                "13.01.23", 3.2);
        printProductProps(milk);

        Pacifier pacifier = new Pacifier("Соска-пустышка", "шт.", 150.0,
                200, "1 год", true);
        printProductProps(pacifier);

        ToiletPaper toiletPaper = new ToiletPaper("Туалетная бумага Мягкая", "упак.",
                350, 100, 24, 4);
        printProductProps(toiletPaper);
    }

}
