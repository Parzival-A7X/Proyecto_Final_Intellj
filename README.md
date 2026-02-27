# Configuración previa para poder usar el main

Aquí se muestra una configuración necesaria previa a usar el programa que de requisitos ocupa el **Java fx sdk 17** (que ya está en la carpeta javafx-sdk).

---
## Paso 1
Arriba izquierda del IntelliJ le damos clic a las 4 lineas, al hacer esto nos vamos a `Run` y en este se despliega una lista de opciones.
- Run
- Debug
- ...
  
nos vamos a la que dice *Edit configurations...* y se abrirá un menú 
```
Run/Debug Configurations

+ - copy folder sort


Add...             
```

---
## Paso 2
le damos a agregar nueva configuracion y le damos a `Application`
nos dará una serie de opciones pero lo que hay que hacer es:

- Cambia el nombre a MainFX
- revisar que la Main class sea la del fx (org.Proyecto.Pokestation.MainFX)
- revisar la versión de java sea sdk 21

Ahora le damos clic al boton de arriba la versión que dice **Modify options** y buscaremos el que diga Add VM options y le damos que si.
En la barra que dice VM options vamos a pegar esto   *--module-path "direccion donde este el proyecto\javafx-sdk-17.0.18\lib" --add-modules javafx.controls,javafx.fxml*  

**OJO** antes revise estos detalles

- Que sea la ruta correcta y que sea directo al lib
- que sea la misma versión y no cambiarla
- no quitar comillas

Con esto ya deberia ser suficiente para que el `Main` que es donde corre el programa pueda funcionar y abra la ventana jar del proyecto

Este es el main por si no sabe cual de los 2
```
package org.Proyecto.Pokestation;

public class Main {
    public static void main(String[] args) {
        MainFX.launch(MainFX.class, args);
    }
}
```       
