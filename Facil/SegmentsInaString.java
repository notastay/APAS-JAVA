package Facil;
/*Dado una cadena, devolver el numero de segmentos(palabras) en esa cadena
 * Restricciones:
 * 0<=cadena.length()<=300
 * cadena consiste de letras mayus/minusculas, digitos, 
 * o uno de los siguientes caracteres "!@#$%^&*()_+-=',.:"
 * El unico caracter valido como espacio es ' '.
 */

public class SegmentsInaString {
    public static void main(String[] args) {
        System.out.println(SegmentCounter("Hola,    Buenas! Que tal, Maria se come 3 patatas con jamon, york! y queso de cabra"));
        System.out.println(SegmentCounter("holi"));

    }

    public static int SegmentCounter(String cadena){
        cadena=cadena.trim();
        int contadorSegmentos=0;
        if((!cadena.equals(null))&&cadena.length()<=300 &&0<=cadena.length()&&cadena.matches("^[a-zA-Z0-9!@#$%^&*()_+-=',.: ]*")&&(!cadena.isBlank())){
            for (int i = 0; i < cadena.length(); i++) {
                String charActual=cadena.substring(i,i+1);
                if(charActual.equals(" ")&&(!cadena.substring(i+1,i+2).equals(" "))){
                    contadorSegmentos++;
                }
            }
            if(cadena.matches("^[a-zA-Z0-9!@#$%^&*()_+-=',.: ]*")){
                contadorSegmentos++;    
            }
            return contadorSegmentos;
        }
        return 0;
    }
}
