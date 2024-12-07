package Empresa;

public class Real extends Moeda {
    public Real(double valor) {
        super(valor); // Chama o construtor da classe Moeda
    }

    @Override
    public void info() {
        System.out.println("Moeda: Real | Valor: " + this.valor);
    }

    @Override
    public double converter() {
        // Real para real (não precisa de conversão, retorna o mesmo valor)
        return this.valor;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;

        Real realObject = (Real) object;
        return Double.compare(this.valor, realObject.valor) == 0;
    }
}