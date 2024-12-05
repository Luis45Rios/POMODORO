package views;

import java.util.Scanner;

import controller.functions.Validaciones;

public class App {

    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")

        Scanner scanner = new Scanner(System.in);
        System.out.println("BIENVENIDO AL POMODORO");
        System.out.println("Nombre de la tarea:");
        String nombreTarea = scanner.nextLine();
        System.out.println("¿Qué nivel te vas a dedicar? (1) Enfocado = 25 min, (2) Muy Enfocado = 50 min:");
        String enfoque = scanner.nextLine();
        String niv_enfoque = Validaciones.validarEnfoque(enfoque);

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
