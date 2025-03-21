
# 🧠 **Ejercicio 2: Control de Nómina**

- ¡No todos los datos vienen como los esperamos! Valida que el sueldo sea positivo, por si acaso hay un rebelde con sueldo negativo 😅
- Usa una variable tipo `double acumuladoSueldos`, y cuando imprimas, hazle un casting a `float` solo por estética.
- **Entre `$100 y $300`** incluye ambos extremos, no los dejes por fuera como si no importaran.
- Para separar en rangos, **los operadores `>=` y `<=` son tu espada y escudo.**
- Si te dan una lista de 10 sueldos y te piden saber cuántos están en cierto rango, **no necesitas un array — un contador bien ubicado es suficiente.**

- variable para que el usuario puede ingresar la cantidad de sueldos 
- ciclo para evaluar que si se puedan unicamente ingresar esa canitidad de valores
- if, que evaluara si el sueldo es mayor a 0 si no, cierra el programa
- segunda condicion, para evaluar los valores que oscilan entre 100 y 300, y un acumulable dentro que incrementa en 1 el valor de cantidades de sueldos que oscilan entre estos numeros
- tercera condicion, evalua los valores mayores a 300 e incrementa en 1 la cantidad de valores mayores a estos
- cuarta condicion, evalua los valores menores a 100 e incrementa en 1 la cantidad de valores
- incremento para que aumente la cantidad de sueldos y se pueda detener el ciclo
- switch, para el output de los  valores