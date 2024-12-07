package Empresa;

public class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Moeda: Dólar | Valor: " + this.valor);
    }

    @Override
    public double converter() {
        double taxaConversao = 5.0; // Exemplo: 1 dólar = 5 reais
        return this.valor * taxaConversao;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;

        Dolar dolarObject = (Dolar) object;
        return Double.compare(this.valor, dolarObject.valor) == 0;
    }
}