import java.util.*;
    public class puerto {
    
        static void obtenerNumeroContenedores(ArrayList<LinkedList> contenedores){
            System.out.println();
            int contador = 0;
            for (int i = 0; i < contenedores.size(); i ++){
                Iterator<Integer> iterador = contenedores.get(i).listIterator();
                while(iterador.hasNext()){
                    contador += 1;
                    iterador.next();
                }
            }
            System.out.println("El numero de contenedores es: " + contador);
        }
        static void obtenerNumeroVehiculos(ArrayList<LinkedList> vehiculos){
            System.out.println();
            int contador = 0;
            for (int i = 0; i < vehiculos.size(); i ++){
                Iterator<Integer> iterador = vehiculos.get(i).listIterator();
                while(iterador.hasNext()){
                    contador += 1;
                    iterador.next();
                }
            }
            System.out.println("El numero de vehiculos es: " + contador);
        }