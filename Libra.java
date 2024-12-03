class LibraEsterlina extends Divisa {
    public LibraEsterlina(double valor) {
        super(valor);
    }

    @Override
    public double convertir(Divisa destino) {
        if (destino instanceof LibraEsterlina) {
            return valor;
        } else if (destino instanceof Euro) {
            return valor * 1.20;
        } else if (destino instanceof Dolar) {
            return valor * 1.29;
        } else if (destino instanceof Yen) {
            return valor * 198.16;
        } else if (destino instanceof PesoMexicano) {
            return valor * 26.02;
        }
        return valor;
    }
}