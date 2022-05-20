public class AverageMethod {
    public static double sum(double n1, double n2, double n3){
        return n1+n2+n3;
    }

    public static double average(double n1, double n2, double n3){
        return sum(n1,n2,n3)/3;
    }

    public static void main(String[] args) {
        System.out.println(average(2, 5, 8));
    }
}
