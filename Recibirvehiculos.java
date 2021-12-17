static void recibirVehiculo(ArrayList<LinkedList> vehiculos, int serial){
            System.out.println();
            boolean contieneSerial = false;
            boolean agregado = false;
            int colaUtilizada = 0;
    
            for (int i = 0; i < vehiculos.size(); i ++){
                Iterator<Integer> iterador = vehiculos.get(i).listIterator();
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
                System.out.println("El vehiculo con serial: " + serial + ", ya se encuentra en el puerto");
            }else{
                for (int i = 0; i < vehiculos.size(); i ++){
                    if (vehiculos.get(i).size() < 10){
                        vehiculos.get(i).add(serial);
                        agregado = true;
                        colaUtilizada = (i + 1);
                    }
                }
                if (agregado == true){
                    System.out.println("El vehiculo con serial: " + serial + ", se agregó en la cola con indice: " + (colaUtilizada-1));
                }else{
                    System.out.println("ALERTA: El puerto se encuentra en su capacidad máxima de vehiculos y no se puede agregar el vehiculo con serial: " + serial);
                }
            }
        }