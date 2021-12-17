 static void recibirContenedor(ArrayList<LinkedList> contenedores, int serial){
            System.out.println();
            boolean contieneSerial = false;
            boolean agregado = false;
            int pilaUtilizada = 0;
    
            for (int i = 0; i < contenedores.size(); i ++){
                Iterator<Integer> iterador = contenedores.get(i).listIterator();
                while(iterador.hasNext()){
                    if (serial == iterador.next()){
                        contieneSerial = true;
                        break;
                    }else{
                        contieneSerial = false;
                    }
                }
                if (contieneSerial == true){
                    break;
                }
            }
    
            if (contieneSerial == true){
                System.out.println("El contenedor con serial: " + serial + ", ya se encuentra en el puerto");
            }else{
                for (int i = 0; i < contenedores.size(); i ++){
                    if (contenedores.get(i).size() < 5){
                        contenedores.get(i).addFirst(serial);
                        agregado = true;
                        pilaUtilizada = (i + 1);
                    }
                }
                if (agregado == true){
                    System.out.println("El contenedor con serial: " + serial + ", se agregó en la pila con indice: " + (pilaUtilizada-1));
                }else{
                    System.out.println("ALERTA: El puerto se encuentra en su capacidad máxima de contenedores y no se puede agregar el contenedor con serial: " + serial);
                }
            }
        }