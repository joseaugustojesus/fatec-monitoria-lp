public class DivisaoInteiraReal {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        System.out.println( ( a / b ));
        System.out.println( (double) a / b );
        System.out.println( (float) a / b);
        System.out.println( (double) a / (float)b);
        System.out.println( Integer.parseInt(Integer.toString(a)) /b);
    }
}