package com.inventario_productos;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngrese la cantidad de categorías: ");
        int categorias = sc.nextInt();
        sc.nextLine();
    
        Map<String, List<String>> inventario = new HashMap<>();

        for (int i = 0; i < categorias; i++) {
            System.out.print("Ingrese el nombre de la categoría " + (i+1) + ": ");
            String categoria = sc.nextLine();

            List<String> productos = new ArrayList<>();
            boolean agregarProducto;
            do {
                System.out.print("Ingrese el nombre de un producto para la categoria " + categoria + ": ");
                String producto = sc.nextLine();
                productos.add(producto);

                System.out.println("¿Desea agregar otro producto a la categoria " + categoria + "? (s/n): ");
                String respuesta = sc.nextLine();
                agregarProducto = respuesta.equalsIgnoreCase("s");
            } while (agregarProducto);

            inventario.put(categoria, productos);
        }

        int opcion;
        do {
            String menu = """
            ===========================================
            ====         ¿Que desea hacer?         ====
            ===========================================
            1. Mostrar Productos por categoría
            2. Agregar producto nuevo
            3. Mostrar todas las categorias y productos
            4. Salir
            """;
            System.out.println(menu);
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la catrgoría: ");
                    String buscarCategoria = sc.nextLine();
                    if (inventario.containsKey(buscarCategoria)) {
                        System.out.println("Productos de la categoria " + buscarCategoria + ": ");
                        List<String> productos = inventario.get(buscarCategoria);
                        for (String producto : productos) {
                            System.out.println("- " + producto);
                        }
                    } else {
                        System.err.println("La categoria " + buscarCategoria + " no existe.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el nombre de la categoria: ");
                    String agregarProducto = sc.nextLine();
                    if (inventario.containsKey(agregarProducto)) {
                        System.out.print("Ingrese el nombre del nuevo producto: ");
                        String nuevoProducto = sc.nextLine();
                        inventario.get(agregarProducto).add(nuevoProducto);
                        System.out.println("Producto " + nuevoProducto + " agregado a la categoría " + agregarProducto + ".");
                    } else {
                        System.err.println("La categoría " + agregarProducto + " no existe.");
                    }
                    break;

                case 3:
                    System.out.println("Lista completa de productos y su categoría: ");
                    for (Map.Entry<String, List<String>> entry : inventario.entrySet()) {
                        System.out.println("Categoría: \n" + entry.getKey());
                        System.out.println("Productos: ");
                        for (String producto : entry.getValue()) {
                            System.out.println("- " + producto);
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("¡¡Gracias por usar este Programa!!");
                    break;
            
                default:
                    System.out.println("Esta opción no es valida... ");
                    break;
            }

        } while (opcion != 4);

        sc.close();
    }
}