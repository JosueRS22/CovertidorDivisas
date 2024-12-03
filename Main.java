import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcionO, opcionD;
        double cantidad;

        do {
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1) Euro");
            System.out.println("2) Dolár");
            System.out.println("3) Libra Esterlina");
            System.out.println("4) Yen");
            System.out.println("5) Peso Mexicano");
            System.out.println("6) Salir");
            System.out.print("Seleccione divisa de origen: ");
            opcionO = scanner.nextInt();
            if (opcionO == 6){
                break;
            }

            System.out.print("Ingrese cantidad: ");
            cantidad = scanner.nextDouble();
        
            Divisa divisaOrigen = null;
            switch (opcionO) {
                case 1:
                    divisaOrigen = new Euro(cantidad);
                    break;
                case 2:
                    divisaOrigen = new Dolar(cantidad);
                    break;
                case 3:
                    divisaOrigen = new LibraEsterlina(cantidad);
                    break;
                case 4:
                    divisaOrigen = new Yen(cantidad);
                    break;
                case 5:
                    divisaOrigen = new PesoMexicano(cantidad);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    continue;
            }


            System.out.println("\nSeleccione divisa de destino: ");
            System.out.println("1) Euro");
            System.out.println("2) Dólar");
            System.out.println("3) Libra Esterlina");
            System.out.println("4) Yen");
            System.out.println("5) Peso Mexicano");
            System.out.print("Seleccione divisa de destino: ");
            opcionD = scanner.nextInt();

            Divisa divisaDestino = null;
            switch (opcionD) {
                case 1:
                    divisaDestino = new Euro(0);
                    break;
                case 2:
                    divisaDestino = new Dolar(0);
                    break;
                case 3:
                    divisaDestino = new LibraEsterlina(0);
                    break;
                case 4:
                    divisaDestino = new Yen(0);
                    break;
                case 5:
                    divisaDestino = new PesoMexicano(0);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    continue;
            }

            double resultado = divisaOrigen.convertir(divisaDestino);
            System.out.println("\n" + cantidad + " de divisa origen se convierte en: " + resultado + " en la divisa destino.");

        }while (true);
    }
}
