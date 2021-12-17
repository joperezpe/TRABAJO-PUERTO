static void entregarVehiculo(ArrayList<LinkedList> vehiculos, int serial){
            System.out.println();
            boolean serialEncontrado = false;
            int colaEncontrada = 0;
            int cantidadDesapilar = 0;
    
            for (int i = 0; i < vehiculos.size(); i ++){
                Iterator<Integer> iterador = vehiculos.get(i).listIterator();
                while(iterador.hasNext()){
                    if (serial == iterador.next()){
                        serialEncontrado = true;
                    }
                }
                if (serialEncontrado == true){
                    colaEncontrada = (i);
                    break;
                }
            }
    
            if (serialEncontrado == true){
                // CALCULAR CANTIDAD A DESAPILAR
                Iterator<Integer> iterador = vehiculos.get(colaEncontrada).listIterator();
                while(iterador.hasNext()){
                    if (serial != iterador.next()){
                        cantidadDesapilar += 1;
                    }else{
                        break;
                    }
                }
                System.out.println("cantidad a desapilar: " + cantidadDesapilar);
    
                System.out.println("INICIA DESAPILAMIENTO");
                LinkedList<Integer> colaAuxiliar = new LinkedList<Integer>();
    
                for (int i = 0; i < cantidadDesapilar; i ++){
                    Integer serialDesapilado = (Integer) vehiculos.get(colaEncontrada).pollFirst();
                    boolean serialDesapiladoApilado = false;
    
                    for (int j = 0; j < vehiculos.size(); j ++){
                        if (vehiculos.get(j).size() < 10 && vehiculos.get(j) != vehiculos.get(colaEncontrada)){
                            vehiculos.get(j).add(serialDesapilado);
                            serialDesapiladoApilado = true;
                            System.out.println("El vehiculo con serial: " + serialDesapilado + ", fue ubicado en la cola con indice: " + (j));
                            break;
                        } else{
                            serialDesapiladoApilado = false;
                        }
                    }
                    if (serialDesapiladoApilado == false){
                        System.out.println("SE DEBE HACER USO DE LA COLA AUXILIAR");
                        System.out.println("Se agrega el vehiculo con serial: " + serialDesapilado + ", a la cola auxiliar");
                        colaAuxiliar.add(serialDesapilado);
                    }
                }
    
                System.out.println("Se extrae el vehiculo con serial inicial: " + serial + ", de la cola con indice: " + (colaEncontrada));
                vehiculos.get(colaEncontrada).pollFirst();
    
                for (int i = 0; i < colaAuxiliar.size(); i ++){
                    vehiculos.get(colaEncontrada).add(colaAuxiliar.get(i));
                    System.out.println("El vehiculo con serial: " + colaAuxiliar.get(i) + ", fue devuelto a la cola original");
                }
    
            }else{
                System.out.println("El vehiculo con serial: " + serial + ", no fue encontrado en el puerto");
            }
        }
    
    
    
        public static void main(String[] args) {
            ArrayList<LinkedList> contenedores= new ArrayList<LinkedList>();
            ArrayList<LinkedList> vehiculos= new ArrayList<LinkedList>();