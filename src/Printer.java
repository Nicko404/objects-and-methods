public class Printer {

    private String queue = "";
    private int pendingPagesCount = 0;
    public static int totalPagesPrinted = 0;

    public void append(String text) {
        append(text, "Без названия", 1);
    }

    public void append(String text, String name, int pages) {
        queue = queue + name + "\n" + text + "\n\n";
        pendingPagesCount += pages;
    }

    public void append(String text, String name) {
        append(text, name, 1);
    }

    public void clear() {
        queue = "";
        pendingPagesCount = 0;
    }

    public void print() {
        if (queue.isEmpty()) {
            System.out.println("Отстуствует текст для печати");
            return;
        }
        System.out.println(queue);
        totalPagesPrinted += pendingPagesCount;
        clear();
    }

    public int getPendingPagesCount() {
        return pendingPagesCount;
    }

    public int getTotalPagesPrinted() {
        return totalPagesPrinted;
    }


}
