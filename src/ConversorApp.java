import java.util.Scanner;

public class ConversorApp {
    public static void main(String[] args) {

        CambioMoneda cambio = new CambioMoneda();
        ConversionResponse response = cambio.guardarMoneda();

        if ("success".equals(response.getResult())) {
            ConversorApp app = new ConversorApp();
            app.moneda(response);  // pasamos el objeto con las tasas
        } else {
            System.out.println("No se pudo obtener las tasas de conversión.");
        }

    }
    public void moneda(ConversionResponse moneda){
        Scanner scn = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("********************************");
            System.out.println("Bienvenido/a al Conversor de Moneda");
            System.out.println("1) Dólar => Peso Argentino");
            System.out.println("2) Peso Argentino => Dólar");
            System.out.println("3) Dólar => Real brasileño");
            System.out.println("4) Real brasileño => Dólar");
            System.out.println("5) Dólar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dólar");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scn.nextInt();

            double cantidad, resultado;

            switch (opcion){
                case 1:
                    System.out.print("Ingrese cantidad en Dólares: ");
                    cantidad = scn.nextDouble();
                    resultado = cantidad * moneda.getConversion_rates().get("ARS");
                    System.out.println(cantidad + " USD son " + resultado + " ARS");
                    break;
                case 2:
                    System.out.print("Ingrese cantidad en Pesos Argentinos: ");
                    cantidad = scn.nextDouble();
                    resultado = cantidad / moneda.getConversion_rates().get("ARS");
                    System.out.println(cantidad + " ARS son " + resultado + " USD");
                    break;
                case 3:
                    System.out.print("Ingrese cantidad en Dólares: ");
                    cantidad = scn.nextDouble();
                    resultado = cantidad * moneda.getConversion_rates().get("BRL");
                    System.out.println(cantidad + " USD son " + resultado + " BRL");
                    break;
                case 4:
                    System.out.print("Ingrese cantidad en Reales Brasileños: ");
                    cantidad = scn.nextDouble();
                    resultado = cantidad / moneda.getConversion_rates().get("BRL");
                    System.out.println(cantidad + " BRL son " + resultado + " USD");
                    break;
                case 5:
                    System.out.print("Ingrese cantidad en Dólares: ");
                    cantidad = scn.nextDouble();
                    resultado = cantidad * moneda.getConversion_rates().get("COP");
                    System.out.println(cantidad + " USD son " + resultado + " COP");
                    break;
                case 6:
                    System.out.print("Ingrese cantidad en Pesos Colombianos: ");
                    cantidad = scn.nextDouble();
                    resultado = cantidad / moneda.getConversion_rates().get("COP");
                    System.out.println(cantidad + " COP son " + resultado + " USD");
                case 7:
                    System.out.println("Gracias por usar el conversor. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }while (opcion != 7);

    }
}
