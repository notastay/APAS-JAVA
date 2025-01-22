package Facil;

public class ReverseInteger {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Original: " + num);
        System.out.println("Reversed: " + reverse(num));

        num = -9876;
        System.out.println("Original: " + num);
        System.out.println("Reversed: " + reverse(num));
    }

    public static int reverse(int numero){
        int reversed=0;

        while (numero !=0) {
            int digito=numero%10;
            numero /=10;
            if(reversed > Integer.MAX_VALUE/10 || reversed < Integer.MIN_VALUE/10){
                System.out.println("Desbordamiento de enteros al invertir");
            }

            reversed=reversed*10+digito;
            
        }
        return reversed;

    }
}
