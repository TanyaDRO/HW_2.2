public class Main {
    public static void main(String[] args) {

        int account = 100;
        int amount = 1100;
        int total;
        int bonus;
        if (amount > 1_000) {
            bonus = amount / 100;
            total = account + amount + bonus;
        } else {
            total = account + amount;
            bonus = 0;
        }
        System.out.println("Счёт: " + total);
        System.out.println("Бонус: " + bonus);
    }
}