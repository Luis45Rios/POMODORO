package views;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource") // Suprime las advertencias

        Scanner scanner = new Scanner(System.in);

        System.out.println("BIENVENIDO AL POMODORO");

        System.out.println("Elige el nombre para tu tarea:");
        String nombreTarea = scanner.nextLine();

        System.out.println("¿Qué nivel te vas a dedicar?");
        System.out.println("(1) Enfocado = 25 min");
        System.out.println("(2) Muy Enfocado = 50 min");
        int enfoque = scanner.nextInt();

        int tiempoPomodoro, tiempoDescansoCorto, tiempoDescansoLargo;

        switch (enfoque) {
            case 1:
                tiempoPomodoro = 25;
                tiempoDescansoCorto = 5;
                tiempoDescansoLargo = 15;
                break;

            case 2:
                tiempoPomodoro = 50;
                tiempoDescansoCorto = 10;
                tiempoDescansoLargo = 30;
                break;

            default:
                System.out.println("Opción no válida. Se le asignará un enfoque por defecto");
                tiempoPomodoro = 25;
                tiempoDescansoCorto = 5;
                tiempoDescansoLargo = 15;
                break;
        }

        // Timer timer = new Timer();
        // TimerTask tarea = new TimerTask() {
        // @Override
        // public void run() {
        // System.out.println("La tarea de timer se ejecuto en: " + new Date());
        // }
        // };
        // timer.schedule(tarea, 5000, 1000);
    }
}
