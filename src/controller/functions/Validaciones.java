package controller.functions;

public class Validaciones {
    public static String validarEnfoque(String enfoque) {

        int cont = 4;
        if (enfoque.equalsIgnoreCase("1")) {
            for (int i = 1; i <= cont; i++) {
                if (i % 4 == 0) {
                    System.out.println("Te mereces un descando de 15 minutos");
                } else {
                    System.out.println("Te mereces un descanso de 5 minutos");
                }
            }

        } else if (enfoque.equalsIgnoreCase("2")) {
            for (int i = 1; i <= cont; i++) {
                if (i % 4 == 0) {
                    System.out.println("Te mereces un descando de 30 minutos");
                } else {
                    System.out.println("Te mereces un descanso de 10 minutos");
                }
            }

        } else {
            System.out.println("Por favor solo opciones de 1  y 2");
        }

        return enfoque;
    }
}
