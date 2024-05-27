import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Herencia {
   
public void leerArchivo() throws FileNotFoundException, IOException {
    File archivo =new File ("C:\\prueba.txl");
    FileReader fr =new FileReader (archivo);
    BufferedReader bf = new BufferedReader (fr);
    String linea; 
    
    while ((linea = bf.readLine())!=null){
        System.out.println(linea);
    }
} 

public void leerArchivo2(){
    try{
        leerArchivo();  
    } catch(FileNotFoundException ex){
    JOptionPane.showMessageDialog(null,"No se ha encontrado el archivo deseado");
} catch(IOException e){
    JOptionPane.showMessageDialog(null,"Ha ocurrido una excepcion verificada");
} finally {
        
    }

    System.out.println("Programa Terminado");    
}
    public static void main(String[] args) {
        Herencia herencia =new Herencia();
        herencia.leerArchivo2();
    }
}