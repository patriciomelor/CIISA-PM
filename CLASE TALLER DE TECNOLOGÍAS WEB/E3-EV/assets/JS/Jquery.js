document.addEventListener("DOMContentLoaded", function() {
  const valorCasaInput = document.getElementById("ValorCasaInput");
  const tipoValorPropiedadSelect = document.getElementById("TV");
  const montoMaximoDiv = document.getElementById("montoMaximo");
  const resultadoDiv = document.getElementById("resultado");
  const formulario = document.getElementById("credit-simulator-form");
  const submitButton = document.getElementById("submit-button");

  valorCasaInput.addEventListener("input", function() {
    const tipoValorPropiedad = tipoValorPropiedadSelect.value;
    const valorCasa = parseFloat(valorCasaInput.value);
    const montoMaximo = valorCasa * 0.8;

    montoMaximoDiv.textContent = `${tipoValorPropiedad === "UF" ? (montoMaximo * 30000).toFixed(2) : montoMaximo.toFixed(2)}`;
    resultadoDiv.innerHTML = ''; 
  });

  formulario.addEventListener("submit", function(event) {
    const campos = formulario.querySelectorAll("input");
    let valido = true;
    
    campos.forEach(function(campo) {
      if (campo.value.trim() === "") {
        valido = false;
        campo.style.border = "1px solid red";
      } else {
        campo.style.border = "1px solid #ccc";
      }
    });
    
    if (!valido) {
      event.preventDefault();
    }
  });

  submitButton.addEventListener("click", function(event) {
    event.preventDefault();

    const tipoVivienda = document.getElementById("tipoVivienda").value;
    const tipoValorPropiedad = tipoValorPropiedadSelect.value;
    const valorCasa = parseFloat(valorCasaInput.value);
    const anos = parseInt(document.getElementById("canios").value);
    const interes = parseFloat(document.getElementById("Interes").value.replace(",", ".")); // Limpia la coma

    if (tipoVivienda === "" || tipoValorPropiedad === "" || isNaN(valorCasa) || isNaN(anos) || isNaN(interes)) {
      resultadoDiv.innerHTML = '<p class="text-danger">Por favor, complete todos los campos.</p>';
      return;
    }
    
    const montoMaximo = valorCasa * 0.8;
    const montoPedir = tipoValorPropiedad === "UF" ? (montoMaximo * 30000) : montoMaximo;
    
    montoMaximoDiv.textContent = `${tipoValorPropiedad === "UF" ? Math.floor(montoMaximo * 30000) : Math.floor(montoMaximo)}`;
    
    if (montoPedir > montoMaximo) {
      resultadoDiv.innerHTML = '<p class="text-danger">El monto a pedir excede el 80% del valor de la casa.</p>';
      return;
    }

    const cuotaMensualDiv = document.getElementById("cuotaMensualDiv");
    const tasaInteres = interes / 100;
    const cuotaMensual = calcularCuotaMensual(montoPedir, tasaInteres, anos);
    cuotaMensualDiv.innerHTML = `<p>Cuota Mensual: $${cuotaMensual.toFixed(2)}</p>`;
  });

  function calcularCuotaMensual(monto, tasa, plazo) {
    const r = tasa / 12;
    const n = plazo * 12;
    const cuota = (monto * r) / (1 - Math.pow(1 + r, -n));
    return cuota;
  }
});
