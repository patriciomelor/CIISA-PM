
const modoOscuroBtn = document.getElementById('modoOscuroBtn');
const modoClaroBtn = document.getElementById('modoClaroBtn');
const body = document.body;

modoOscuroBtn.addEventListener('click', () => {
  body.classList.add('dark-mode');
  modoOscuroBtn.style.display = 'none';
  modoClaroBtn.style.display = 'inline-block';
});

modoClaroBtn.addEventListener('click', () => {
  body.classList.remove('dark-mode');
  modoOscuroBtn.style.display = 'inline-block';
  modoClaroBtn.style.display = 'none';
});


//modales
const leerMasButtons = document.querySelectorAll('.leer-mas');
const popups = document.querySelectorAll('.popup');

leerMasButtons.forEach(button => {
  button.addEventListener('click', function() {
    const popupId = this.getAttribute('data-popup');
    const popup = document.getElementById(popupId);
    popup.style.display = 'block';
  });
});

popups.forEach(popup => {
  const closeButton = popup.querySelector('.close');
  closeButton.addEventListener('click', function() {
    popup.style.display = 'none';
  });
});

//validaciones
document.addEventListener("DOMContentLoaded", function() {
  // Obtener el formulario
  var form = document.getElementById("ContactForm");

  // Agregar evento submit al formulario
  form.addEventListener("submit", function(event) {
    // Detener el envío del formulario
    event.preventDefault();

    // Realizar validación de campos
    var nombre = document.getElementById("nombre").value;
    console.log("Nombre:", nombre); // Añadido para depuración

    var apellido = document.getElementById("apellido").value;
    console.log("Apellido:", apellido); // Añadido para depuración

    var email = document.getElementById("email").value;
    console.log("Email:", email); // Añadido para depuración

    var servicio = document.getElementById("servicio").value;
    console.log("Servicio:", servicio); // Añadido para depuración

    var mensaje = document.getElementById("mensaje").value;
    console.log("Mensaje:", mensaje); // Añadido para depuración

    // Validar que los campos no estén vacíos
    if (nombre.trim() === "" || apellido.trim() === "" || email.trim() === "" || servicio.trim() === "" || mensaje.trim() === "") {
      // Mostrar mensaje de error en pantalla
      alert("Por favor, complete todos los campos.");
      return; // Evitar envío del formulario si hay campos vacíos
    }

    // Mostrar mensaje de éxito en pantalla
    alert("Formulario enviado con éxito.");

    // Puedes enviar el formulario aquí si lo deseas
    // form.submit();
  });
});
