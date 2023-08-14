import java.util.Scanner;

public class CalculadoraPonderada {
    public static void main(String[] args) 
    {
		Scanner keyboard = new Scanner(System.in);
        double Nmin = 4.0; 
        double Nmax = 7.0; 
       
		boolean rpt = true;
        int opcion = 1;
        while(rpt)
        {
            switch(opcion)
            {
                case 1:
                {
					System.out.println("Ingrese la Primera nota : ");
					Double Pnota;
					Pnota = keyboard.nextDouble();
					keyboard.nextLine();

					System.out.println("Ingrese la Segunda nota: ");
					Double Snota;
					Snota = keyboard.nextDouble();
					keyboard.nextLine(); 
                    
                    
                    Double calculoPond = ((Pnota * 0.3) + (Snota * 0.3));
                 
					Double  PasarRamo = (Nmin - calculoPond) / (0.4);

                    if (PasarRamo > 7.0) {
                        System.out.println("La nota Final no puede exceder a 70  o menor a 10");
                      
                    }  
                    else{
                        System.out.println("La nota necesaria en la ultima prueba, para aprobar el ramo es:" + Math.round(PasarRamo));
                   
                    }         
					 break;
                }
                case 2:
                {
                    rpt = false;
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