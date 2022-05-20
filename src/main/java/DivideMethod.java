public class DivideMethod {
    public static String divide(int n1, int n2){
        return n1 + " / " + n2 + " = " + (double) n1 / (double) n2;
    }

    public static void main(String[] args) {

        System.out.println(divide(1, 3));
    }
}
