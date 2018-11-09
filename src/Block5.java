public class Block5 {



    public static void main(String[] args) {  //Тут я не понял как перенести:int applesPete = 10;int applesTotal = 15;
                                              //Чтобы они считались в calculate()

        calculate(10,15);
        print(5);

    }

    public static int calculate(int applesPete, int applesTotal){

        int apples = applesTotal - applesPete;
        return apples;
    }

    public static void print(int apples){
        System.out.println("Если у Пети 10 яблок, а всего их 15, то у Васи тогда будет " + apples + " яблок.");

    }
}
