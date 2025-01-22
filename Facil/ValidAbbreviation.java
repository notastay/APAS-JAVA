package Facil;

/*Dado un string no vacio y una abreviacion abbr, 
devuelve un booleano si la abreviacion en valida con el String 

ej abbr validas word;
["word", "1ord", "w1rd", "2rd", "w2d", 
"wo2", "1o1d", "1o2", "2r1", "3d", "4"]

Asumimos que el string solo contiene letras minusculas y 
abbr solo contendra letras minusculas y digitos
*/
public class ValidAbbreviation {
    public static void main(String[] args) {
        System.out.println(isAbbreviation("hola", "4"));
        System.out.println(isAbbreviation("salmon", "sal3  "));
    }

    public static boolean isAbbreviation(String palabra, String abbr) {
        if ((abbr!=null)  && (palabra!=null)) {
            abbr = abbr.trim();
            palabra = palabra.trim();
            int posImaginarias = 0;
            int stringToNum;

            // Caso especial: abbr es un número que equivale a la longitud de la palabra
            if (abbr.matches("\\d+")) { // Verifica si abbr es un número completo
                int numero = Integer.parseInt(abbr);
                return numero == palabra.length();
            }
            if (abbr.matches("[a-z0-9]+") &&(!abbr.isBlank())&& (!palabra.isBlank()) &&  palabra.matches("[a-z]+")) {
                int bucle = abbr.length();
                for (int i = 0; i < bucle; i++) {
                    String charActual = abbr.substring(i, i + 1);
                    if (charActual.matches("[0-9]")) {
                        stringToNum = Integer.parseInt(charActual);
                        posImaginarias += stringToNum;
                    } else {
                        posImaginarias++;
                    }
                }

                if (posImaginarias == palabra.length()) {
                    return true;
                } else
                    return false;
            }
        }

        return false;
    }

}