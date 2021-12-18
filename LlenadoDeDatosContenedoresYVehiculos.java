// LLENADO DE LOS DATOS PARA CONTENEDORES Y VEHICULOS
            int contador;
            contador = 1;
            for (int i = 0; i < 100; i ++){
                LinkedList<Integer> pila = new LinkedList<Integer>();
                for (int k = 0; k < 5; k ++){
                    pila.addFirst(contador);
                    if (contador == 498){
                        break;
                    }
                    contador += 1;
                }
                contenedores.add(pila);
            }
    
            contador = 1;
            for (int i = 0; i < 10; i ++){
                LinkedList<Integer> cola = new LinkedList<Integer>();
                for (int k = 0; k < 10; k ++){
                    cola.add(contador);
                    if (contador == 98){
                        break;
                    }
                    contador += 1;
                }
                vehiculos.add(cola);
            }
    
            