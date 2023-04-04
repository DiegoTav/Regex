package teorias.Machess;

/*
Quantificadores = permitem declarar a quantidade
de digitos ou caracteres em uma expressao regular
 */

public class Quantificadores {
    public static void main(String[] args) {

        // dois digitos numericos
        System.out.println("12".matches("\\d{2}")); //true
        System.out.println("12".matches("\\d{3}")); //false

        // dois digitos ou mais
        System.out.println("12".matches("\\d{2,}")); //true
        System.out.println("123".matches("\\d{2,}")); //true
        System.out.println("1".matches("\\d{2,}")); //false


        // limitando de 2 a 3 digitos
        System.out.println("12".matches("\\d{2,3}")); //true
        System.out.println("123".matches("\\d{2,3}")); //true
        System.out.println("1".matches("\\d{2,3}")); //false
        System.out.println("1234".matches("\\d{2,3}")); //false

        // validacao de cep
        System.out.println("14781-000".matches("\\d{5}-\\d{3}")); //true
        System.out.println("14781000".matches("\\d{5}-\\d{3}")); //false
        System.out.println("147810000".matches("\\d{5}-\\d{3}")); //false
        System.out.println("14.781-000".matches("\\d{5}-\\d{3}")); //false

        // validacao de data
        System.out.println("1/1/2000".matches("\\d{1,}/\\d{1,}/\\d{4}")); //true
        System.out.println("01/01/2000".matches("\\d{1,}/\\d{1,}/\\d{4}")); //true
        System.out.println("27/2/1889".matches("\\d{1,}/\\d{1,}/\\d{4}")); //true
        System.out.println("27/2/89".matches("\\d{1,}/\\d{1,}/\\d{4}")); //false

    }
}
