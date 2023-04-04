package teorias.Machess;

/*
Agrupadores = Permitem expressões regulares avançadas,
agrupando conjuntos e/ou intervalos de caracteres.
 */

public class Agrupadores {
    public static void main(String[] args) {

        // uma letra entre a e z
        System.out.println("a".matches("[a-z]")); //true
        System.out.println("x".matches("[a-z]")); //true
        System.out.println("A".matches("[a-z]")); //false

        // idem anterior, permitindo maiusculas
        System.out.println("a".matches("[a-z]|[A-Z]")); //true
        System.out.println("A".matches("[a-z]|[A-Z]")); //true
        System.out.println("x".matches("[a-z]|[A-Z]")); //true
        System.out.println("1".matches("[a-z]|[A-Z]")); //false

        // nao pode comecar com numero
        System.out.println("Diego".matches("[^0-9].*")); //true
        System.out.println("Dt2018".matches("[^0-9].*")); //true
        System.out.println("2018".matches("[^0-9].*")); //false

        // nao pode comecar com letra
        System.out.println("2018".matches("[^a-z][^A-Z].*")); //true
        System.out.println("2018DT".matches("[^a-z][^A-Z].*")); //true
        System.out.println("dt2018".matches("[^a-z][^A-Z].*")); //false

        // validacao de email
        System.out.println("dtescola@ufpb.dcx.br".matches(".*@\\w{2,}[.]\\w{2,}.*")); //true
        System.out.println("dtescola@gmail.com".matches(".*@\\w{2,}[.]\\w{2,}.*")); //true
        System.out.println("dtescola@gmail".matches(".*@\\w{2,}[.]\\w{2,}.*")); //false
        System.out.println("dtescola@ufpb".matches(".*@\\w{2,}[.]\\w{2,}.*")); //false
    }
}
