Algoritmo EVA
    Definir numPersonas, i, genero, trabaja, sueldo, hombres, mujeres, otros, trabajaHombres, trabajaMujeres, trabajaOtros, sueldoHombres, sueldoMujeres, sueldoOtros como Entero
	
    hombres <- 0
    mujeres <- 0
    otros <- 0
    trabajaHombres <- 0
    trabajaMujeres <- 0
    trabajaOtros <- 0
    sueldoHombres <- 0
    sueldoMujeres <- 0
    sueldoOtros <- 0
	
    numPersonas <- 10
	
    Para i <- 1 hasta numPersonas Hacer
        genero <- azar(3) + 1
        trabaja <- azar(2) + 1
		
        Si trabaja = 1 Entonces
            sueldo <- azar(2201) + 300
        Sino
            sueldo <- 0
        Fin Si
		
        Si genero = 1 Entonces
            mujeres <- mujeres + 1
        Sino Si genero = 2 Entonces
				hombres <- hombres + 1
			Sino
				otros <- otros + 1
			Fin Si
			
			Si trabaja = 1 Entonces
				Si genero = 1 Entonces
					trabajaMujeres <- trabajaMujeres + 1
					sueldoMujeres <- sueldoMujeres + sueldo
				Si genero = 2 Entonces
						trabajaHombres <- trabajaHombres + 1
						sueldoHombres <- sueldoHombres + sueldo
					Sino
						trabajaOtros <- trabajaOtros + 1
						sueldoOtros <- sueldoOtros + sueldo
					Fin Si
				Fin Si
			fin si
		fin si
	fin para
			
			
			porcentajeMujeres <- (mujeres / numPersonas) * 100
			porcentajeHombres <- (hombres / numPersonas) * 100
			porcentajeOtros <- (otros / numPersonas) * 100
			
			porcentajeTrabajaMujeres <- (trabajaMujeres / numPersonas) * 100
			porcentajeTrabajaHombres <- (trabajaHombres / numPersonas) * 100
			porcentajeTrabajaOtros <- (trabajaOtros / numPersonas) * 100
			
			promedioSueldoHombres <- sueldoHombres / trabajaHombres
			promedioSueldoMujeres <- sueldoMujeres / trabajaMujeres
			promedioSueldoOtros <- sueldoOtros / trabajaOtros
			
			Mostrar "Porcentaje de mujeres: ", porcentajeMujeres, "%"
			Mostrar "Porcentaje de hombres: ", porcentajeHombres, "%"
			Mostrar "Porcentaje de otros géneros: ", porcentajeOtros, "%"
			Mostrar "Porcentaje de mujeres que trabajan: ", porcentajeTrabajaMujeres, "%"
			Mostrar "Porcentaje de hombres que trabajan: ", porcentajeTrabajaHombres, "%"
			Mostrar "Porcentaje de otros géneros que trabajan: ", porcentajeTrabajaOtros, "%"
			Mostrar "Sueldo promedio de hombres que trabajan: ", promedioSueldoHombres
			Mostrar "Sueldo promedio de mujeres que trabajan: ", promedioSueldoMujeres
			Mostrar "Sueldo promedio de otros géneros que trabajan: ", promedioSueldoOtros
FinAlgoritmo
