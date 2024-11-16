package es.jmg;
public class Promedio{
    public static void main(String[] args) {
        double myAvg=0.0d, myAvgEach = 0.0d;
        int mySuma=0, mySumaConEach = 0;
        int [] edades = {40,80,60,100};
        int myNum_items = edades.length;  // Ojo: length no lleva () 
        
        // Sumar las edades contenidas en el array

        // Con un ciclo for normal
        for (int i = 0; i < myNum_items; i++){
            mySuma += edades[i];
        }

        // Usando for-Each. Sería así:
        for (int edad : edades){
            mySumaConEach += edad;
        }

        // Dividir la suma de las edades entre el total de elementos
    myAvg = mySuma / myNum_items;
    myAvgEach = mySumaConEach / myNum_items;
    System.out.println("La media de las edades es: " + myAvg);
    System.out.println("La media de las edades es: " + myAvgEach);
    }
}








