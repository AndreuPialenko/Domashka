public class Block3 {
    public static void main(String[] args) {

        calculate();
        print(5);

    }

    public static int calculate(){
        int Petia = 10;
        int a = 15;
        int Vasia = a - Petia;
        return Vasia;
    }

    public static void print(int apples){
        System.out.println("Если у Пети 10 яблок, а всего их 15, то у Васи тогда будет " + apples + " яблок.");

    }

}