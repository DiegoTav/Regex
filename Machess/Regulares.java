package teorias.Machess;

/*
Expressoes Regulares = formata/filtra String,
empregam metacaracteres para filtrar seu conteudo
 */

public class Regulares {
    public static void main(String[] args) {

        //validacao de 1 caracter
        System.out.println("1".matches(".")); //true
        System.out.println("a".matches(".")); //true
        System.out.println("aa".matches(".")); //false

        //validacao de 2 caracteres
        System.out.println("ab".matches("..")); //true
        System.out.println("///".matches("..")); //false

        //um digito numerico
        System.out.println("1".matches("\\d")); //true
        System.out.println("a1".matches("\\d")); //false
        System.out.println("-9".matches("\\d")); //false

        //dois digitos numericos
        System.out.println("10".matches("\\d\\d")); //true
        System.out.println("100".matches("\\d\\d")); //false


        //um caractere e um digito numerico
        System.out.println("a1".matches("\\w\\d")); //true
        System.out.println("aa1".matches("\\w\\d")); //false

        //dois caractere e um digito numerico
        System.out.println("aa1".matches("\\w\\w\\d")); //true
        System.out.println("a11".matches("\\w\\w\\d")); //true
        System.out.println("111".matches("\\w\\w\\d")); //true
        System.out.println("11a".matches("\\w\\w\\d")); //false

        //um caractere especial
        System.out.println("@".matches("//W")); //true
        System.out.println(".".matches("//W")); //true
        System.out.println("/".matches("//W")); //true
        System.out.println("%/".matches("//W")); //false

        //espaco em branco ou tabulacao
        System.out.println(" ".matches("//s")); //true
        System.out.println("  ".matches("//s")); //false

    }
}
