package views;

import controller.functions.Validaciones;

import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class App {

    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------- BIENVENIDO A POMODORO ----------");
        System.out.println("Nombre de la tarea:");
        String nombreTarea = scanner.nextLine();
        System.out.println("Que nivel te vas a dedicar (Enfocado = 25 min, Muy Enfocado = 50 minutos):");
        String enfoque = scanner.nextLine();
        String niv_enfoque = Validaciones.ValidarEnfoque(enfoque);

        // Timer timer = new Timer();
        // TimerTask tarea = new TimerTask() {
        //     @Override
        //     public void run() {
        //         System.out.println("La tarea de timer se ejecuto en: " + new Date());
        //     }
        // };
        // timer.schedule(tarea, 5000, 1000);
    }
}
