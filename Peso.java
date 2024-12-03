class PesoMexicano extends Divisa {
    public PesoMexicano(double valor) {
        super(valor);
    }

    @Override
    public double convertir(Divisa destino) {
        if (destino instanceof PesoMexicano) {
            return valor;
        } else if (destino instanceof Euro) {
            return valor * 0.046;
        } else if (destino instanceof Dolar) {
            return valor * 0.050;
        } else if (destino instanceof LibraEsterlina) {
            return valor * 0.038;
        } else if (destino instanceof Yen) {
            return valor * 7.62;
        }
        return valor;
    }
}