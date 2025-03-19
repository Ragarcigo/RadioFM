import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
menu();

    }
    static void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Encendiendo la Radio...Indica la frecuencia");
        double frecuenciaInicial=sc.nextDouble();
        SintonizadorFm radio=new SintonizadorFm(frecuenciaInicial);
        int opcion = 0;
        do{
            System.out.println("*** RADIO FM ***");
            System.out.println("1. Subir Frecuencia");
            System.out.println("2. Bajar Frecuencia");
            System.out.println("3. Mostrar Frecuencia");
            System.out.println("4. Salir");
            System.out.print("Opcion---> ");
            try{
                opcion = sc.nextInt();
                switch(opcion){
                    case 1->radio.subirFrecuencia();
                    case 2->radio.bajarFrecuencia();
                    case 3->radio.mostrarFrecuencia();
                    case 4-> System.out.println("Apagando la Radio....");
                    default -> System.out.println("Opción no válida");
                }
            }catch(Exception e){
                System.out.println("Opción no válida");
                sc.nextLine();
            }
        }while(opcion!=4);
    }
}