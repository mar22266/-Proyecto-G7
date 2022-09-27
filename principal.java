import java.util.Scanner;

public class principal {
    
    public static void main(String [] args){
        geografia g = new geografia();
        Scanner teclado = new Scanner(System.in);
        String menu = "1. Agregar Estudiante\n2. Lenguaje\n3. Matemáticas \n4. Geografía  \n5. Salir";
        int opcion = 1;
        System.out.println(menu);
        System.out.println("Ingrese una opción del menú: ");
        opcion = teclado.nextInt();
        teclado.nextLine();
        while (opcion < 5 && opcion>=1 ){
            switch(opcion){
                
                //Agregar estudiante
                case 1:{


                    System.out.println(menu);
                    System.out.println("Ingrese la opción que desea: ");
                    opcion = teclado.nextInt();
                    teclado.nextLine();
                    break;
                }
                //lengauje
                case 2: {

                    System.out.println(menu);
                    System.out.println("Ingrese la opción que desea: ");
                    opcion = teclado.nextInt();
                    teclado.nextLine();
                    break;
                }

                //MATE
                case 3: {

                    System.out.println(menu);
                    System.out.println("Ingrese la opción que desea: ");
                    opcion = teclado.nextInt();
                    teclado.nextLine();
                    break;
                }

                //GEOGRAFIA
                case 4: {
                    String menuGeo = "1. Repasar \n2. Evaluar\n3. Regresar a menu principal";
                    int opcionGeo = 1;
                    System.out.println(menuGeo);
                    System.out.println("Ingrese una opción del menú: ");
                    opcion = teclado.nextInt();
                    teclado.nextLine();
                    g.asignarValores();
                    String[][] matriz = g.getEnsena();
                    while (opcion < 4 && opcion>=1 ){
                        switch(opcion){
                            case 1:{
                        
                                for (int fila = 0; fila <8; fila++){
                                    for(int col = 0; col<2; col ++){
                                        System.out.print(matriz[fila][col]);
                                        
                                    }
                                }

                                System.out.println();


                                System.out.println(menuGeo);
                                System.out.println("Ingrese una opción del menú: ");
                                opcion = teclado.nextInt();
                                teclado.nextLine();
                                break;
                            }

                            case 2: {
                                int punteo = 0;
                                System.out.println("Cual es la cabecera de El Progreso?\n");
                                String r1 = teclado.nextLine();
                                System.out.println("Cual es la cabecera de Peten?\n");
                                String r2 = teclado.nextLine();
                                System.out.println("Cual es la cabecera de Alta Verapaz?\n");
                                String r3 = teclado.nextLine();
                                System.out.println("Cual es la cabecera de Escuintla?\n");
                                String r4 = teclado.nextLine();
                                System.out.println("Cual es la cabecera de Santa Rosa?\n");
                                String r5 = teclado.nextLine();
                                System.out.println("Cual es la cabecera de Zacapa?\n");
                                String r6 = teclado.nextLine();
                                System.out.println("Cual es la cabecera de Guatemala?\n");
                                String r7 = teclado.nextLine();
                                

                                System.out.println(menuGeo);
                                System.out.println("Ingrese una opción del menú: ");
                                opcion = teclado.nextInt();
                                teclado.nextLine();
                                break;
                            }
                            case 3: {

                                break;
                            }
                        }


                    System.out.println(menu);
                    System.out.println("Ingrese la opción que desea: ");
                    opcion = teclado.nextInt();
                    teclado.nextLine();
                    break;
                }
            }


          
          
           
           
            }
       
        }



    }
    
}
