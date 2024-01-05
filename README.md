# Desafio Enero 2024 - Programando En Java

Bienvenido/a a el desafio de Programando en Java para Enero del 2024. Este desafio consiste en una serie de ejercicios destinados a practicar tus habilidades de programación en Java en diferentes aspectos.

## Instrucciones Generales

- **Java Version:** Utiliza Java como lenguaje de programación, puedes usar la version de java que te parezca mejor, aunque en el proyecto esta definido la version *18*.
- **Comentarios:** Proporciona comentarios para explicar el propósito y la funcionalidad de tu código.
- **Documentación:** Donde sea adecuado, agrega comentarios Javadoc para documentar tus clases y métodos.
- **Pruebas Unitarias:** Utiliza JUnit para escribir pruebas unitarias para tus implementaciones.
- **Herramientas:** Para realizar estas pruebas puedes usar cualquier tipo de herramientas, ayuda o libreria que necesites.
- **¡Diviertete!:** Siente libre de modificar el código cómo tu prefieras, no existe una única solución a los problemas, intenta resolverlos cómo creas conveniente.

## Estructura del Repositorio

El repositorio se organiza en carpetas, cada una correspondiente a una parte específica de la prueba. A continuación, se proporciona una descripción general de cada parte:

### Parte 1: Fundamentos de Java

- **Descripción:** Ejercicios para evaluar el conocimiento fundamental de Java.
- **Archivo:** `Parte1.java`
- **Pruebas Unitarias:** `Parte1Test.java`

Escribe un programa en Java que reciba una cadena de texto y devuelva la misma cadena pero con cada palabra invertida. Por ejemplo, para la entrada "Hola Mundo", la salida debería ser "aloH odluM".

### Parte 2: Manipulación de Datos y Pruebas Unitarias

- **Descripción:** Ejercicios para evaluar los conocimientos sobre de manipulacion de datos usando Java.
- **Archivos:** `Parte2.java`
- **Pruebas Unitarias:** `Parte2Test.java`

Implementa una clase en Java que tenga un método para agregar números enteros y otro método para calcular la suma de todos los elementos en la lista.

**Nota:** Si quieres continuar con el ejercicio puedes probar a que en vez de *enteros* que acepte cualquier tipo de clase

### Parte 3: Programación Orientada a Objetos

- **Descripción:** Modelado de clases para representar una biblioteca y sus operaciones, incluyendo herencia y pruebas unitarias.
- **Archivos:** `Libro.java`, `Biblioteca.java`, `Persona.java`, `LibroDigital.java`
- **Pruebas Unitarias:** `LibroTest.java`, `BibliotecaTest.java`, `PersonaTest.java`, `LibroDigitalTest.java`

Imagina que estás construyendo un sistema para una biblioteca. Diseña un conjunto de clases que modele el siguiente escenario:

### Ejercicio 1: Crea las clases

- **Clase `Libro`:**
    - Atributos: `titulo`, `autor`, `anoPublicacion`, `id`.
    - Métodos: Constructor, getters y setters.

- **Clase `Biblioteca`:**
    - Atributos: `libros` (una colección de libros).
    - Métodos:
        - `agregarLibro(Libro libro)`: Agrega un libro a la biblioteca.
        - `buscarLibroPorId(int id)`: Busca un libro por su identificador único y devuelve el objeto `Libro`.

- **Clase `Persona`:**
    - Atributos: `nombre`, `edad`, `id`.
    - Métodos:
        - `tomarPrestadoLibro(Libro libro)`: Permite que una persona tome prestado un libro.
        - `devolverLibro(Libro libro)`: Permite que una persona devuelva un libro a la biblioteca.

- *Nota:* El atributo `id` debe garantizar la unicidad.
- *Nota2:* ¡Recuerda! Puedes modificar el código cómo quieras, ¡lo importante es el resultado!, si crees que alguna clase debe ser cambiada o crees que necesites otras clases, puedes hacerlo.

### Ejercicio 2: Pruebas Unitarias

Escribe pruebas unitarias para las clases `Libro`, `Biblioteca` y `Persona`. Para el ejercicio 1, se espera que las pruebas verifiquen:
- La correcta creación de instancias de `Libro`, `Biblioteca` y `Persona`.
- La capacidad de la biblioteca para agregar y buscar libros por su identificador único.
- La capacidad de una persona para tomar prestado y devolver libros.

### Ejercicio 3: Herencia

Implementa una clase `LibroDigital` que herede de la clase `Libro`. Los libros digitales deben tener un atributo adicional para la URL de descarga.

*Nota:* No es necesario implementar realmente la entrada/salida de datos con archivos en este ejercicio, puedes enfocarte en el diseño de clases y métodos.


## ¿Cómo Proceder?

1. Haz un fork de este repositorio
2. Clona el repositorio fork en tu máquina local.
2. Completa cada parte de la prueba siguiendo las instrucciones proporcionadas en cada archivo.
3. Asegúrate de escribir pruebas unitarias para validar tu código.
4. Añade cualquier comentario adicional o aclaración que consideres necesario.
5. Al finalizar, puedes compartir tu solución en el [Discord](https://www.youtube.com/redirect?event=comments&redir_token=QUFFLUhqbTlKMk40RGFDYzJCQVJybjdFVGQ4QXY4clpFUXxBQ3Jtc0ttOGlKY0htZXcyQUNZS1l3eXJGSXk1Q0k3aGc5U1dkUFJPQ19aeWhDeTZURFJaQTZCaDFIX2NHNE9mVkZUZGNMRVVwYnRkZFV4ZFcxeDJwSHlXZGxpaVp4X0xFOW1KNXZDN2wwUlBwMjljLTdRNnlUOA&q=https%3A%2F%2Fdiscord.gg%2FK3CeetMx2r&stzid=UgyFZk6bUX_R1W97K_p4AaABAg) en el canal #Desafios para que otros también puedan verlo.

¡Buena suerte! Estamos emocionados de ver tu trabajo.
