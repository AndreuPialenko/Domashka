public class Block2 {
    public static void main(String[] args) {

        calculate();
        int Vasia = calculate();

        System.out.println("Если у Пети 10 яблок, а всего их 15, то у Васи тогда будет " + Vasia + " яблок.");
    }

    public static int calculate(){
        int Petia = 10;
        int a = 15;
        int Vasia = a - Petia;
        return Vasia;
    }

}
