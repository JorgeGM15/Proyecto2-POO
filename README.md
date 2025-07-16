# Sistema Bancario en Java - Herencia y Polimorfismo

Este proyecto es una aplicación desarrollada en Java para la **Programación Orientada a Objetos (POO)**. A través de una jerarquía de clases de cuentas bancarias, se ilustran de manera práctica la **herencia**, el **polimorfismo** y el **encapsulamiento**.

---

## ✨ Conceptos Clave Demostrados

* **Herencia**: Se define una clase base `CuentaBanco` con funcionalidades comunes, y dos clases derivadas, `CuentaAhorro` y `RevisionCuenta`, que heredan y extienden estas funcionalidades.
* **Polimorfismo**: El proyecto demuestra cómo objetos de diferentes clases (`CuentaAhorro`, `RevisionCuenta`) pueden ser tratados como objetos de su clase padre (`CuentaBanco`), permitiendo que un mismo método (`retirar`) se comporte de manera diferente según el tipo real del objeto.
* **Sobrescritura de Métodos (`@Override`)**: Las clases hijas proporcionan una implementación específica del método `retirar`, adaptándolo a sus propias reglas de negocio (límites de retiro, comisiones, etc.).
* **Encapsulamiento**: El acceso a los atributos de las clases (como el `saldo`) está controlado a través de métodos públicos, protegiendo la integridad de los datos.

---

## 📂 Estructura de Clases

* **`CuentaBanco.java`**: La **superclase** que define una cuenta bancaria genérica.
* **`CuentaAhorro.java`**: Una **subclase** que representa una cuenta de ahorros con un límite de retiro.
* **`RevisionCuenta.java`**: Una **subclase** que modela una cuenta corriente que cobra una cuota por cada retiro.
* **`Principal.java`**: La clase principal que contiene el método `main` para ejecutar el programa y demostrar la interacción entre los objetos.

---

## 🚀 Cómo Compilar y Ejecutar

1.  Asegúrate de tener el **JDK (Java Development Kit)** instalado en tu sistema.
2.  Abre una terminal o consola de comandos en el directorio donde se encuentran los archivos `.java`.
3.  **Compila** todos los archivos Java. Puedes compilar el archivo principal y el compilador se encargará de las dependencias:
    ```bash
    javac Principal.java
    ```
4.  **Ejecuta** el programa principal:
    ```bash
    java Principal
    ```

### Salida Esperada
No se puede retirar, el monto excede el límite de retiro.
Retirado: 250.0. Saldo actual: 750.0
No se puede retirar, saldo insuficiente para cubrir el retiro y la cuota de consulta.
Retirado: 820.0. Saldo actual: 180.0
