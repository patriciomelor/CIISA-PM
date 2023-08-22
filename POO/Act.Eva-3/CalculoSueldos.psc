Algoritmo CalculoSueldos
    Definir numTrabajadores como Entero
    Definir i como Entero
    Definir horasPorDia, sueldoPorHora, sueldoSemanal, totalPagar como Real
	
    Escribir "Ingrese la cantidad de trabajadores:"
    Leer numTrabajadores
	
    Dimension trabajadores[numTrabajadores, 5] // Matriz con 5 columnas
	
    Para i<- 1 Hasta numTrabajadores con Paso 1 hacer 
        Escribir "Ingrese los datos del trabajador ", i, ":"		
        Escribir "Nombre:"
        Leer trabajadores[i, 0]
		
        Escribir "Edad:"
        Leer trabajadores[i, 1]
		
        Escribir "Horas por día:"
        Leer horasPorDia
        trabajadores[i, 2] = horasPorDia
		
        Escribir "Sueldo por hora:"
        Leer sueldoPorHora
        trabajadores[i, 3] = sueldoPorHora
		
        trabajadores[i, 4] = horasPorDia * 6// Total horas a la semana
    FinPara
	
    totalPagar = 0.0
	
    Escribir "Datos finales de cada trabajador:"
	
    Para i<-1 Hasta numTrabajadores con Paso 1 hacer
        sueldoSemanal = trabajadores[i, 2] * (trabajadores[i, 3] * 6)
        totalPagar = totalPagar + sueldoSemanal
		
        Escribir trabajadores[i, 0], " - Horas Semana: ", trabajadores[i, 4], " - Sueldo Semanal: ", sueldoSemanal
    FinPara
	
    Escribir "Total a pagar por la empresa: ", totalPagar
FinAlgoritmo
