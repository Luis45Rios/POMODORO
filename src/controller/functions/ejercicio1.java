package controller.functions;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String edad, discapacitado, continuar;

        // Ciclo para realizar múltiples cálculos
        do {
            System.out.println("Es adulto mayor? (s/n):");
            edad = tcl.next();
            float preciototal = 0;

            // Calcular el precio dependiendo de si es adulto mayor o tiene discapacidad
            if (edad.equals("s")) {
                preciototal = calcularPrecioAdultoMayor(tcl);
            } else {
                System.out.println("Tiene discapacidad? (s/n):");
                discapacitado = tcl.next();
                if (discapacitado.equals("s")) {
                    preciototal = calcularPrecioConDiscapacidad(tcl);
                } else {
                    preciototal = calcularPrecioNormal(tcl);
                }
            }

            System.out.println("Valor a pagar: $" + preciototal);

            // Preguntar si el usuario quiere calcular otro valor
            System.out.println("Desea calcular otro pago? (s/n):");
            continuar = tcl.next();
        } while (continuar.equals("s"));

        tcl.close();
    }

    // Función para calcular el precio para adultos mayores
    public static float calcularPrecioAdultoMayor(Scanner tcl) {
        System.out.print("Ingrese el consumo del medidor: ");
        float consumo = tcl.nextFloat();
        if (consumo <= 15) {
            return consumo * 0.5f; // Descuento para adultos mayores
        } else {
            return consumo * 0.70f; // Otro porcentaje para consumo mayor a 15 m³
        }
    }

    // Función para calcular el precio para personas con discapacidad
    public static float calcularPrecioConDiscapacidad(Scanner tcl) {
        System.out.print("Ingrese el consumo del medidor : ");
        float consumo = tcl.nextFloat();
        if (consumo <= 15) {
            System.out.println("Que porcentaje de discapacidad posee el cliente? (40 - 100):");
            float descuento = tcl.nextFloat();
            return consumo - (consumo * descuento / 100); // Aplicar descuento
        } else {
            return calcularPrecioConExceso(consumo);
        }
    }

    // Función para calcular el precio normal sin descuento
    public static float calcularPrecioNormal(Scanner tcl) {
        System.out.println("Ingrese el consumo del medidor: ");
        float consumo = tcl.nextFloat();
        return calcularPrecioConExceso(consumo);
    }

    // Función para calcular el precio dependiendo del consumo
    public static float calcularPrecioConExceso(float consumo) {
        float base = 15;
        float preciobase = 3.00f;
        float exeso;

        if (consumo <= base) {
            return preciobase; // Consumo dentro del límite, solo paga la tarifa base
        } else if (consumo > 60) {
            exeso = consumo - base;
            return preciobase + exeso * 0.35f;
        } else if (consumo >= 40) {
            exeso = consumo - base;
            return preciobase + exeso * 0.30f;
        } else if (consumo >= 25) {
            exeso = consumo - base;
            return preciobase + exeso * 0.20f;
        } else if (consumo >= 15) {
            exeso = consumo - base;
            return preciobase + exeso * 0.10f;
        }
        return 0;
    }
}
