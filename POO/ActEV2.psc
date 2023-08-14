Algoritmo ActEV2
	
	definir Afp,Salud como real;
	definir Nom, Apellido, Dpto Como Caracter;
	definir Sbruto Como Entero;
	
	
	Repetir
		Escribir "Ingresar Nombre del Empleado:";
		Leer Nom;
		Escribir "Ingresar Apellido del Empleado:";
		leer Apellido;
		Escribir "Ingresar nombre del departamento:";
		Leer Dpto;
		Escribir "Ingresar Sueldo Bruto:";
		Leer Sbruto;
		
		Afp <- (Sbruto*7)/100;
		Salud <- (Sbruto*12)/100;
		Liq <- Sbruto-Afp-Salud;
		
		
		Mostrar "---------Liquidacion de Sueldo----------";
		Mostrar "Nombre: ",Nom," || Apellido: ",Apellido;
		Mostrar "----------------------------------------";
		Mostrar "Area; ",Dpto;
		Mostrar "----------------------------------------";
		Mostrar "Sueldo Bruto: ", Sbruto;
		Mostrar "----------------------------------------";
		Mostrar "AFP: ",Afp," || ","Salud: ",Salud;
		Mostrar "----------------------------------------";
		Mostrar "Sueldo Liquido: ",Liq;
		Mostrar "----------------------------------------";
		
		Esperar 5 Segundos
		Escribir "Desea Ingresar otra Liquidacion? S/n";
		Leer op;
		Borrar Pantalla
	Hasta Que op = "n"
	
	
FinAlgoritmo
