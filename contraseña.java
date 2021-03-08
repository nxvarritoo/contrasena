package contrasena;

import javax.swing.JOptionPane;

public class contrasena {
  
    public static void main(String[] args) {
  
        String contrasen="c++";
   
        final int INTENTOS = 3;
         
        boolean acierto=false;
  
        String password;
        for (int i=0;i<3 && !acierto;i++){
            password=JOptionPane.showInputDialog("Escribe la contraseña:");
  
            if (password.equals(contrasena)){
                System.out.println("Contraseña correcta.");
                acierto=true;
            }
        }
    }
}
