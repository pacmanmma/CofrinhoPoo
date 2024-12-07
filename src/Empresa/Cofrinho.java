package Empresa;

import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<Moeda> moedas;

    public Cofrinho() {
        this.moedas = new ArrayList<>();
    }

    // Método para adicionar uma moeda ao cofrinho
    public void adicionar(Moeda moeda) {
        this.moedas.add(moeda);
    }

    // Método para remover uma moeda do cofrinho
    public void remover(Moeda moeda) {
        this.moedas.remove(moeda);
    }

    // Método para listar todas as moedas no cofrinho
    public void listagemMoeda() {
        if (this.moedas.isEmpty()) {
            System.out.println("Seu cofrinho está vazio!");
        } else {
            for (Moeda moeda : this.moedas) {
                moeda.info(); // Exibe informações sobre a moeda
            }
        }
    }

    // Método para obter o valor total convertido em reais
    public double totalConvertido() {
        if (this.moedas.isEmpty()) {
            return 0.0;
        }

        double valorAcumulado = 0.0;
        for (Moeda moeda : this.moedas) {
            valorAcumulado += moeda.converter(); // Certifique-se de que o método é "converter"
        }
        return valorAcumulado;
    }
}