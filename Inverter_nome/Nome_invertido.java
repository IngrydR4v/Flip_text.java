import java.util.Scanner;

public class Nome_invertido {

    public static void inverterNome() {

        //Algoritmo que leia o nome do usuário e retorne o nome invertido.

        Scanner name = new Scanner(System.in);
        System.out.println("Informe um nome: ");
        int cont;
        String names = name.nextLine();
        cont = names.length();

        while (!(cont == 0)) {
            cont--;
            System.out.print(names.charAt(cont));

        }
    }
}
