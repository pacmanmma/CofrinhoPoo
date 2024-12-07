package Empresa;

public class Euro extends Moeda {
    public Euro(double valor) {
        super(valor); // Chama o construtor da classe Moeda
    }

    @Override
    public void info() {
        System.out.println("Moeda: Euro | Valor: " + this.valor);
    }

    @Override
    public double converter() {
        double taxaConversao = 6.0; // Exemplo: 1 euro = 6 reais
        return this.valor * taxaConversao;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;

        Euro euroObject = (Euro) object;
        return Double.compare(this.valor, euroObject.valor) == 0;
    }
}