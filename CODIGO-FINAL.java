import java.util.*;
public class Puerto {

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
    }

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


    }
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

        // PRUEBAS
        Scanner sc = new Scanner(System.in);
        int entrada;

        while(true){
            System.out.println();
            System.out.println("Bienvenido al sistema de gestion del puerto");
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
