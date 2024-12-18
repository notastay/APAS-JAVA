package Facil;
/*Un programa que escribe la representacion de numeros de 1 a N 
 Pero para los multiplos de 3 se imprimira Fizz en vez de el numero, 
 y para los multiplos de 5 se imprimira "Buzz", 
 para los que sean multiplos de ambos se escribira "FizzBuzz".
*/
public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(FizzBuzzMultiplos(199999));
    }
    public static String FizzBuzzMultiplos(int n){
        String multiplos="";
        for (int i = 1; i <= n; i++) {
            if(i%3==0&&i%5==0){
                multiplos+="FizzBuzz";
            }else if(i%3==0){
               multiplos+="Fizz";
            }else if(i%5==0){
                multiplos+="Buzz";
            }else{
                multiplos+=i;
            }
            multiplos+="\n";
        }
        return multiplos;
    }
}
