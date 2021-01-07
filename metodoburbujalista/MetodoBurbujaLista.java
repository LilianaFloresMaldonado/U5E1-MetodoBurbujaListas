package metodoburbujalista;
import java.util.LinkedList;
import java.util.List;
public class MetodoBurbujaLista {
    public static void main(String[] args) {
         
        System.out.println("Metodo burbuja en forma de lista");
         List<Integer> lista = new LinkedList<Integer>();
         int aux;
         lista.add(9);lista.add(1);lista.add(4);lista.add(3);
         lista.add(10);lista.add(7);lista.add(5);
        //metodo burbuja
         for (int i = 0; i < lista.size() - 1; i++) {
         for (int j = 0; j < lista.size() - 1; j++) {
         if (lista.get(j) > lista.get(j + 1)) {
         aux = lista.get(j);
         lista.set(j, lista.get(j + 1));
         lista.set(j + 1, aux);
                 } 
               }
             }
         System.out.println("Lista ordenada en forma creciente");
         for (int i = 0; i < lista.size(); i++) {
           System.out.print(lista.get(i) + "  ");
         }
       }
     }
    

