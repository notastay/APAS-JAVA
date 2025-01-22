package Facil;


/*Dado un array de integers, devuelve 2 numeros para que sumen a un numero
 * No puedes usar el  mismo numero mas de una vez
 */
public class TwoSum {
    public static void main(String[] args) {
        int numeros[]=new int[]{2,7,11,15};
        dosSuman(numeros, 9);
    }
    
    public static void dosSuman(int[] numeros, int numero){
        int sumaTemp=0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if(numeros[i]==numeros[j]){
                    continue;
                }
                sumaTemp=numeros[i]+numeros[j];
                if(sumaTemp==numero){
                    System.out.println(numeros[i]+ " + "+ numeros[j]+" = "+numero);
                }

            }
        }
    }
}
