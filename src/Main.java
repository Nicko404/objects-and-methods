public class Main {

    public static void main(String[] args) {
//        Basket basket = new Basket();
//        basket.add("Milk", 40);
//        basket.print("Milk");
        Basket basket = new Basket();
        basket.add("Bread", 3, 1, 100);
        basket.add("Milk", 2, 2, 1000);
        basket.add("Patato", 1, 20, 100);

        basket.print("Корзина Коли");
        System.out.println("Общая стоимость товаров: " + basket.getTotalPrice() + "р");
        System.out.println("Общий вес корзины: " + basket.getTotalWeight() + " гр.");

        Arithmetic arithmetic = new Arithmetic(25, 17);

        System.out.println("Минимальное из двух чисел: " + arithmetic.min());
        System.out.println("Максимальное из двух чисел: " + arithmetic.max());
        System.out.println("Сумма двух чисел: " + arithmetic.sum());
        System.out.println("Произведение двух чисел: " + arithmetic.productOfNumbers());

        Printer printer = new Printer();

        printer.append("Текст номер 1");
        printer.append("Текст номер 2", "Название второго текста");
        printer.append("Текст номер 3", "Название трейтего текста", 15);

        System.out.println("Колл-во страниц напечатанных за всё время: " + printer.getTotalPagesPrinted());
        System.out.println("Кол-во страниц подготоаленных на печать: " + printer.getPendingPagesCount());
        printer.print();

        System.out.println("Колл-во страниц напечатанных за всё время: " + printer.getTotalPagesPrinted());
        printer.print();
        System.out.println("Кол-во страниц подготоаленных на печать: " + printer.getPendingPagesCount());
        System.out.println("Колл-во страниц напечатанных за всё время: " + printer.getTotalPagesPrinted());
    }
}
