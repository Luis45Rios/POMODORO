package controller.functions;

public class Validaciones {
    public static String ValidarEnfoque(String enfoque) {
        int cont = 4;
        if (enfoque.equalsIgnoreCase("enfocado")) {
            for (int i = 1; i <= cont; i++) {
                if (i  % 4 == 0) {
                    System.out.println("Te mereces un descando de 15 minutos");
                } else {
                    System.out.println("Temereces in descanso de 5 minutos");
                }
            }
        } else if (enfoque.equalsIgnoreCase("Muy enfocado"))  {
            for (int i = 1; i <= cont; i++) {
                if (i  % 4 == 0) {
                    System.out.println("Te mereces un descando de 30 minutos");
                } else {
                    System.out.println("Temereces in descanso de 10 minutos");
                }
            }
        } else {
            System.out.println("Por favor elige una opcion...");
        }
    }
}