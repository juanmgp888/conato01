package es.jmg;
public class String01{
    public static void main(String[] args){

    // Reverse a string
    String origen = "aeiou";
    String destino = "";

    for (int i=0;i<origen.length();i++){
        destino += origen.charAt(origen.length()-1-i);
        System.out.println(origen.charAt(origen.length()-1-i));        
        }
    System.out.println(destino);
    }
}
