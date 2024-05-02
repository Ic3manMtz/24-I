import java.util.Scanner;

public class App {

    private static Scanner scanner;

    public static void calculadora(int  num1, int num2) {
        System.out.println("\nOperaciones realizadas son:");
        System.out.println("\tSuma: ("+num1+"+"+num2+") = "+(num1+num2));
        System.out.println("\tResta: ("+num1+"-"+num2+") = "+(num1-num2));
        System.out.println("\tMultiplicación: ("+num1+"x"+num2+") = "+(num1*num2));
        System.out.println("\tDivisión: ("+num1+"/"+num2+") = "+(num1/num2)+"\n");
    }

    public static void calculadora(int a, int b, int c, int d){
        System.out.println("\nOperaciones realizadas son");
        int numerador = (a*d) + (b*c);
        int denominador = b*d;
        System.out.println("\tSuma: ("+a+"/"+b+") + ("+c+"/"+d+") = "+numerador+"/"+denominador);

        numerador = (a*d) - (b*c);
        System.out.println("\tResta: ("+a+"/"+b+") - ("+c+"/"+d+") = "+numerador+"/"+denominador);

        numerador = a*c;
        denominador = b*d;
        System.out.println("\tMultiplicacion: ("+a+"/"+b+") * ("+c+"/"+d+") = "+numerador+"/"+denominador);

        numerador = a*d;
        denominador = b*c;
        System.out.println("\tDivision: ("+a+"/"+b+") / ("+c+"/"+d+") = "+numerador+"/"+denominador);
    }
    public static void main(String[] args) throws Exception {
        scanner = new Scanner(System.in);

        System.out.println("\n\tCALCULADORA DE NUMEROS ENTEROS");
        System.out.print("Ingresa el primer número...");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número...");
        int num2 = scanner.nextInt();
        calculadora(num1, num2);

        System.out.println("\n\tCALCULADORA DE NUMEROS RACIONALES");
        System.out.print("Ingresa el numerador del primero número racional...");
        int numerador1 = scanner.nextInt();
        System.out.print("Ingresa el denominador del primer número racional...");
        int denominador1 = scanner.nextInt();
        System.out.print("Ingresa el numerador del segundo número racional...");
        int numerador2 = scanner.nextInt();
        System.out.print("Ingresa el denominador del segundo número racional...");
        int denominador2 = scanner.nextInt();
        calculadora(numerador1, denominador1, numerador2, denominador2);
    }
}
