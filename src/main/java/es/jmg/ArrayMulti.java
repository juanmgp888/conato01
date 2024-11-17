package es.jmg;
public class ArrayMulti {
    public static void main(String[] args){
        
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

      for (int i = 0; i < myNumbers.length; i++) { 
        // length no lleva () pq es un atributo, no un método
        // Con un String hubiese sido diferente, con ().
          for (int j = 0; j < myNumbers[i].length; j++) {
            System.out.println(myNumbers[i][j]);
          }
        }
    }
}
