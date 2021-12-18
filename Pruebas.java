  // PRUEBAS
            Scanner sc = new Scanner(System.in);
            int entrada;
    
            while(true){
                System.out.println();
                System.out.println("Bienvenido al sistema de gestion del puerto PANASE");
                System.out.println("Ingrese 1 si desea obtener el número total de contenedores");
                System.out.println("Ingrese 2 si desea obtener el número total de vehiculos");
                System.out.println("Ingrese 3 si desea obtener los elementos de una pila de contenedores");
                System.out.println("Ingrese 4 si desea obtener los elementos de una cola de vehiculos");
                System.out.println("Ingrese 5 si desea recibir un contenedor");
                System.out.println("Ingrese 6 si desea recibir un vehiculo");
                System.out.println("Ingrese 7 si desea obtener la ubicacion de un contenedor");
                System.out.println("Ingrese 8 si desea obtener la ubicacion de un vehiculo");
                System.out.println("Ingrese 9 si desea entregar un contenedor");
                System.out.println("Ingrese 10 si desea entregar un vehiculo");
                System.out.println("Ingrese 11 si desea terminar");
    
                entrada = sc.nextInt();
                if (entrada == 1){
                    obtenerNumeroContenedores(contenedores);
                }else if (entrada == 2){
                    obtenerNumeroVehiculos(vehiculos);
                }else if (entrada == 3){
                    System.out.println("Ingrese el indice de la pila en la que desea buscar");
                    int indice = sc.nextInt();
                    obtenerElementosPilaContenedores(contenedores, indice + 1);
                }else if (entrada == 4){
                    System.out.println("Ingrese el indice de la cola en la que desea buscar");
                    int indice = sc.nextInt();
                    obtenerElementosColaVehiculos(vehiculos, indice + 1);
                }else if (entrada == 5){
                    System.out.println("Ingrese el serial del contenedor que desea agregar");
                    int indice = sc.nextInt();
                    recibirContenedor(contenedores, indice);
                }else if (entrada == 6){
                    System.out.println("Ingrese el serial del vehiculo que desea agregar");
                    int indice = sc.nextInt();
                    recibirVehiculo(vehiculos, indice);
                }else if (entrada == 7){
                    System.out.println("Ingrese el serial del contenedor que desea buscar");
                    int indice = sc.nextInt();
                    obtenerContenedorConSerial(contenedores, indice);
                }else if (entrada == 8){
                    System.out.println("Ingrese el serial del vehiculo que desea buscar");
                    int indice = sc.nextInt();
                    obtenerVehiculoConSerial(vehiculos, indice);
                }else if (entrada == 9){
                    System.out.println("Ingrese el serial del contenedor que desea entregar");
                    int indice = sc.nextInt();
                    entregarContenedor(contenedores, indice);
                }else if (entrada == 10){
                    System.out.println("Ingrese el serial del vehiculo que desea entregar");
                    int indice = sc.nextInt();
                    entregarVehiculo(vehiculos, indice);
                }else if (entrada == 11){
                    break;
                }
            }
        }
    
    }