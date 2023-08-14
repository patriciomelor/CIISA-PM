import java.util.Scanner;

public class App {
    public static void main(String[] args) 
    {
		Scanner keyboard = new Scanner(System.in);
		double porcentajeultimaEvaluacion = 0.4;
        double notaMinima = 4.0; 
        
		boolean continuar = true;
        int opcion = 1;
        while(continuar)
        {
            switch(opcion)
            {
                case 1:
                {
					System.out.print("Ingrese la nota de la primera evaluacion: ");
					double prueba1;
					prueba1 = keyboard.nextDouble();
					keyboard.nextLine();

					System.out.print("Ingrese la nota de la segunda evaluacion: ");
					double prueba2 = 0;
					prueba2 = keyboard.nextDouble();
					keyboard.nextLine(); 

					//hacemos el calculo
                    double ponderadaNotasIniciales = (prueba1 * 0.3) + (prueba2 * 0.3);
					double notaNecesaria = (notaMinima - ponderadaNotasIniciales) / (porcentajeultimaEvaluacion);
					System.out.println("La nota necesaria en la ultima prueba, para aprobar el ramo es: " + notaNecesaria);
                    break;
                }
                case 2:
                {
                    continuar = false;
                    break;
                }
                default:
                {
                    System.out.println("Ingrese una opción valida.");
                }
            }
				//entramos al menú
                System.out.println("1) nuevo calculo");
                System.out.println("2) salir");
                opcion=keyboard.nextInt();
                keyboard.nextLine(); 
                if(opcion == 2)
                {
                    break;
                }
        }
        System.out.println("Fin!"); 
    }   
}