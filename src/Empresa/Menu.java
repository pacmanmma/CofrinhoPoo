package Empresa;

import java.util.Scanner;

public class Menu {
    private Scanner put1;
    private Cofrinho cofrinho;

    public Menu() {
        put1 = new Scanner(System.in);
        cofrinho = new Cofrinho();
    }

    public void showMenu() {
        System.out.println("---------------------");
        System.out.println("BEM VINDO AO COFRINHO DO LUCAS RU: 4513679");
        System.out.println("O QUE VOCE DESEJA?");
        System.out.println("----------------------");
        System.out.println("1 - Adicionar Moeda");
        System.out.println("2 - Remover Moeda");
        System.out.println("3 - Listar Moedas");
        System.out.println("4 - Obter valor convertido");
        System.out.println("5 - Sair");
        System.out.println("----------------------");
        System.out.println("Digite sua opção:");

        String opcao = put1.nextLine();

        switch (opcao) {
            case "5":
                System.out.println("Finalizando operação!");
                put1.close(); // Fechando o Scanner
                break;

            case "1":
                System.out.println("Escolha a moeda: ");
                System.out.println("1 - Real");
                System.out.println("2 - Dolar");
                System.out.println("3 - Euro");

                int opcao2 = put1.nextInt();
                put1.nextLine(); // Consumir nova linha

                System.out.println("Digite o Valor:");
                double valor = put1.nextDouble();
                put1.nextLine(); // Consumir nova linha

                if (opcao2 == 1) {
                    Real moeda = new Real(valor);
                    cofrinho.adicionar(moeda);
                } else if (opcao2 == 2) {
                    Dolar moeda = new Dolar(valor);
                    cofrinho.adicionar(moeda);
                } else if (opcao2 == 3) {
                    Euro moeda = new Euro(valor);
                    cofrinho.adicionar(moeda);
                } else {
                    System.out.println("Moeda não cadastrada, tente outra");
                }
                System.out.println("Adicionado!");
                showMenu();
                break;

            case "2":
                System.out.println("Escolha a moeda: ");
                System.out.println("1 - Real");
                System.out.println("2 - Dolar");
                System.out.println("3 - Euro");

                int opcao3 = put1.nextInt();
                put1.nextLine(); // Consumir nova linha

                System.out.println("Digite o Valor:");
                double valor2 = put1.nextDouble();
                put1.nextLine(); // Consumir nova linha

                if (opcao3 == 1) {
                    Real moeda = new Real(valor2);
                    cofrinho.remover(moeda);
                } else if (opcao3 == 2) {
                    Dolar moeda = new Dolar(valor2);
                    cofrinho.remover(moeda);
                } else if (opcao3 == 3) {
                    Euro moeda = new Euro(valor2);
                    cofrinho.remover(moeda);
                } else {
                    System.out.println("Moeda não cadastrada, tente outra");
                }
                System.out.println("Removido!");
                showMenu();
                break;

            case "3":
                // Listar todas as moedas no cofrinho
                cofrinho.listagemMoeda();
                showMenu();
                break;

            case "4":
                // Obter o valor total convertido em reais
                double converterValor = cofrinho.totalConvertido();
                System.out.println("Valor total convertido para reais: " + converterValor);
                showMenu();
                break;

            default:
                System.out.println("Opção inválida! Por favor, escolha novamente.");
                showMenu();
                break;
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.showMenu();
    }
}
