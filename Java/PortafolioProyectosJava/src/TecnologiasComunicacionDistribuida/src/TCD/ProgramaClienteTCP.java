package TCD;

import java.net.*;  // Biblioteca de funciones de red
import java.io.*;   // Biblioteca de manejo de flujos

public class ProgramaClienteTCP {
    public static void main(String[] args) throws Exception {
        // Buffer de datos recibidos
        byte[] datos = new byte[256];
        String dirIP; // Variable que almacena la IP del servidor
        String msg = "Hola, soy un cliente Java\n"; // Mensaje a enviar
        
        // Pedir la dirección IP del servidor
        System.out.println("Escriba la dirección IP a conectarse:");
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        dirIP = x.readLine(); // Leer la dirección IP ingresada

        // Inicializar la comunicación con el servidor en el puerto 5000
        Socket socket = new Socket("127.0.0.1", 5002);
        
        // Habilitar el flujo de entrada para el socket
        DataInputStream din = new DataInputStream(socket.getInputStream());
        // Habilitar el flujo de salida para el socket
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        
        // Enviar el mensaje al servidor
        System.out.println("Enviando un mensaje al servidor: " + msg);
        dos.write(msg.getBytes());
        dos.flush();

        // Leer la respuesta del servidor
        din.read(datos, 0, datos.length);
        String message = new String(datos).trim(); // Convertir a cadena el mensaje recibido
        
        // Imprimir el mensaje del servidor
        System.out.println("Mensaje del servidor: " + message);
        
        // Cerrar los flujos de entrada y salida del socket
        din.close();
        dos.close();
        socket.close(); // Cerrar el socket y finalizar la comunicación
    }
}
