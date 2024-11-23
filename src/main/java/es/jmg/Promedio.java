package es.jmg;
public class Promedio{

    @SuppressWarnings("unused")
    public double calcularPromedio(int[] arregloDado){
        double myAvg=0.0d, myAvgEach = 0.0d;
        int mySuma=0, mySumaConEach = 0;
        int myNum_items = arregloDado.length;  // Ojo: length no lleva () 
        
        // Sumar las edades contenidas en el array

        // Con un ciclo for normal
        for (int i = 0; i < myNum_items; i++){
            mySuma += arregloDado[i];
        }

        // Usando for-Each. Sería así:
        for (int edad : arregloDado){
            mySumaConEach += edad;
        }

        // Dividir la suma de las edades entre el total de elementos
         myAvg = mySuma / myNum_items;
         myAvgEach = mySumaConEach / myNum_items;
         return myAvg;
    }

    public void imprimirResultado(double myAvg, double myAvgEach){
        System.out.println("La media de las edades es: " + myAvg);
        System.out.println("La media de las edades es: " + myAvgEach);
    }
    public static void main(String[] args) {
        Promedio promedioEdad = new Promedio();
        int[] arregloEdades = {40,80,60,100};
        double resultadoPromedio = promedioEdad.calcularPromedio(arregloEdades);
        promedioEdad.imprimirResultado(resultadoPromedio,resultadoPromedio);

    }
}








