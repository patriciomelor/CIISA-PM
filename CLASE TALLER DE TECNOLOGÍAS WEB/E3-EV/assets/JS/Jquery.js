function calcular() {
if(document.getElementById('TV').value == "UF") {
      
  var UFV="30000";

    let  Anios = parseInt(document.getElementById("canios").value);
    let  interes = parseFloat("3,6");
    let  monto =  parseInt(document.getElementById("ValorCasa").value);

    MontoEnUF = monto*UFV;
    MontoConInteresTotal = MontoEnUF/(Anios*interes);
    MontoUFPorcentaje = (100*80)/MontoConInteresTotal;
    alert("Monto es: "+MontoUFPorcentaje);

  }
if (document.getElementById("TV").value == "PESOS") {
  
    let  Anios = document.getElementById("canios").value;
    let  interes = parseFloat("3,6");
    let  monto =  document.getElementById("ValorCasa").value;

    MontoConInteresTotal = monto/(Anios*interes);
    MontoPesosPorcentaje = (80*100)/MontoConInteresTotal;

    windows.alert("Monto es: "+MontoPesosPorcentaje);
    
}
}