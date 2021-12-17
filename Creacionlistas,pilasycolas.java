 static void obtenerElementosPilaContenedores(ArrayList<LinkedList> contenedores, int consecutivo){
            System.out.println();
            System.out.println("La pila con indice " + (consecutivo-1) + ", Tiene los siguientes contenedores:");
            LinkedList<Integer> pila = contenedores.get(consecutivo-1);
            Iterator<Integer> iterador = pila.listIterator();
            while(iterador.hasNext()){
                System.out.println("Serial: " + iterador.next());
            }
        }
        static void obtenerElementosColaVehiculos(ArrayList<LinkedList> vehiculos, int consecutivo){
            System.out.println();
            System.out.println("La cola con indice " + (consecutivo-1) + ", Tiene los siguientes vehiculos:");
            LinkedList<Integer> pila = vehiculos.get(consecutivo-1);
            Iterator<Integer> iterador = pila.listIterator();
            while(iterador.hasNext()){
                System.out.println("Serial: " + iterador.next());
            }
        