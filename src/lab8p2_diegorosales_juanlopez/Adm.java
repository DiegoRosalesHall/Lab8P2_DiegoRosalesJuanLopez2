
package lab8p2_diegorosales_juanlopez;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class Adm implements Serializable{
    ArrayList<User> usuarios = new ArrayList<>();
    ArrayList<Torneo> torneos = new ArrayList<>();
    File archivo =null;
    
public Adm(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<User> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<User> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Torneo> getTorneos() {
        return torneos;
    }

    public void setTorneos(ArrayList<Torneo> torneos) {
        this.torneos = torneos;
    }
    public void escribirArchivo() throws IOException {
         FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (User u : usuarios){
                bw.writeObject(u);
            }
            for (Torneo t : torneos) {
                bw.writeObject(t);
            }
            
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    public void cargarArchivo() throws IOException {
        try {            
            usuarios = new ArrayList();
            torneos = new ArrayList();
            User temp;
            Torneo temp2;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (User) objeto.readObject()) != null) {
                        usuarios.add(temp);
                    }
                    while((temp2 = (Torneo) objeto.readObject())!= null){
                        torneos.add(temp2);
                    }
                    
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
