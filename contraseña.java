package contraseña;

import javax.swing.JOptionPane;

public class contraseña {
  
    public static void main(String[] args) {
  
        String contraseña="c++";
   
        final int INTENTOS = 3;
         
        boolean acierto=false;
  
        String password;
        for (int i=0;i<3 && !acierto;i++){
            password=JOptionPane.showInputDialog("Escribe la contraseña:");
  
            if (password.equals(contraseña)){
                System.out.println("Contraseña correcta.");
                acierto=true;
            }
        }
    }
}
