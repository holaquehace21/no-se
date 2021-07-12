// public: Es el modificador de acceso del método. 
// Pueden ser public (cualquier clase en cualquier paquete puede acceder al método), 
// private (el método sólo puede usarse dentro de la misma clase) o 
// protected (solo quienes hereden de dicha clase pueden acceder al método)

// import java.util.Scanner;

//import javax.swing.JOptionPane;

//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class App {

    // Es nuestra funcion principal
    public static void main(String[] args) throws Exception {

        // System.out.println("Hello, World!");// Imprimir en pantalla
        // System.out.println("HOLA MUNDO");
        // System.out.println("Hola mundo");
        // System.out.println("");
        // System.out.println("pito pal que lea");

        // System.out.println();
        // sysout

        // System.out.println("Hola Mundo");
        // sout tab netBeans

        // Comentarios
        /* Comentarios de varias lineas */

        // Variables
        // Espacio en memoria donde se almacena un valor, que va a cambiar a lo largo
        // del programa

        // Tipo de variables
        // variables de tipo entero
        // Datos de tipo no primitivo
        // Numeros

        byte entero = 12;
        System.out.println("Entero " + entero);

        // short entero1 = 32521;
        // System.out.println("Entero1 " + entero1);

        // int entero2 = 45;
        // System.out.println("Entero2 " + entero2);

        // long entero3 = 12334;
        // System.out.println("Entero3 " + entero3);

        // Variables que almacenan decimales
        // Numeros decimales
        // se le indica a la maquina que es un float con un f

        // float decimal = 2.33f;
        // System.out.println("decimal " + decimal);

        // double decimal2 = 2.13;
        // System.out.println("Decimal2 " + decimal2);

        // Caracter

        // char caracter = 'a';

        // System.out.println("Caracter " + caracter);
        // System.out.println();

        // Boolean

        // boolean decision = true;
        // System.out.println("decision " + decision);

        // Datos de tipo no primitivo

        // Tipo de datos no primitivos

        // Esta variable no almacena nada con null

        // int num = null;
        // Integer aparte de almacenar numeros enteros tambien me
        // permite almacenar nulos
        // Los datos no primitivos te alamcenan metodos---------------------------

        // Integer numero2 = null;

        // System.out.println("Numero " + numero2);

        // Cadena se utilizan las comillas dobles-----------------------------------
        // String cadena = "hola";

        // System.out.println("Cadena " + cadena);

        // Variable-------------------------------------------------------------------

        // int num = 12;

        // num = 10;
        // System.out.println("numero " + num);

        // Constante espacio en memoria donde se almacena un valor que no
        // cambia--------------------------------

        // final int num1 = 10;
        // //num1=12;

        // System.out.println("num " + num1);

        // Entrada de datos------------------------------------------------------

        // Se va a instanciar la clase Scanner
        // Atraves del objeto entrada que vamos de instanciar de la clase scanner
        // Se puede guardar estos datos sean de tipo entero,flotante etc.
        // System.in viene de input o entrada de variables

        // Scanner entrada = new Scanner(System.in);

        // int numero;
        // // // //
        // System.out.println("Digite un numero:");
        // numero = entrada.nextInt();// con nextInt ya estariamos guardando este valor
        // // // entero

        // System.out.println("El numero es: " + numero);

        // float numero1;
        // //
        // System.out.println("Digite un numero:");
        // numero1 = entrada.nextFloat();

        // System.out.println("El numero es: " + numero1);

        // double numero2;
        // //
        // System.out.println("Digite un numero:");
        // numero2 = entrada.nextDouble();

        // System.out.println("El numero es: " + numero2);

        // String cadena;
        // //
        // System.out.println("Digite una cadena:");
        // // cadena = entrada.next();// Guarda una cadena hasta que encuetre un espacio
        // cadena = entrada.nextLine();// Guarda toda la cadena
        // System.out.println("La cadena es : " + cadena);

        // char letra;
        // //
        // System.out.println("Digite una letra:");

        // letra = entrada.nextLine().charAt(1);// Te va a leer un solo caracter en la
        // // posicion 0
        // System.out.println("La cadena es : " + letra);

        // JOptionPane

        // String cadena;
        // int entero;
        // char letra;
        // double decimal;

        // // // Se importa solo con colocar JOptionPane
        // cadena = JOptionPane.showInputDialog("Digite una cadena:");// guarda un
        // string

        // // Se debe convertir a un entero
        // entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));

        // letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);

        // decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un
        // decimal:"));

        // JOptionPane.showMessageDialog(null, "Cadena es: " + cadena);
        // JOptionPane.showMessageDialog(null, "El numero entero es: " + entero);
        // JOptionPane.showMessageDialog(null, "La Letra es: " + letra);
        // JOptionPane.showMessageDialog(null, "El decimal es: " + decimal);

        // Operdores aritmeticos
        // ----------------------------------------------------------------------------------

        // Scanner entrada1 = new Scanner(System.in);

        // float numero1, numero2, suma, resta, multiplicacion, division, modulo;

        // System.out.println("Digite 2 numeros: ");
        // numero1 = entrada1.nextFloat();
        // numero2 = entrada1.nextFloat();

        // suma = numero1 + numero2;
        // resta = numero1 - numero2;
        // multiplicacion = numero1 * numero2;
        // division = numero1 / numero2;
        // modulo = numero1 % numero2;// Residuo de la division

        // System.out.println("La suma es: " + suma);
        // System.out.println("La resta es: " + resta);
        // System.out.println("La multiplicacion es: " + multiplicacion);
        // System.out.println("La division es: " + division);
        // System.out.println("El modulo es: " + modulo);

        // Operadores Aritmeticos combinados con asignacion

        // int numero = 10;

        // // numero = numero + 5;
        // numero += 5;// Se combina dos operadores tanto la suma como la asignacion

        // System.out.println(numero);

        // numero -= 5;// Se combina dos operadores tanto la resta como la asignacion

        // System.out.println(numero);

        // numero /= 5;// Se combina dos operadores tanto la division como la asignacion

        // System.out.println(numero);

        // numero %= 5;// Se combina dos operadores tanto el modulo como la asignacion

        // System.out.println(numero);

        // Operadores de Incremento y decremento
        // incremento
        // int x = 5;
        // x=x+1;
        // x+=1;
        // x++;
        // // Al x le aumenta un valor es decir x=6
        // x++;// x=x+1 o x+=1;

        // System.out.println(x);

        // decremento

        // int x = 5;

        // // Al x le aumenta un valor es decir x=6
        // x--;// x=x-1 o x-=1;

        // System.out.println(x);

        // Ejemplo

        // int x = 5, y;
        // Se esta haciendo la asignacion de y a x
        // x vale 5 por lo tanto Y valdria 5 despues que se hace la asignacion
        // de y se hace x++, lo que significa que a y se le asigan el valor de 5
        // y despues estamos aumentando el valor de x en 1
        // Los ++ estan como sufijo es decir despues de la variable
        // y = x++;

        // si lo ponemos como prefijo

        // y = ++x;// Aumenta el valor de x a 1 y despues se asigna

        // System.out.println("variable y " + y);

    }
}
