static void entregarContenedor(ArrayList<LinkedList> contenedores, int serial){
            System.out.println();
            boolean serialEncontrado = false;
            int pilaEncontrada = 0;
            int cantidadDesapilar = 0;
    
            for (int i = 0; i < contenedores.size(); i ++){
                Iterator<Integer> iterador = contenedores.get(i).listIterator();
                while(iterador.hasNext()){
                    if (serial == iterador.next()){
                        serialEncontrado = true;
                    }
                }
                if (serialEncontrado == true){
                    pilaEncontrada = (i);
                    break;
                }
            }
    
            if (serialEncontrado == true){
                // CALCULAR CANTIDAD A DESAPILAR
                Iterator<Integer> iterador = contenedores.get(pilaEncontrada).listIterator();
                while(iterador.hasNext()){
                    if (serial != iterador.next()){
                        cantidadDesapilar += 1;
                    }else{
                        break;
                    }
                }
                System.out.println("cantidad a desapilar: " + cantidadDesapilar);
    
                System.out.println("INICIA DESAPILAMIENTO");
                LinkedList<Integer> pilaAuxiliar= new LinkedList<Integer>();
    
                for (int i = 0; i < cantidadDesapilar; i ++){
                    Integer serialDesapilado = (Integer) contenedores.get(pilaEncontrada).pollFirst();
                    boolean serialDesapiladoApilado = false;
    
                    for (int j = 0; j < contenedores.size(); j ++){
                        if (contenedores.get(j).size() < 5 && contenedores.get(j) != contenedores.get(pilaEncontrada)){
                            contenedores.get(j).addFirst(serialDesapilado);
                            serialDesapiladoApilado = true;
                            System.out.println("El contenedor con serial: " + serialDesapilado + ", fue ubicado en la pila con indice: " + (j));
                            break;
                        } else{
                            serialDesapiladoApilado = false;
                        }
                    }
                    if (serialDesapiladoApilado == false){
                        System.out.println("SE DEBE HACER USO DE LA PILA AUXILIAR");
                        System.out.println("Se agrega el contenedor con serial: " + serialDesapilado + ", a la pila auxiliar");
                        pilaAuxiliar.addFirst(serialDesapilado);
                    }
                }
    
                System.out.println("Se extrae el contenedor con serial inicial: " + serial + ", de la pila con indice: " + (pilaEncontrada));
                contenedores.get(pilaEncontrada).pollFirst();
    
                for (int i = 0; i < pilaAuxiliar.size(); i ++){
                    contenedores.get(pilaEncontrada).addFirst(pilaAuxiliar.get(i));
                    System.out.println("El contenedor con serial: " + pilaAuxiliar.get(i) + ", fue devuelto a la pila original");
                }
    
            }else{
                System.out.println("El contenedor con serial: " + serial + ", no fue encontrado en el puerto");
            }