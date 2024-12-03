abstract class Divisa {
    protected double valor;

    public Divisa(double valor) {
        this.valor = valor;
    }

    // Método abstracto para convertir a otra divisa
    public abstract double convertir(Divisa destino);
}   