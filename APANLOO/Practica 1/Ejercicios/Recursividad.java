import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class Recursividad{

	private static Scanner scanner = new Scanner(System.in);
	private static ArrayList<Integer> listaXiomi = new ArrayList<>();
	private static HashSet<Character> simbolosEncontrados = new HashSet<Character>();

	public static void iniciarMenu(){
		int opc = 0;
		do{
			System.out.println("1) Calcular producto de dos números");
			System.out.println("2) Cacular el n-ésimo número de Xiomi");
			System.out.println("3) Buscar símbolos de una cadena en otra");
			System.out.println("4) Invertir cadena");
			System.out.println("5) Dibujar Hs");
			System.out.println("6) Encontrar caminos");
			System.out.println("7) Salir del programa");
			opc = scanner.nextInt();
			scanner.nextLine();

			realizarOpcion(opc);
		}while(opc!=7);
	}

	public static void realizarOpcion(int opc){
		switch(opc){
			case 1: System.out.println("\nEn esta sección se calcula el producto de dos números positivos");
				int primerTermino=0, segundoTermino=0;

				System.out.print("\nIngrese el primer término...");
				primerTermino = scanner.nextInt();
				System.out.print("\nIngrese el segundo término...");
				segundoTermino = scanner.nextInt();

				int resultado = multiplicarRecursivo(primerTermino, segundoTermino);
				System.out.println("\n\tEl producto es: " + resultado+"\n");
				break;
			case 2: System.out.println("\nEn esta sección se calcula en n-ésimo número de Xiomi");
				int n=0;
				System.out.print("\nIngrese el valor de n...");
				n = scanner.nextInt();

				listaXiomi.add(1);
				listaXiomi.add(1);
				listaXiomi.add(1);

				int enesimo = calcularXiomi(n);
				System.out.println("\n\tEl número n-ésimo es "+enesimo+"\n");
				break;
			case 3: System.out.println("\nEn esta sección se buscarán los símbolos de una cadena dentro de otra");
				String cadenaBase="", cadenaBuscada="";
				
				System.out.print("\nIngrese la cadena en la que se buscarán los símbolos...");
				cadenaBase = scanner.nextLine();
				System.out.print("\nIngrese la cadena a buscar...");
				cadenaBuscada = scanner.nextLine();

				if(encontrarCadena(cadenaBase, cadenaBuscada)){
					System.out.println("\n\tLa cadena "+cadenaBase+" si contiene símbolos de la cadena "+cadenaBuscada+"\n");
				}else{
					System.out.println("\n\tLa cadena "+cadenaBase+" no contiene los símbolos de la cadena "+cadenaBuscada+"\n");
				}
				break;
			case 4: System.out.println("\nEn esta sección se invertirá la cadena dada");
				String cadena="";

				System.out.print("\nIngrese la cadena a invertir...");
				cadena = scanner.nextLine();

				System.out.println("\n\tLa cadena inverida es "+invertirCadena(cadena)+"\n");
				break;
			case 5: System.out.println("\n\tEn esta sección se dibujará el fractal H\n");
				int numeroFractal=0;

				System.out.print("\nIngresa el valor de N...");
				numeroFractal = scanner.nextInt();
				scanner.nextLine();

				crearFractal(numeroFractal);
				break;
			case 6: System.out.println("\nEn esta seccción se encontrarán los caminos posibles entre un punto en el cuadrante positivo y el origen");
				int coordenadaX, coordenadaY;

				System.out.print("\nIngresa la coordenada x...");
				coordenadaX = scanner.nextInt();
				System.out.print("\nIngresa la coordenada y...");
				coordenadaY = scanner.nextInt();

				int numCaminos = numeroDeCaminos(coordenadaX, coordenadaY);

				System.out.println("\n\tNumero de caminos recursivo: "+numCaminos+"\n");
				break;
			case 7: return;
			default:  System.out.println("\n\tOpción inválida, intente nuevamente\n");
		}
	}

    public static int numeroDeCaminos(int x, int y) {
        // Caso base: Si alguna de las coordenadas es 0 solo hay un camino al origen
        if (x == 0 || y == 0) {
            return 1;
        }

        //Sumamos los camninos de  ir hacia abajo o hacia la izquierda
        return numeroDeCaminos(x-1, y) + numeroDeCaminos(x, y-1);
    }

	public static void crearFractal(int N){
		dibujarH(N, 0.5, 0.5, 0.3);	
	}

	public static void dibujarH(int n, double x, double y, double lineSize){
		if(n==1){
			StdDraw.line(x-lineSize, y, x+lineSize, y);
			StdDraw.line(x-lineSize, y+lineSize, x-lineSize, y-lineSize);
			StdDraw.line(x+lineSize, y+lineSize, x+lineSize, y-lineSize);
			return;
		}
		
		//El nuevo tamaño de línea de calcula independientemente del valor de n
		double newLineSize=lineSize/2.0;
		dibujarH(n-1, x, y, lineSize);
		//Se mueve a los nuevos centros de las H, son las "esquinas" de la H actual
		dibujarH(n-1, x-lineSize, y+lineSize, newLineSize);
		dibujarH(n-1, x-lineSize, y-lineSize, newLineSize);
		dibujarH(n-1, x+lineSize, y-lineSize, newLineSize);
		dibujarH(n-1, x+lineSize, y+lineSize, newLineSize);
	}	

	public static String invertirCadena(String cadena){
		if(cadena.length()<=1){
			return cadena;
		}
		
		//En la llamada recursiva se llama a sí mismo con la cadena original reducida y luego se le concatena el primer simbolo de la cadena original 
		return invertirCadena(cadena.substring(1)) + cadena.charAt(0);
	}

	public static boolean encontrarCadena(String cadenaBase, String cadenaBuscada){
		buscarSimbolos(cadenaBase, cadenaBuscada, 0);
		if(simbolosEncontrados.size()==cadenaBuscada.length()){
			return true;
		}
		return false;
	}

	public static void buscarSimbolos(String cadenaBase, String cadenaBuscada, int n){
		if(n == cadenaBase.length()){
			return ;
		}

		char simbolo = cadenaBase.charAt(n);

		for(int i=0; i<cadenaBuscada.length(); i++){
			if(simbolo == cadenaBuscada.charAt(i)){
				simbolosEncontrados.add(simbolo);
			}	
		}
		
		buscarSimbolos(cadenaBase, cadenaBuscada, n+1);
	}

	public static int calcularXiomi(int n){
		if(n<=3){
			return 1;
		}else{
			return calcularXiomi(n-2) + calcularXiomi(n-3);
		}
	}

	public static int multiplicarRecursivo(int primerTermino, int segundoTermino){
		//El caso base indica que si la multiplicación por 0 devuelve 0
		if(segundoTermino == 0){
			return 0; 
		}else{
		//Se suma primerTermino "segundoTermino"-veces
			return primerTermino + multiplicarRecursivo(primerTermino, segundoTermino-1);
		}
	}

	public static void main (String[] args){
		System.out.println("\n**********Practica 1**********\n");
		iniciarMenu();
	}
}
