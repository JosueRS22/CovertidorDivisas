class Euro extends Divisa {
    public Euro(double valor) {
        super(valor);
    }

    @Override
    public double convertir(Divisa destino) {
        if (destino instanceof Euro) {
            return valor;
        } else if (destino instanceof Dolar) {
            return valor * 1.07; 
        } else if (destino instanceof LibraEsterlina) {
            return valor * 0.83;
        } else if (destino instanceof Yen) {
            return valor * 164.47;
        } else if (destino instanceof PesoMexicano) {
            return valor * 21.59;
        }
        return valor;
    }
}
