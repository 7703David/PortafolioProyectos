package TCD;

import java.net.*;  // Biblioteca de funciones de red
import java.io.*;   // Biblioteca de manejo de flujos

public class ProgramaServidorTCP {
    public static void main(String[] args) throws Exception {
        // Iniciar socket de escucha TCP en el puerto 5000
        ServerSocket server = new ServerSocket(5002);
        String msg = "Hola cliente, te habla un servidor Java\n"; // Mensaje a enviar al cliente
        
        System.out.println("Iniciando el servidor...");
        System.out.println("Hecho. Esperando clientes...\n");
        
        while (true) {
            // Aceptar al cliente y establecer comunicación con este
            Socket socket = server.accept();
            System.out.println("Se ha detectado a un cliente.");
            
            // Habilitar el flujo de entrada para el socket
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            // Habilitar el flujo de salida para el socket
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            
            byte[] datos = new byte[256]; // Buffer de datos recibidos
            dis.read(datos, 0, datos.length);
            System.out.println("El cliente dice: " + new String(datos).trim()); // Imprimir en pantalla el mensaje
            
            // Enviar un mensaje de respuesta
            System.out.println("Enviando el mensaje de respuesta: " + msg + "...");
            dos.write(msg.getBytes(), 0, msg.length());
            
            // Cerrar los flujos de entrada y salida del socket
            dis.close();
            dos.close();
            socket.close(); // Cerrar el socket y finalizar la comunicación
        }
    }
}