import java.util.*;

public class Main{

    public static void main(String[] args){

        ArrayList<Paciente> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int opcion;
        int paciente;
        
        do{
        
        System.out.println("\n-----------------------------------------\n");
        System.out.println("           DIAGNOSTICO MEDICO                ");
        System.out.println("\n-------------------------------------------\n");


        System.out.println("1. Registrar paciente. ");
        System.out.println("2. Mostrar informacion del paciente. ");
        System.out.println("3. Calcular IMC. ");
        System.out.println("4. Estado del paciente. ");
        System.out.println("5. Mostrar pacinetes registrados. ");

        System.out.print("\n6. Salir. ");

        System.out.print("\nElija una opcion: ");

        opcion = sc.nextInt();

        switch(opcion){

            case 1:
                Paciente p = new Paciente();
                p.Registrar();
                lista.add(p);
                
                break;

            case 2:
                System.out.println("Ingrese el numero del paciente: ");
                 paciente = sc.nextInt();

                lista.get(paciente).imprimir();

                break;

            case 3:
                System.out.println("Ingrese el numero del paciente: ");
                paciente = sc.nextInt();
                
                lista.get(paciente).MostrarIMC();

                break;

            case 4:
                System.out.println("Ingrese el numero del paciente: ");
                paciente = sc.nextInt();
                
                lista.get(paciente).EstadoPac();
                

                break;

            case 5:

                if(lista.size() == 0){

                    System.out.println("Registro vacio. ");
                }
                else{

                System.out.println("Lista de pacientes ingresados: ");

                for(int i = 0; i < lista.size(); i ++){

                    lista.get(i).imprimir();
                    System.out.println();
                }

                System.out.println();

                }

                break;

            case 6:
                System.out.println("Saliendo del programa... ");

                break;

            default:
                System.out.println("Opcion invalida.");
                break;
            }
     }while(opcion != 6);



    }
}