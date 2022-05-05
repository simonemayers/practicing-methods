public class MethodReturnTypes {
    public static String returnString(){
        return "Hello World";
    }

    public static int returnInt(){
        return 1;
    }

    public static boolean returnBoolean(){
        return true;
    }

    public static void main(String[] args) {
        System.out.println(returnString());
        System.out.println(returnInt());
        System.out.println(returnBoolean());
    }
}
