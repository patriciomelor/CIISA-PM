document.addEventListener("DOMContentLoaded", function () {
    
 //Primera letra Mayuscula
 
        function capitalizeFirstLetter(string) {
          return string.charAt(0).toUpperCase() + string.slice(1);
        }

        // Función para aplicar el formato de primera letra mayúscula a un campo
        function capitalizeInputField(inputField) {
          var currentValue = inputField.value;
          var capitalizedValue = capitalizeFirstLetter(currentValue);
          inputField.value = capitalizedValue;
        }

        // Obtén todas las entradas de tipo texto con la clase "capitalize-input"
        var inputFields = document.querySelectorAll('.capitalize-input');

        // Agrega escuchadores de eventos a todas las entradas
        inputFields.forEach(function(inputField) {
          inputField.addEventListener('blur', function() {
              capitalizeInputField(inputField);
          });
        });


//Ultima letra mayuscula

        function capitalizeLastLetter(string) {
          var lastChar = string.slice(-1).toUpperCase();
          return string.slice(0, -1) + lastChar;
      }

      // Función para aplicar el formato de última letra mayúscula a un campo
      function capitalizeLastInputField(inputField) {
          var currentValue = inputField.value;
          var capitalizedValue = capitalizeLastLetter(currentValue);
          inputField.value = capitalizedValue;
      }

      // Obtén todas las entradas de tipo texto con la clase "capitalize-last"
      var inputFields = document.querySelectorAll('.capitalize-last');

      // Agrega escuchadores de eventos a todas las entradas
      inputFields.forEach(function(inputField) {
          inputField.addEventListener('blur', function() {
              capitalizeLastInputField(inputField);
          });
      });

//Focus
      // Obtén una referencia al campo de entrada por su ID
      var campo = document.getElementById("nombre");

      // Establece el enfoque automático en el campo de entrada
      campo.focus();


// Sexo
      var sexoInput = document.getElementById("sexo");
              
      sexoInput.addEventListener("input", function() {
          var input = sexoInput.value.toUpperCase();
          
          if (input === "F") {
              sexoInput.value = "Femenino";
          } else if (input === "M") {
              sexoInput.value = "Masculino";
          } else if (input === "I") {
              sexoInput.value = "Indefinido";
          }
      });


    var regex = /^(\+?56)?(\s?)(0?9)(\s?)[98765432]\d{7}$/;

    //set telefono
    $("#telefono").keyup(function(){
        if($("#telefono").val() == ""){
            $("#telefono").val("+56 2 ")
        }
        $("#telefono").val($("#telefono").val().replace(regex, ""))
        });
    ("#celular").keyup(function(){
        if($("#celular").val() == ""){
            $("#celular").val("+56 9 ")
        }
        $("#celular").val($("#celular").val().replace(regex, ""))
    });

    //Javascript

    // var numTel = document.getElementById("celular");

    // numTel.addEventListener("keyup", function(){
    //     if (numTel.value == ""){
    //     numTel.value = "+56 9";
    //     }
    //     numTel.value = numTel.value.replace(regex,"");
    // })

    //Todo el formulario requerido
    var formulario = document.getElementById("Registro");
            
    formulario.addEventListener("submit", function(event) {
        var campos = formulario.querySelectorAll("input");
        var valido = true;
        
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
    //mostrar datos en modals
        // var enviarButton = document.querySelector(".btn[data-bs-target='#exampleModal']");

        // enviarButton.addEventListener("click", function () {
        //     var nombre = document.getElementById("nombre").value;
        //     var apellido = document.getElementById("Apellido").value;
        //     var reservaDesde = document.getElementById("datepicker1").value;
        //     var reservaHasta = document.getElementById("datepicker2").value;
        //     var telefono = document.getElementById("telefono").value;
        //     var celular = document.getElementById("celular").value;
        //     var correo = document.getElementById("validationCustomUsername").value;
        //     var sexo = document.getElementById("sexo").value;

        //     var modalContent = document.querySelector(".modal-body");
        //     modalContent.innerHTML = `
        //         <p><strong>Nombre:</strong> ${nombre} ${apellido}</p>
        //         <p><strong>Reserva Desde:</strong> ${reservaDesde}</p>
        //         <p><strong>Reserva Hasta:</strong> ${reservaHasta}</p>
        //         <p><strong>Teléfono:</strong> ${telefono}</p>
        //         <p><strong>Celular:</strong> ${celular}</p>
        //         <p><strong>Correo:</strong> ${correo}</p>
        //         <p><strong>Sexo:</strong> ${sexo}</p>
        //     `;
        // });

    
// habilitar botn enviar solo cuando el formulario este lleno
// var camposFormulario = document.querySelectorAll(".form-control");
// var botonEnviar = document.getElementById("botonEnviar");

// camposFormulario.forEach(function (campo) {
//     campo.addEventListener("input", function () {
//         var formularioCompleto = true;
//         camposFormulario.forEach(function (campo) {
//             if (campo.value.trim() === "") {
//                 formularioCompleto = false;
//             }
//         });

//         if (formularioCompleto) {
//             botonEnviar.removeAttribute("disabled");
//         } else {
//             botonEnviar.setAttribute("disabled", "disabled");
//         }
//     });
// });
$(document).ready(function() {
    $(".datepicker").datepicker();
});

});