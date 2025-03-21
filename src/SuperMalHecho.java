import java.util.Scanner;

public class SuperMalHecho {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double impuesto = 0.19;

        float precioAproximado = 10000;
        System.out.println("Escriba el nombre del producto 1:");
        String producto_1 = input.nextLine();
        System.out.println("Ingrese el precio:");
        double precio_1 = input.nextDouble();
        input.nextLine();

        System.out.println("Escriba el nombre del producto 2:");
        String producto_2 = input.nextLine();
        System.out.println("Ingrese el precio:");
        float precio_2 = input.nextFloat();
        input.nextLine();

        System.out.println("Escriba el nombre del producto 3:");
        String producto_3 = input.nextLine();
        System.out.println("Ingrese el precio:");
        int precio_3 = input.nextInt();
        input.nextLine();

        System.out.println("Escriba el nombre del producto 4:");
        String producto_4 = input.nextLine();
        System.out.println("Ingrese el precio:");
        long precio_4 = input.nextLong();
        input.nextLine();

        System.out.println("Escriba el nombre del producto 5:");
        String producto_5 = input.nextLine();
        System.out.println("Ingrese el precio:");
        short precio_5 = input.nextShort();
        input.nextLine();

        double impuesto_precio_1 = (precio_1 * impuesto);
        double descuento_1 = (precio_1 > precioAproximado) ? (precio_1 * 0.10) : 0;
        double total1 = precio_1 + impuesto_precio_1 - descuento_1;

        double impuesto_precio_2 = (precio_2 * impuesto);
        double descuento_2 = (precio_2 > precioAproximado) ? (precio_2 * 0.10) : 0;
        double total2 = precio_2 + impuesto_precio_2 - descuento_2;

        System.out.println("impuesto precio 2 " + impuesto_precio_2);
        System.out.println("descuento 2 " + descuento_2);

        double impuesto_precio_3 = (precio_3 * impuesto);
        double descuento_3 = (precio_3 > precioAproximado) ? (precio_3 * 0.10) : 0;
        double total3 = precio_3 + impuesto_precio_3 - descuento_3;

        double impuesto_precio_4 = (precio_4 * impuesto);
        double descuento_4 = (precio_4 > precioAproximado) ? (precio_4 * 0.10) : 0;
        double total4 = precio_4 + impuesto_precio_4 - descuento_4;

        double impuesto_precio_5 = (precio_5 * impuesto);
        double descuento_5 = (precio_5 > precioAproximado) ? (precio_5 * 0.10) : 0;
        double total5 = precio_5 + impuesto_precio_5 - descuento_5;

        System.out.println("Producto: " + producto_1 + ", Precio final: " + total1);
        System.out.println("Producto: " + producto_2 + ", Precio final: " + total2);
        System.out.println("Producto: " + producto_3 + ", Precio final: " + total3);
        System.out.println("Producto: " + producto_4 + ", Precio final: " + total4);
        System.out.println("Producto: " + producto_5 + ", Precio final: " + total5);

        double suma = total1 + total2 + total3 + total4 + total5;
        System.out.println("El total de la compra es: " + suma);
    }
}

