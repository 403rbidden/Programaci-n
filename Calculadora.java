public class Calculadora {

    public static void main(String[] args) {

        // Definir variables
        float operador1 = 5;
        float operador2 = 2;
        //float operador2 = 0;

        // Suma
        System.out.print("Resultado de la suma = " + (operador1 + operador2));
        
        // Resta
        System.out.print("Resultado de la suma = " + (operador1 - operador2));

        // Multiplicación
        System.out.print("Resultado de la suma = " + (operador1 * operador2));
        
        // División por cero da infinito. Control de errores.
        if (operador2 == 0) {
            System.out.print("No se puede realizar la división por cero");
        } else {
            // División
            System.out.print("Resultado de la suma = " + (operador1 / operador2));
        }
    }
}
