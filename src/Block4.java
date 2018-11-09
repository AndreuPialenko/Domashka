public class Block4 {

    final static int applesPete = 10;
    final static int applesTotal = 15;

    public static void main(String[] args) {

        calculate();
        print(5);

    }

    public static int calculate(){

        int apples = applesTotal - applesPete;
        return apples;
    }

    public static void print(int apples){
        System.out.println("Если у Пети 10 яблок, а всего их 15, то у Васи тогда будет " + apples + " яблок.");

    }
}
