package views;

import controller.functions.Validaciones;
import java.util.Scanner;

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
    }
}
