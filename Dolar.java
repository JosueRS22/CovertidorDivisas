class Dolar extends Divisa {
    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public double convertir(Divisa destino) {
        if (destino instanceof Dolar) {
            return valor;
        } else if (destino instanceof Euro) {
            return valor * 0.93;
        } else if (destino instanceof LibraEsterlina) {
            return valor * 0.77;
        } else if (destino instanceof Yen) {
            return valor * 153.52;
        } else if (destino instanceof PesoMexicano) {
            return valor * 20.16
        }
        return valor;
    }
}