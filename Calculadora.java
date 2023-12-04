/**
 * Calculadora
 */

public class Calculadora {

    public static void main(String[] args) {

        // Definir variables para introducir los valores
        float operador1 = 5;
        float operador2 = 2;
        // float operador2 = 0;

        // Definir variable para seleccionar la operación
        int operacion = 5; // Cambia el valor de operacion a un número entre 1 y 4

        //Calculadora
        switch (operacion) {
            case 1: // Suma
                System.out.println("Resultado de la suma: " + (operador1 + operador2));
                break;

            case 2: // Resta
                System.out.println("Resultado de la resta: " + (operador1 - operador2));
                break;

            case 3: // Multiplicación
                System.out.println("Resultado de la multiplicación: " + (operador1 * operador2));
                break;

            case 4: // División
                /*
                if (operador2 == 0) {
                    System.out.println("No se puede dividir por cero.");
                } else {
                    System.out.println("Resultado de la división: " + (operador1 / operador2));
                }
                break;
                */

                System.out.println((operador2 == 0) ? "No se puede dividir por cero." : "Resultado de la división: " + (operador1 / operador2));
                /**
                 * Operador ternario
                 * (condición) ? expresión_si_verdadero : expresión_si_falso;
                 */
                break;
        
            default: // Otro valor no contemplado
                System.out.println("Esta operación no se puede realizar.");
                break;
        }

        System.out.println("Fin del programa, ¡gracias!");
    }
}
