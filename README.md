<div align="center">

# 💱 Conversor de Monedas

### *Aplicación de consola en Java para conversión de divisas en tiempo real*

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=java)
![Maven](https://img.shields.io/badge/Maven-Project-red?style=for-the-badge&logo=apache-maven)
![Status](https://img.shields.io/badge/Status-Activo-success?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

---

</div>

## 📋 Descripción

**Conversor de Monedas** es una aplicación de línea de comandos desarrollada en Java que permite realizar conversiones entre diferentes monedas en tiempo real utilizando una API de tipos de cambio. La aplicación ofrece una interfaz intuitiva y soporta conversiones entre Dólar estadounidense, Peso argentino, Real brasileño y Peso colombiano.

Este proyecto fue desarrollado como parte del programa "Backend en Java" de Alura, implementando las mejores prácticas de desarrollo y consumo de APIs.

## ✨ Características

- 🔄 **Conversión en tiempo real** - Utiliza tasas de cambio actualizadas
- 💰 **Múltiples monedas** - Soporte para USD, ARS, BRL y COP
- 🔐 **Validación de API Key** - Sistema de autenticación seguro
- 🎨 **Interfaz de consola amigable** - Menú interactivo y fácil de usar
- 📊 **Precisión decimal** - Resultados con formato apropiado según la moneda
- 🏗️ **Arquitectura MVC** - Código organizado siguiendo el patrón Modelo-Vista-Controlador

## 🚀 Conversiones Disponibles

| Desde | Hacia | Código |
|-------|-------|--------|
| 🇺🇸 Dólar | 🇦🇷 Peso Argentino | USD → ARS |
| 🇦🇷 Peso Argentino | 🇺🇸 Dólar | ARS → USD |
| 🇺🇸 Dólar | 🇧🇷 Real Brasileño | USD → BRL |
| 🇧🇷 Real Brasileño | 🇺🇸 Dólar | BRL → USD |
| 🇺🇸 Dólar | 🇨🇴 Peso Colombiano | USD → COP |
| 🇨🇴 Peso Colombiano | 🇺🇸 Dólar | COP → USD |

## 🛠️ Tecnologías Utilizadas

- **Java 21** - Lenguaje de programación principal
- **Maven** - Gestión de dependencias y construcción del proyecto
- **Gson** - Serialización/deserialización de JSON para estructurar la respuesta de la API
- **ExchangeRate API** - Fuente de datos de tipos de cambio en tiempo real

## 📁 Estructura del Proyecto

```
Java-in-JSP/
├── src/
│   └── main/
│       └── java/
│           ├── controllers/
│           │   └── ControllerExchange.java    # Controlador de lógica de conversión
│           ├── models/
│           │   ├── Connection.java            # Gestión de conexiones API
│           │   └── Exchange.java              # Modelo de datos de Exchange
│           └── org/example/
│               └── Main.java                  # Punto de entrada de la app
├── pom.xml
└── README.md
```

### 📦 Componentes Principales

- **Main.java** - Punto de entrada de la aplicación con interfaz de usuario
- **ControllerExchange.java** - Controlador para manejar la lógica de conversión
- **Exchange.java** - Modelo de datos para las tasas de cambio con métodos de conversión
- **Connection.java** - Gestión de conexiones con la API externa

## 🔧 Requisitos Previos

- ☕ Java JDK 21 o superior
- 📦 Maven 3.6 o superior
- 🔑 API Key de [ExchangeRate-API](https://www.exchangerate-api.com/)

## 📥 Instalación

1. **Clonar el repositorio**
   ```bash
   git clone https://github.com/TomasBozzano/Java-challenges.git
   cd Java-challenges
   ```

2. **Compilar el proyecto con Maven**
   ```bash
   mvn clean install
   ```

3. **Ejecutar la aplicación**
   ```bash
   mvn exec:java -Dexec.mainClass="org.example.Main"
   ```

## 🎯 Uso

1. Al iniciar la aplicación, se te solicitará ingresar tu **API Key**
2. Si la key es válida, aparecerá el menú principal
3. Selecciona la opción de conversión deseada (1-6)
4. El programa mostrará el resultado de la conversión
5. Selecciona la opción **7** para salir

### 💡 Ejemplo de Uso

```
Por favor, ingresa tu API key: tu_api_key_aqui

==============================
|   Bienvenidos al conversor |
|   de monedas               |
==============================
| 1. Dolar -> Peso Argentino |
| 2. Peso Argentino -> Dolar |
| 3. Dolar -> Real Brasilero |
| 4. Real Brasilero -> Dolar |
| 5. Dolar -> Peso Colombiano|
| 6. Peso Colombiano -> Dolar|
| 7. Salir                   |

1
Has seleccionado Dolar -> Peso Argentino
1 Dolar equivale a 987.50 Pesos Argentinos
```

## 🔐 Obtener una API Key

1. Visita [ExchangeRate-API](https://www.exchangerate-api.com/)
2. Crea una cuenta gratuita
3. Copia tu API Key
4. Úsala al iniciar la aplicación

> **Nota de Seguridad:** Por motivos de seguridad, la API key se solicita individualmente en la consola y no se almacena en el código fuente.

## 🏆 Logros del Proyecto

- ✅ Implementación exitosa de **GSON** para estructurar la respuesta de la API
- ✅ Arquitectura limpia siguiendo el patrón **MVC**
- ✅ Sistema de validación de API Key
- ✅ Manejo de errores y excepciones
- ✅ Interfaz de usuario intuitiva

## 📝 Licencia

Este proyecto está bajo la Licencia MIT - ver el archivo [LICENSE](LICENSE) para más detalles.

## 👨‍💻 Autor

**Tomas Bozzano**

- GitHub: [@TomasBozzano](https://github.com/TomasBozzano)
- Proyecto: [Java-challenges](https://github.com/TomasBozzano/Java-challenges)

---

<div align="center">

### ⭐ Si te gustó este proyecto, considera darle una estrella ⭐

**Hecho con ❤️ y ☕ por Tomas Bozzano**

</div> 
