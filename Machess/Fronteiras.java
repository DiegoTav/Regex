package teorias.Machess;

/*
Fronteiras = Permitem definir onde
se inicia ou termina uma String
 */

public class Fronteiras {
    public static void main(String[] args) {

       // prontuario comeca com 18
        System.out.println("185566".matches("^18.*")); //true
        System.out.println("18".matches("^18.*")); //true
        System.out.println("181".matches("^18.*")); //true
        System.out.println("155566".matches("^18.*")); //false

        // termina com 18
        System.out.println("01/01/2018".matches(".*2018$")); //true
        System.out.println("2018".matches(".*2018$")); //true
        System.out.println("aaaaa2018".matches(".*2018$")); //true
        System.out.println("aaaa2018a".matches(".*2018$")); //false

        // proucura 2018 no texto
        System.out.println("aaa2018a".matches(".*2018.*")); //true
        System.out.println("Nasci em 2018".matches(".*2018.*")); //true
        System.out.println("Em 2018 farei 10 anos".matches(".*2018.*")); //true
        System.out.println("Em 20 18 farei 10 anos".matches(".*2018.*")); //false

        // pesquisa uma lista de palavras
        System.out.println("sim".matches("sim|não")); //true
        System.out.println("não".matches("sim|não")); //true
        System.out.println("nao".matches("sim|não")); //false
        System.out.println("talvez".matches("sim|não")); //false

    }
}
