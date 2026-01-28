package HashTable;

import java.util.Hashtable;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
//Crear registros en una Hashtable de usuario y contraseña, con menú para modificar
public class Cuentas {

    // Método para pedir contraseña con confirmación
    public static String pedirPasswordConfirmada(String mensaje) {
        while (true) {
            JPasswordField pass1 = new JPasswordField();
            int op1 = JOptionPane.showConfirmDialog(
                    null,
                    pass1,
                    mensaje,
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );

            if (op1 != JOptionPane.OK_OPTION) {
                return null;
            }

            JPasswordField pass2 = new JPasswordField();
            int op2 = JOptionPane.showConfirmDialog(
                    null,
                    pass2,
                    "Confirme la contraseña",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );

            if (op2 != JOptionPane.OK_OPTION) {
                return null;
            }

            String contra1 = new String(pass1.getPassword());
            String contra2 = new String(pass2.getPassword());

            if (contra1.isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "La contraseña no puede estar vacía",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                continue;
            }

            if (!contra1.equals(contra2)) {
                JOptionPane.showMessageDialog(null,
                        "Las contraseñas no coinciden, intente nuevamente",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                return contra1;
            }
        }
    }

    public static void main(String[] args) {

        Hashtable<String, String> user = new Hashtable<>();

        // Registro inicial
        String NombrePrin = JOptionPane.showInputDialog("Ingrese el nombre de usuario");
        while (NombrePrin == null || NombrePrin.isEmpty()) {
            NombrePrin = JOptionPane.showInputDialog("El nombre no puede estar vacío. Ingrese el nombre de usuario");
        }

        String Contra = pedirPasswordConfirmada("Ingrese la contraseña del usuario");
        if (Contra == null) {
            JOptionPane.showMessageDialog(null, "Registro cancelado. El programa finalizará.");
            return;
        }

        user.put(NombrePrin, Contra);

        // Se muestran los usuarios con sus contraseñas en consola (para pruebas)
        System.out.println("Usuarios:\n" + user);

        char consola = JOptionPane.showInputDialog("¿Desea abrir el menú de opciones? (s/n)").toLowerCase().charAt(0);
        while (!(consola == 's' || consola == 'n')) {
            consola = JOptionPane.showInputDialog("ERROR. ¿Desea abrir el menú de opciones? (s/n)").toLowerCase().charAt(0);
        }

        while (consola == 's') {

            int Options = Integer.parseInt(JOptionPane.showInputDialog(
                    "Ingrese la acción a realizar:\n"
                    + "[1] Agregar usuario\n"
                    + "[2] Eliminar usuario\n"
                    + "[3] Editar contraseña de usuario\n"
                    + "[4] Consultar contraseña de un usuario específico"
            ));

            switch (Options) {

                case 1: // Agregar usuario
                    int NumNuevos = Integer.parseInt(
                            JOptionPane.showInputDialog("Ingrese el número de usuarios que desea agregar"));

                    for (int i = 0; i < NumNuevos; i++) {
                        String Nombre = JOptionPane.showInputDialog("Ingrese el nombre de usuario");
                        while (user.containsKey(Nombre) || Nombre == null || Nombre.isEmpty()) {
                            Nombre = JOptionPane.showInputDialog(
                                    "Ese nombre de usuario ya existe o es inválido. Ingrese otro:");
                        }

                        Contra = pedirPasswordConfirmada("Ingrese la contraseña para " + Nombre);
                        if (Contra != null) {
                            user.put(Nombre, Contra);
                        }
                    }

                    System.out.println("=================================================");
                    System.out.println("Usuarios:\n" + user);
                    break;

                case 2: // Eliminar usuario
                    String elimi = JOptionPane.showInputDialog("Ingrese el nombre del usuario a eliminar");

                    user.remove(elimi);

                    System.out.println("=================================================");
                    System.out.println("Usuarios:\n" + user);
                    break;

                case 3: // Editar contraseña
                    String Nombre = JOptionPane.showInputDialog("Ingrese el nombre de usuario");

                    if (user.containsKey(Nombre)) {
                        Contra = pedirPasswordConfirmada("Ingrese la nueva contraseña para " + Nombre);
                        if (Contra != null) {
                            user.put(Nombre, Contra);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "El usuario no existe",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }

                    System.out.println("=================================================");
                    System.out.println("Usuarios:\n" + user);
                    break;

                case 4: // Consultar contraseña de un usuario
                    String consul = JOptionPane.showInputDialog(
                            "Ingrese el nombre de usuario del que desea saber la contraseña");

                    while (!user.containsKey(consul)) {
                        consul = JOptionPane.showInputDialog(
                                "Usuario no encontrado. Ingrese nuevamente el nombre de usuario:");
                    }

                    System.out.println("=================================================");
                    System.out.println("La contraseña de " + consul + " es: " + user.get(consul));
                    break;

                default:
                    JOptionPane.showMessageDialog(null,
                            "ERROR, opción incorrecta",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    break;
            }

            consola = JOptionPane.showInputDialog("¿Desea volver al menú? (s/n)").toLowerCase().charAt(0);
            while (!(consola == 's' || consola == 'n')) {
                consola = JOptionPane.showInputDialog("ERROR. ¿Desea volver al menú? (s/n)").toLowerCase().charAt(0);
            }
        }

        JOptionPane.showMessageDialog(null,
                "El programa ha finalizado su ejecución",
                "Finalización",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
