package controller;

import java.util.Scanner;

public class Pomodoro {

    private final String tarea; // final se utiliza para asignar la variable una solo vez.
    private final int tiempoPomodoro;
    private final int tiempoDescansoCorto;
    private final int tiempoDescansoLargo;
    private int ciclosCompletados;

    public Pomodoro(String tarea, int enfoque) { // Constructor, es el primero método que ayuda a inicializar una clase
        this.tarea = tarea;
        switch (enfoque) {
            case 1:
                this.tiempoPomodoro = 25;
                this.tiempoDescansoCorto = 5;
                this.tiempoDescansoLargo = 15;
                break;

            case 2:
                this.tiempoPomodoro = 50;
                this.tiempoDescansoCorto = 10;
                this.tiempoDescansoLargo = 30;
                break;

            default:
                System.out.println("Opción no válida. Se le asignará un enfoque por defecto");
                this.tiempoPomodoro = 25;
                this.tiempoDescansoCorto = 5;
                this.tiempoDescansoLargo = 15;
                break;
        }
    }

    public void comenzarPomodoro(Scanner scanner) {
        while (true) {
            System.out.println("Tarea: " + this.tarea);
            System.out.println("Comenzando Pomodoro (" + this.tiempoPomodoro + " min)");

            this.ciclosCompletados++;

            if (this.ciclosCompletados % 4 == 0) { // % es una división la cual me devuelve el resideuo
                System.out.println("Descanso largo (" + this.tiempoDescansoLargo + " min)");
            } else {
                System.out.println("Descanso corto (" + this.tiempoDescansoCorto + " min)");
            }

            System.out.println("¿Desea continuar? si/no");
            String continuar = scanner.nextLine();

            if (continuar.equals("no")) {
                System.out.println("Pomodoro terminado");

                break;
            }
        }
    }

}
