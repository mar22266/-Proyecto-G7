import java.util.Scanner;

public class principal {
    
    public static void main(String [] args){
        geografia g = new geografia();
        Scanner teclado = new Scanner(System.in);
        String menu = "1. Agregar Estudiante\n2. Lenguaje\n3. Matemáticas \n4. Geografía  \n 5. Salir";
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
