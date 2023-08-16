Algoritmo CalculoSueldos
    Definir numTrabajadores, totalPagar como Entero
    Definir trabajadores como Matriz de Caracteres
	
    Escribir "Ingrese la cantidad de trabajadores:"
    Leer numTrabajadores
	
    Para i = 1 Hasta numTrabajadores Paso 1
        Escribir "Ingrese los datos del trabajador ", i, ":"
        LimpiarBuffer
		
        Escribir "Nombre:"
        Leer trabajadores[i][0]
		
        Escribir "Edad:"
        Leer trabajadores[i][1]
		
        Escribir "Horas por día:"
        Leer horasPorDia
        trabajadores[i][2] = ConvertirAString(horasPorDia)
		
        Escribir "Sueldo por hora:"
        Leer sueldoPorHora
        trabajadores[i][3] = ConvertirAString(sueldoPorHora)
		
        trabajadores[i][4] = ConvertirAString(horasPorDia * 6) // Total horas a la semana
    FinPara
	
    totalPagar = 0
	
    Escribir "Datos finales de cada trabajador:"
	
    Para i = 1 Hasta numTrabajadores Paso 1
        sueldoSemanal = ConvertirADouble(trabajadores[i][2]) * ConvertirADouble(trabajadores[i][3]) * 6
        totalPagar = totalPagar + sueldoSemanal
		
        Escribir trabajadores[i][0], " - Horas Semana: ", trabajadores[i][4], " - Sueldo Semanal: ", sueldoSemanal
    FinPara
	
    Escribir "Total a pagar por la empresa: ", totalPagar
FinAlgoritmo
