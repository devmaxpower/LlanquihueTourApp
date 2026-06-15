![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# 🧠 Actividad Formativa 2 – Construyendo una lista de objetos desde archivo

## 👤 Autor del proyecto

- **Nombre completo:** Maximiliano Villalobos
- **Carrera:** Analista Programador Computacional
- **Sede:** Campus Virtual

---

## 📘 Descripción general del sistema

Este proyecto corresponde a la Actividad Formativa 2 de la asignatura Desarrollo Orientado a Objetos I.

La aplicación permite leer información de tours turísticos almacenada en un archivo de texto (`tours.txt`), convertir cada registro en objetos de la clase `Tour` y almacenarlos en una colección dinámica utilizando `ArrayList`.

La solución implementa una estructura organizada en paquetes, separando la representación de los datos, la lógica de acceso a la información y la ejecución de la aplicación. Para ello, se utilizan conceptos fundamentales de Programación Orientada a Objetos y manejo de colecciones provistas por Java.

El proyecto incluye una clase encargada de leer el archivo de datos, procesar cada línea mediante el método `.split(";")`, crear objetos de tipo `Tour` y almacenarlos en una colección dinámica para posteriormente recorrerlos y filtrarlos según criterios definidos.

El proyecto fue desarrollado a partir del caso contextualizado "Llanquihue Tour", permitiendo aplicar lectura de archivos, colecciones, organización por paquetes y manipulación de objetos en Java.

---

## 🧱 Estructura general del proyecto

```plaintext
src
├── data
├── model
└── ui

resources
└── tours.txt
```

### 📂 Paquete `ui`

Contiene la clase principal del sistema:

* `Main.java`: punto de entrada de la aplicación. Permite cargar los datos desde el archivo de texto, recorrer la colección de tours y mostrar los resultados filtrados en consola.

### 📂 Paquete `model`

Contiene las clases que representan las entidades del dominio:

* `Tour.java`: almacena la información de cada tour turístico, incluyendo nombre, tipo y precio.

### 📂 Paquete `data`

Contiene las clases encargadas del acceso y procesamiento de datos:

* `GestorDatos.java`: lee el archivo `tours.txt`, separa los datos mediante el método `.split(";")`, crea objetos de tipo `Tour` y los almacena en una colección `ArrayList`.

### 📂 Carpeta `resources`

Contiene los recursos externos utilizados por la aplicación:

* `tours.txt`: archivo de texto que almacena la información de los tours turísticos. Cada línea representa un registro separado por punto y coma (`;`).

### 🔗 Relación entre clases

```plaintext
Main
 │
 ▼
GestorDatos
 │
 ▼
ArrayList<Tour>
 │
 ▼
Tour
```

Esta estructura permite separar las responsabilidades de la aplicación, organizando las clases según su función. El paquete `model` representa los datos del sistema, `data` gestiona la lectura y procesamiento de la información, mientras que `ui` contiene la lógica de ejecución y visualización de resultados. Esta organización favorece la reutilización de código y la mantenibilidad del proyecto.

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/devmaxpower/LlanquihueTourApp.git
```

2. Abre el proyecto en IntelliJ IDEA.

3. Verifica que el archivo `tours.txt` se encuentre dentro de la carpeta `resources`.

4. Ejecuta el archivo `Main.java` desde el paquete `ui`.

5. Revisa en consola el listado completo de tours y los resultados obtenidos mediante el filtrado de datos.

---

**Repositorio GitHub:** https://github.com/devmaxpower/LlanquihueTourApp

**Fecha de entrega:** 15/06/2026

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Actividad Formativa 2