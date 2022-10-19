import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class ClasePadre {

    public static void main(String[] args) throws IOException {

        File fichero = new File("C:\\Users\\a21dominicohl\\IdeaProjects\\Ejercicio4PSP\\target\\classes");

        ProcessBuilder pb = new ProcessBuilder("java", "ClaseHijo", "Manolo");

        pb.directory(fichero);


        Process proceso = pb.start();

        //InputStream is = proceso.getInputStream();

        int exitValue;

        try {
            exitValue = proceso.waitFor();
            System.out.println("Valor de salida: " + exitValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
