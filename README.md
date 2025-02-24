# Taller Java
# 🚀 Ejercicio #3 Inventario de Productos con Map y List
## 📌 Propósito
Este programa en Java permite gestionar un inventario de productos organizados por categorías. Utiliza una estructura de datos Map`<String, List<String>>` para almacenar categorías y sus respectivos productos. El programa permite:

1. Registrar categorías y productos.
2. Mostrar todos los productos de una categoría específica.
3. Agregar nuevos productos a categorías existentes.
4. Mostrar la lista completa de categorías y productos.

El proyecto utiliza conceptos básicos de programación en Java, como colecciones (`Map` y `List`), entrada/salida por consola y manipulación de datos
# 🚀 Instalación y Configuración
## Requisitos Previos
- Java Development Kit (JDK) 17 o superior
- Git instalado en tu sistema
## Clonar Repositorio
```bash
https://github.com/luistalero/Inventario_Productos.git
```
# 🛠️ Uso
## 1. Registro de Categorías:
- El programa solicitará al usuario la cantidad de categorías que desea registrar.
- Seguido pedira nombre de la categoria, el objeto de esa categoria y pregunrtara si desea añadir otro objeto y se almacenarán en un `Map<String, List<String>>`.
## 2. Mostrar Productos por categoría: 
- Una vez seleccionada la opción Uno(1) del menú, está pedira el nombre de la categoría que se desea ver y seguido mostrará todos los objetos de esa categoría.
## 3. Agregar producto nuevo:
- Una vez seleccionada la opción Dos(2) del menú, está pedirá el nombre de la categoria a la que se quiere agregar otro objeto y luego pedira el nombre de ese nuevo objeto.
## 4. Mostrar todas las categorias y productos:
- Una vez seleccionada la opción Tres(3) del menú, está mostrará todas las cvategorías junto a sus objetos.
## 5. salir:
- Una vez seleccionada la opción Cuatro(4) del menú, está cerrará el programa agradeciendo por haberlo usado.
## 👷Ejemplo de Ejecución
```bash
Ingrese la cantidad de categorías: '2'
Ingrese el nombre de la categoría 1: 'Fruta'
Ingrese el nombre de un producto para la categoria Fruta: 'Manazana'
¿Desea agregar otro producto a la categoria Fruta? (s/n): 's'
Ingrese el nombre de un producto para la categoria Fruta: 'Banana'
¿Desea agregar otro producto a la categoria Fruta? (s/n): 'n'
Ingrese el nombre de la categoría 2: 'Verduras'
Ingrese el nombre de un producto para la categoria Verduras: 'Tomate'
¿Desea agregar otro producto a la categoria Verduras? (s/n): 's'
Ingrese el nombre de un producto para la categoria Verduras: 'Cebolla'
¿Desea agregar otro producto a la categoria Verduras? (s/n): 'n'
===========================================
====         ¿Que desea hacer?         ====
===========================================
1. Mostrar Productos por categoría
2. Agregar producto nuevo
3. Mostrar todas las categorias y productos
4. Salir

Seleccione una opción: '1'
Ingrese el nombre de la categoría: 'Fruta'
Productos de la categoria Fruta:
- Manazana
- Banana
```
```bash
===========================================
====         ¿Que desea hacer?         ====
===========================================
1. Mostrar Productos por categoría
2. Agregar producto nuevo
3. Mostrar todas las categorias y productos
4. Salir

Seleccione una opción: '2'
Ingrese el nombre de la categoria: 'Fruta'
Ingrese el nombre del nuevo producto: 'Pera'
Producto Pera agregado a la categoría Fruta.
```
```bash
===========================================
====         ¿Que desea hacer?         ====
===========================================
1. Mostrar Productos por categoría
2. Agregar producto nuevo
3. Mostrar todas las categorias y productos
4. Salir

Seleccione una opción: '3' 
Lista completa de productos y su categoría:
Categoría: Fruta
Productos:
- Manazana
- Banana
- Pera

Categoría: Verduras
Productos:
- Tomate
- Cebolla
```
```bash
===========================================
====         ¿Que desea hacer?         ====
===========================================
1. Mostrar Productos por categoría
2. Agregar producto nuevo
3. Mostrar todas las categorias y productos
4. Salir

Seleccione una opción: '4'
¡¡Gracias por usar este Programa!!
```
# 📋 Características
- Registro de categorías y productos utilizando `Map<String, List<String>>`.
- Mostrar todos los productos de una categoría específica.
- Agregar nuevos productos a categorías existentes.
- Mostrar la lista completa de categorías y productos.
# 🚨 Estado del Ejercicio
- Culminado.
# 👤 Autor
- Luis Alberto Talero Martinez
