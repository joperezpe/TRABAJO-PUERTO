static void obtenerVehiculoConSerial(ArrayList<LinkedList> vehiculos, int serial){
            System.out.println();
            boolean serialEncontrado = false;
            int colaEncontrada = 0;
    
            for (int i = 0; i < vehiculos.size(); i ++){
                Iterator<Integer> iterador = vehiculos.get(i).listIterator();
                while(iterador.hasNext()){
                    if (serial == iterador.next()){
                        serialEncontrado = true;
                    }
                }
                if (serialEncontrado == true){
                    colaEncontrada = (i + 1);
                    break;
                }
            }
    
            if (serialEncontrado == true){
                System.out.println("El vehiculo con serial: " + serial + ", fue encontrado en la cola con indice: " + (colaEncontrada-1));
            }else{
                System.out.println("El vehiculo con serial: " + serial + ", no fue encontrado");
            }
        }