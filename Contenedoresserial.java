static void obtenerContenedorConSerial(ArrayList<LinkedList> contenedores, int serial){
            System.out.println();
            boolean serialEncontrado = false;
            int pilaEncontrada = 0;
    
            for (int i = 0; i < contenedores.size(); i ++){
                Iterator<Integer> iterador = contenedores.get(i).listIterator();
                while(iterador.hasNext()){
                    if (serial == iterador.next()){
                        serialEncontrado = true;
                    }
                }
                if (serialEncontrado == true){
                    pilaEncontrada = (i + 1);
                    break;
                }
            }
    
            if (serialEncontrado == true){
                System.out.println("El contenedor con serial: " + serial + ", fue encontrado en la pila con indice: " + (pilaEncontrada-1));
            }else{
                System.out.println("El contenedor con serial: " + serial + ", no fue encontrado");
            }
        }