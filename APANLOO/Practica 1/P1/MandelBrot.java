

import java.awt.Color;

public class MandelBrot {

	MandelBrot(){
		dibujar();
	}
    /**
     * Dibuja el conjunto de Mandelbrot
     */
    void dibujarFractalMandelbrot(){
		
        double epsilon = 0.01; 
        double x;
        double y;
        int maxIteraciones = 10;
        int iteraciones;
        Complejo Z=null;
        Complejo C=null;
        Complejo aux=null;
        /*Se cambia la escala, por default es 0-1*/      
        StdDraw.setXscale(-2,2);
        StdDraw.setYscale(-2,2);
        StdDraw.text(0.0, 1.5, "Conjunto de Mandelbrot");
       
        for(x=-2; x<=2; x+= epsilon)
        {
            for(y=-2; y<=2; y+= epsilon)
            {
            	StdDraw.setPenColor(Color.RED);
                iteraciones = 0;
                C = new Complejo(x, y);
                Z = new Complejo(0,0);
                
                while(Complejo.abs(Z) < 2 && iteraciones < maxIteraciones)
                {
                    aux = Complejo.suma(Complejo.mult(Z, Z),C);
                    Z = aux;
                    iteraciones++;
                }
                if(iteraciones==maxIteraciones){        
                	StdDraw.point(x, y);
                }else{
                	StdDraw.setPenColor(Color.BLUE);
                	StdDraw.point(x, y);
                }	
            }
        }  
		
		
	}
	
	public void dibujar() {
		dibujarFractalMandelbrot();
		
	}
	
	public static void main(String[] args){
		
		new MandelBrot();
	}
}

