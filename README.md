# 💱 Conversor de Monedas Dinámico

![Banner](img/banner.jpg) 

---

## 📌 Descripción

**Conversor de Monedas Dinámico** es una aplicación de consola en Java que permite convertir entre diferentes monedas con tasas de cambio actualizadas en tiempo real.  
Obtiene las tasas desde la API [ExchangeRate-API](https://www.exchangerate-api.com) usando una llamada HTTP y procesa la información con Gson.

La aplicación soporta conversiones entre:  
- Dólar Estadounidense (USD)  
- Peso Argentino (ARS)  
- Real Brasileño (BRL)  
- Peso Colombiano (COP)  

---

## 🚀 Funcionalidades

- Consultar las tasas de cambio más recientes en tiempo real.  
- Convertir montos entre distintas monedas de manera rápida y sencilla.  
- Menú interactivo en consola para seleccionar la conversión deseada.  
- Manejo de errores básicos en caso de fallas con la API.

---
![Monedas de diferentes países](img/money.jpg)

*Imagen que muestra varias monedas de diferentes países, representando el concepto de conversión de divisas.*
---

## 🛠 Tecnologías

- Java 11+  
- [Gson](https://github.com/google/gson) para manejo de JSON  
- API ExchangeRate-API para tasas de cambio  
- Java HttpClient para solicitudes HTTP  

---

## ⚙️ Instalación y uso

1. **Clonar el repositorio**

```bash
git clone https://github.com/tu_usuario/conversor-monedas.git
cd conversor-monedas