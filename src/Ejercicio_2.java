import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // para ingresar cantidad de sueldos
        System.out.print("ingresa cuantos sueldo ingresarás: ");
        byte topeSueldos = scanner.nextByte();
        // incremento para detener el ciclo
        byte cantidadSueldos = 0;
        // contadores de los sueldos
        byte sueldosBajos_300 = 0;
        byte sueldosMayores_300 = 0;
        byte sueldoMenor_100 = 0;
        // almacenar todos los sueldos en una variable
        double acumualdoSueldos = 1;
        while(topeSueldos > cantidadSueldos){
            System.out.print("ingresa el sueldo: ");
            double sueldo = scanner.nextDouble();
            // sueldo negativo = cerrar ciclo
            if(sueldo<1){
                System.out.println("el sueldo no puede ser negativo bro");
                break;
                // evaluar cuantos sueldos oscilan entre 100 y 300
            }else if((sueldo>=100)&&(sueldo<=300)){
                sueldosBajos_300 ++;
                // evaluar sueldos mayores 300
            }else if (sueldo>300) {
                sueldosMayores_300 ++;
                // evaluar sueldos < 1000
            }else if(sueldo<100){
                sueldoMenor_100 ++;
            }

            acumualdoSueldos += sueldo;
            cantidadSueldos ++;
        }
            // output de valores
        System.out.println("que quieres ver ?");
        System.out.println("1: valores menores de 100");
        System.out.println("2: valores mayores de 300");
        System.out.println("3: valores que oscilan entre 100 y 300");
        System.out.println("4: solo los sueldos");
        byte opcion = scanner.nextByte();
        switch (opcion) {
            case 1:
                System.out.println("sueldos menores que 100: " + sueldoMenor_100);
                System.out.println("------------------------------------------");
                System.out.println("sueldos acumulados: " + (float)acumualdoSueldos);
                System.out.println("------------------------------------------");
                System.out.println("sueldos ingresados: " + cantidadSueldos);
                break;
            case 2:
                System.out.println("------------------------------------------");
                System.out.println("sueldos acumulados: " + (float)acumualdoSueldos);
                System.out.println("------------------------------------------");
                System.out.println("sueldos ingresados: " + cantidadSueldos);
                System.out.println("------------------------------------------");
                System.out.println("sueldos mayores de 300: " + sueldosMayores_300);
                System.out.println("------------------------------------------");
                break;
            case 3:
                System.out.println("------------------------------------------");
                System.out.println("sueldos entre 100 y 300: " + sueldosBajos_300);
                System.out.println("------------------------------------------");
                System.out.println("sueldos acumulados: " + (float)acumualdoSueldos);
                System.out.println("------------------------------------------");
                System.out.println("sueldos ingresados: " + cantidadSueldos);
                break;
            case 4:
                System.out.println("sueldos acumulados: " + (float)acumualdoSueldos);
                System.out.println("------------------------------------------");
                System.out.println("sueldos ingresados: " + cantidadSueldos);
                break;
            default:
                System.out.println("no bro");
                break;
        }
        scanner.close();
    }
}
