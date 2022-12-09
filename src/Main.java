public class Main {
    public static void main(String[] args) {
        int check = 100;
        int refill = 1253;

        if (refill >= 1000) {
            int bonus = refill / 100;
            check = check + refill + bonus;
            System.out.println("Бонусов начисленно = " + bonus);
            System.out.println("На вашем счету = " + check);
        } else {
            check = check + refill;
            System.out.println("На вашем счету = " + check);
        }
    }
}