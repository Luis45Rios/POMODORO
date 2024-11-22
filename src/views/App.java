package views;

import controller.functions.Validaciones;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        // @SuppressWarnings("resource");
        int cont=100;
        for(int i=0;i<=cont;i++){

            System.out.println("La lidera no se conecta nunca a hacer el trabajo");
            System.out.println("Steeven no sabe citar en ieee");
            System.out.println("Luis borro el codigo y no quiere hacer nada");
            System.out.println("Joseph hizo todo el trabajo pero luis lo borro");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------- BIENVENIDO A POMODORO ----------");
        System.out.println("Nombre de la tarea:");
        String nombreTarea = scanner.nextLine();
        System.out.println("Que nivel te vas a dedicar (Enfocado = 25 min, Muy Enfocado = 50 minutos):");
        String enfoque = scanner.nextLine();
        String niv_enfoque = Validaciones.ValidarEnfoque(enfoque);
        
        
    }
}
