package principal;

import model.Banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Banco bc = new Banco();

        System.out.println("Digite o seu ID: ");
        bc.setID(input.nextInt());
        System.out.println("Digite o seu nome: ");
        bc.setNome(input.next());

        System.out.println("Você deseja realizar um deposito? (y/n) ");
        String escolha = input.next();

        switch (escolha) {
            case "y":
                System.out.println("Digite o valor de depósito: ");
                bc.depoistar(Double.parseDouble(input.next()));

                System.out.println(bc.toString());
                System.out.println("####################");
                System.out.println("Você deseja realizar um saque? (y/n) ");

                switch (input.next()) {
                    case "y":
                        System.out.println("Digite o valor de saque: ");
                        System.out.println(bc.sacar(Double.parseDouble(input.next())));

                        break;
                    case "n":
                        System.out.println(bc.toString());
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha novamente.");
                        break;
                }
            case "n":
                System.out.println(bc.toString());
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha novamente.");
                break;


        }


    }
}