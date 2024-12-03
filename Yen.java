class Yen extends Divisa {
    public Yen(double valor) {
        super(valor);
    }

    @Override
    public double convertir(Divisa destino) {
        if (destino instanceof Yen) {
            return valor;
        } else if (destino instanceof Euro) {
            return valor * 0.0061; 
        } else if (destino instanceof Dolar) {
            return valor * 0.0065;
        } else if (destino instanceof LibraEsterlina) {
            return valor * 0.0050;
        } else if (destino instanceof PesoMexicano) {
            return valor * 0.13;
        }
        return valor;
    }
}