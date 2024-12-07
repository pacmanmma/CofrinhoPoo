package Empresa;

public abstract class Moeda {
    protected double valor; // Tornar `valor` protegido para subclasses

    // Construtor para inicializar o valor da moeda
    public Moeda(double valor) {
        this.valor = valor;
    }

    // Método abstrato para exibir informações da moeda
    public abstract void info();

    // Método abstrato para converter o valor da moeda para outra moeda (ex: Real)
    public abstract double converter();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Moeda otherMoeda = (Moeda) obj;
        return Double.compare(this.valor, otherMoeda.valor) == 0;
    }

    // Método getter para obter o valor
    public double getValor() {
        return valor;
    }
}