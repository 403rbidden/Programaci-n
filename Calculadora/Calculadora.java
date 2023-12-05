import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        // Crear Scanner para la entrada del teclado
        Scanner entradaTeclado = new Scanner(System.in);

        // Declarar la var respuesta fuera del bucle para que su ambito se extienda a todo el cuerpo del metodo main
        // Esto permite su uso en cualquier parte del metodo
        // Char tipo primitivo para representar una unica letra
        // Se tiene que inicializar la variable con un valor, aunque sea vacio, para que funcione
        char respuesta = ' ';

        // Bucle que permite ejecutar la calculadora repetidamente
        do {
            // ASCII art para la interfaz
            String ASCIIArt = 
                    "  ______________\n" +
                    " | ____________ |\n" +
                    " ||CALCULADORA ||\n" +
                    " | \"\"\"\"\"\"\"\"\"\"\"\" |\n" +
                    " |  [M|#|C][-]  |\n" +
                    " |  [7|8|9][+]  |\n" +
                    " |  [4|5|6][x]  |\n" +
                    " |  [1|2|3][%]  |\n" +
                    " |  [.|O|:][=]  |\n" +
                    " |______________| By 403rbidden \n";

            // Imprimir el ASCII art por consola
            System.out.println(ASCIIArt);

            // Solicitar el primer operador de la operacion
            System.out.print("Introduce el primer operador: ");

            // Verificar si la entrada operador1 es un numero
            while (!entradaTeclado.hasNextFloat()) {
                System.out.println("Error: Solo se permite introducir numeros. Intentalo de nuevo.");
                // Limpiar el buffer del scanner antes de solicitar otro dato
                entradaTeclado.next();
                // Vuelve a solicitar el operador1
                System.out.print("Introduce el primer operador: ");
            }

            float operador1 = entradaTeclado.nextFloat();

            // Se utiliza para controlar el bucle que solicita el simbolo
            // Mientras operacionValida sea falsa el bucle continuara hasta que se ingrese un simbolo correcto
            boolean operacionValida = false;
            
            // Declarar operacionSimbolo fuera del bucle para que sea visible en todo el metodo
            char operacionSimbolo = ' ';

            // Bucle para seleccionar qué tipo de operacion se realizara
            // No parara hasta que se introduzca un simbolo valido
            while (!operacionValida) {
                System.out.println("¿Qué operacion deseas realizar?\n" +
                        "Escoge uno de los siguientes simbolos, segun sea necesario: \n" +
                        "  [+] Sumar.\n" +
                        "  [-] Restar.\n" +
                        "  [*] Multiplicar.\n" +
                        "  [/] Dividir.");

                // Solicitar al usuario que ingrese el simbolo de operacion
                System.out.print("Indica el simbolo: ");
                operacionSimbolo = entradaTeclado.next().charAt(0);

                // Validar si el simbolo de operacion ingresado es valido
                if (operacionSimbolo == '+' || operacionSimbolo == '-' || operacionSimbolo == '*'
                        || operacionSimbolo == '/') {
                    operacionValida = true;
                } else {
                    System.out.println("Simbolo no reconocido. Por favor, selecciona uno valido.");
                }
            }

            // Solicitar el segundo operador de la operacion
            System.out.print("Introduce el segundo operador: ");

            // Verificar si operador2 es un numero
            while (!entradaTeclado.hasNextFloat()) {
                System.out.println("Error: Solo se permite introducir numeros. Intentalo de nuevo.");
                // Limpiar el buffer del scanner antes de solicitar otro dato
                entradaTeclado.next();
                // Vuelve a solicitar el operador2
                System.out.print("Introduce el segundo operador: ");
            }

            float operador2 = entradaTeclado.nextFloat();

            // Inicializar resultado = 0 asegura que tenga un valor definido antes realizar otra operacion
            float resultado = 0;

            // Realizar la operacion de la calculadora utilizando un switch
            switch (operacionSimbolo) {
                case '+':
                    resultado = operador1 + operador2;
                    break;

                case '-':
                    resultado = operador1 - operador2;
                    break;

                case '*':
                    resultado = operador1 * operador2;
                    break;

                case '/':
                    resultado = operador1 / operador2;
                    break;
            }

            // Mostrar el resultado de la operacion, manejando la division por cero
            System.out.println((operacionSimbolo == '/' && operador2 == 0) ? "Error: Division por cero no permitida."
                    : "El resultado de la operacion es = " + resultado);

            // Preguntar al usuario si desea realizar otra operacion
            System.out.println("¿Desea realizar otra operacion?");
            System.out.print("Pulse [S] para si y [N] para salir del programa: ");
            respuesta = entradaTeclado.next().charAt(0);

        } while (Character.toUpperCase(respuesta) == 'S');

        // Mensaje de despedida
        System.out.println("Gracias por usar esta calculadora. \n" +
                "¡Hasta pronto! :)");

        // Cerrar el objeto Scanner al terminar para evitar fugas de recursos
        entradaTeclado.close();
    }
}
