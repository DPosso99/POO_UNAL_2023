/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemamensajeria;

/**
 *
 * @author David
 */
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class SistemaMensajeria {
    private ListaDoble usuarios;

    public SistemaMensajeria() {
        this.usuarios = new ListaDoble();
        cargarUsuarios();
        cargarContraseñas();
    }

    private void cargarUsuarios() {
        try (BufferedReader br = new BufferedReader(new FileReader("Empleados.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(" ");
                String nombre = datos[0].replace("-", " ");
                long id = Long.parseLong(datos[1]);
                Fecha fechaNacimiento = new Fecha(Short.parseShort(datos[2]), Short.parseShort(datos[3]), Short.parseShort(datos[4]));
                String ciudadNacimiento = datos[5];
                long telefono = Long.parseLong(datos[6]);
                String email = datos[7];
                Direccion direccion = new Direccion();
                direccion.setCalle(datos[8]);
                direccion.setNomenclatura(datos[9]);
                direccion.setBarrio(datos[10]);
                direccion.setCiudad(datos[11]);
                if (datos.length > 12) {
                    direccion.setEdificio(datos[12]);
                    direccion.setApto(datos[13]);
                }
                Usuario usuario = new Usuario(nombre, id);
                usuario.setFecha_nacimiento(fechaNacimiento);
                usuario.setCiudad_nacimiento(ciudadNacimiento);
                usuario.setTel(telefono);
                usuario.setEmail(email);
                usuario.setDir(direccion);
                agregarUsuario(usuario); // Agregar ordenado por ID
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cargarContraseñas() {
        // Leer y almacenar las contraseñas en una estructura adecuada
    }

    public void iniciarSesion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su ID:");
        long id = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Ingrese su contraseña:");
        String contraseña = scanner.nextLine();

        Usuario usuario = buscarUsuario(id);
        if (usuario != null && validarContraseña(id, contraseña)) {
            System.out.println("Bienvenido, " + usuario.getNombre());
            if (esAdministrador(id)) {
                mostrarMenuAdministrador(usuario);
            } else {
                mostrarMenuEmpleado(usuario);
            }
        } else {
            System.out.println("ID o contraseña incorrecta.");
        }
    }

    private Usuario buscarUsuario(long id) {
        for (NodoDoble nodo = usuarios.getHead(); nodo != null; nodo = nodo.getNext()) {
            Usuario usuario = nodo.getData();
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    private boolean validarContraseña(long id, String contraseña) {
        // Implementar validación usando el archivo Password.txt
        return true; // Simplificación para seguir con la implementación
    }

    private boolean esAdministrador(long id) {
        // Verificar si el usuario es administrador basándose en la información de Password.txt
        return true; // Simplificación para seguir con la implementación
    }

    private void mostrarMenuAdministrador(Usuario usuario) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Agregar usuario");
            System.out.println("2. Eliminar usuario");
            System.out.println("3. Cambiar contraseña");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    agregarNuevoUsuario(scanner);
                    break;
                case 2:
                    eliminarUsuario(scanner);
                    break;
                case 3:
                    cambiarContraseña(scanner);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 4);
    }

    private void mostrarMenuEmpleado(Usuario usuario) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Enviar mensaje");
            System.out.println("2. Leer mensajes");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    enviarMensaje(usuario, scanner);
                    break;
                case 2:
                    leerMensajes(usuario);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 3);
    }

    private void agregarNuevoUsuario(Scanner scanner) {
        System.out.println("Ingrese nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese ID:");
        long id = scanner.nextLong();
        scanner.nextLine(); // Limpiar buffer
        // Resto de la información...

        Usuario nuevoUsuario = new Usuario(nombre, id);
        // Configurar el resto de la información...
        agregarUsuario(nuevoUsuario);
        System.out.println("Usuario agregado.");
    }

    private void agregarUsuario(Usuario usuario) {
        NodoDoble current = usuarios.getHead();
        if (current == null || current.getData().getId() > usuario.getId()) {
            usuarios.addFirst(usuario);
        } else {
            while (current.getNext() != null && current.getNext().getData().getId() < usuario.getId()) {
                current = current.getNext();
            }
            usuarios.addAfter(current, usuario);
        }
    }

    private void eliminarUsuario(Scanner scanner) {
        System.out.println("Ingrese ID del usuario a eliminar:");
        long id = scanner.nextLong();
        scanner.nextLine();
        NodoDoble current = usuarios.getHead();
        while (current != null && current.getData().getId() != id) {
            current = current.getNext();
        }
        if (current != null) {
            if (current == usuarios.getHead()) {
                usuarios.head = current.getNext();
            } else {
                current.getPrev().setNext(current.getNext());
            }
            if (current == usuarios.tail) {
                usuarios.tail = current.getPrev();
            } else {
                current.getNext().setPrev(current.getPrev());
            }
            System.out.println("Usuario eliminado.");
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    private void cambiarContraseña(Scanner scanner) {
        System.out.println("Ingrese ID del usuario:");
        long id = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Ingrese nueva contraseña:");
        String nuevaContraseña = scanner.nextLine();
        // Actualizar la contraseña en el archivo
    }

    private void enviarMensaje(Usuario remitente, Scanner scanner) {
        System.out.println("Ingrese ID del destinatario:");
        long destinatarioId = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Ingrese título del mensaje:");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese mensaje:");
        String contenido = scanner.nextLine();

        Usuario destinatario = buscarUsuario(destinatarioId);
        if (destinatario != null) {
            Mensaje mensaje = new Mensaje(remitente.getNombre(), titulo, contenido);
            destinatario.recibirMensaje(mensaje);
            System.out.println("Mensaje enviado.");
        } else {
            System.out.println("Destinatario no encontrado.");
        }
    }

    private void leerMensajes(Usuario usuario) {
        usuario.leerBandejaEntrada();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número del mensaje que desea leer:");
        int numeroMensaje = scanner.nextInt();
        usuario.leerMensaje(numeroMensaje);
    }

    public static void main(String[] args) {
        SistemaMensajeria sistema = new SistemaMensajeria();
        sistema.iniciarSesion();
    }
}