document.addEventListener("DOMContentLoaded", function() {
    const investmentTypeSelect = document.getElementById("investmentType");
    const currencyOptions = document.getElementById("currencyOptions");
    const currencySelect = document.getElementById("currency");
    const durationInput = document.getElementById("duration");
    const amountInput = document.getElementById("amount");
    const calculateButton = document.getElementById("calculateButton");

    investmentTypeSelect.addEventListener("change", function() {
        if (investmentTypeSelect.value === "plazoRenovable") {
            currencyOptions.style.display = "none";
        } else {
            currencyOptions.style.display = "block";
        }
    });

    calculateButton.addEventListener("click", function() {
        const investmentType = investmentTypeSelect.value;
        const currency = currencySelect.value;
        const duration = parseFloat(durationInput.value);
        const amount = parseFloat(amountInput.value);

        if (!investmentType || !currency || isNaN(duration) || isNaN(amount)) {
            alert("Por favor, complete todos los campos obligatorios.");
            return;
        }

        let interestRate = 0.0047;
        let message = `Tipo de inversión: ${investmentType}\nMonto: ${amount}\nDuración: ${duration} días\n`;

        if (currency === "uf") {
            if (duration < 120 || duration > 365) {
                alert("El plazo debe estar entre 120 y 365 días para UF.");
                return;
            }
            interestRate *= duration;
            message += `Intereses a ganar: ${amount * interestRate}`;
        } else {
            if (duration < 7 || duration > 90) {
                alert("El plazo debe estar entre 7 y 90 días para PESOS.");
                return;
            }
            message += `Intereses a ganar: ${amount * interestRate * duration}`;
        }

        alert(message);
    });
});
