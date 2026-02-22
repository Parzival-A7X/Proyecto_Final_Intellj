# Avances proyecto de maquina gachapon de Pokémon en dev 🌱🖥️

Aquí se muestra parte de las cosas que estan puestas ya en el avance por medio del branch dev que es tanto la base del CRUD como la ventana del fx aunque tambien hay un **`Main`** que hace las acciones actuales por medio de la terminal del IDE con todo y las `Excepciones` tanto de escribir letra en vez de numero y la de poner un numero fuera de la lista de acciones.

---

la base del while se sostiene de esta lista de acciones
```
                System.out.println("\nUsuario actual: ".toUpperCase() + usuarioActual.getNombre());
                System.out.println("---------------------------------");
                System.out.println("Monedas: " + usuarioActual.getCoins());
                System.out.println("---------------------------------");
                System.out.println("1. Tirar (cuesta 3 monedas)");
                System.out.println("---------------------------------");
                System.out.println("2. Ver mis Pokémon");
                System.out.println("---------------------------------");
                System.out.println("3. Liberar Pokémon");
                System.out.println("---------------------------------");
                System.out.println("4. Cambiar de usuario");
                System.out.println("---------------------------------");
                System.out.println("5. Salir");
                System.out.print("Elige: ");
```
>Aclarar que la lista de opciones es diferente a la del fx ya que aun no terminamos la programación de que se puede hacer y que no
---
Tambien el codigo cuenta con todas las clases necesarias en el package `pokemon` como:
- Pokedex
- Pokemon (nombre y todos los datos de rareza y tipo)
- Rareza y tipo (en version enum)

y en el package `Usuario` cuenta con la clase Jugador que es la base de todo lo que es como funciona lo de las monedas y el registro de la pokedex. Tambien está la clase Gachapon que es la parte de que al dar una tirada este de uno de la lista de pokemones aleatoriamente con todo y las probabilidades **60% común / 30% raro / 10%~ legendario**

### Tabla de avances y faltantes
| Que hace | Que aun no hace |
| ----------- | ----------- |
| Abrir ventana FX en la branch dev | no muestra imagenes ni de la maquina ni el pokemon |
| Pedir nombre de usuario | Borrar usuarios |
| Cambiar usuario | Liberar pokemones y que te de monedas igual a su rareza |
| que las tiradas para capturar te quita monedas | mostrar imagen de los pokemones capturados |
| devuelve una cantidad de monedas al capturar dependiendo la rareza | que cada usuario tenga su cantidad de monedas correspondientes |
| salir del programa | mostrar lista de usuarios ya creados al querer cambiar/crear |
