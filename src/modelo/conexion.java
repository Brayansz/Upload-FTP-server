package modelo;

import java.awt.Desktop;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTP;

public class conexion {

    static FTPClient clienteftp;
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static boolean conectar(String servidor, String usuario, String password) {

        clienteftp = new FTPClient();

        try {
            clienteftp.connect(servidor);
            clienteftp.setFileType(FTP.BINARY_FILE_TYPE, FTP.BINARY_FILE_TYPE);
            clienteftp.setFileTransferMode(FTP.BINARY_FILE_TYPE);
            clienteftp.enterLocalPassiveMode();
            return clienteftp.login(usuario, password);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Datos incorrectos"); ;
        }
        return false;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void desconectar() {
            try {
                clienteftp.logout();
                clienteftp.disconnect();
            } catch (IOException ex) {
                Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void listaarchivos(JList lista) {
        try {
            String[] listaservidor = clienteftp.listNames();
            DefaultListModel modelo = new DefaultListModel();
            lista.setModel(modelo);

            if (listaservidor != null && listaservidor.length > 0) {
                for (String archivo : listaservidor) {
                    if (!".".equals(archivo) && !"..".equals(archivo)) {
                        modelo.addElement(archivo);
                        System.out.println("SERVER: " + archivo);
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void borrar(JList lista) {
        File fich = new File("/Descargas/Pruebaftp/" + lista.getSelectedValue());
        fich.delete();
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void borrart(String direct) {
        File carpeta = new File(direct);
        File[] archivos = carpeta.listFiles();
        for (File archivo : archivos) {
            archivo.delete();
        }
    }

    ;
 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
    public static void abrirf(JList lista) {
        try {
            File fichero = new File("/Descargas/Pruebaftp/" + lista.getSelectedValue());
            Desktop.getDesktop().open(fichero);
        } catch (IOException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void listadescargas(JList lista) {
        File carpetadescarga = new File("/Descargas/Pruebaftp/");
        String[] descargados = carpetadescarga.list();
        DefaultListModel modelo = new DefaultListModel();
        lista.setModel(modelo);
        if (descargados != null && descargados.length > 0) {
            for (String archivodesc : descargados) {
                if (!".".equals(archivodesc) && !"..".equals(archivodesc)) {
                    modelo.addElement(archivodesc);
                }
            }
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void creardirect(String nombre) {
        try {
            clienteftp.makeDirectory(nombre);
        } catch (IOException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void descargar(String archivo) {
        try {
            File archivodesc = new File("/Descargas/Pruebaftp/" + archivo);
            OutputStream salida = new BufferedOutputStream(new FileOutputStream(archivodesc));
            clienteftp.retrieveFile(archivo, salida);
            salida.close();
        } catch (IOException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void subir(String archivo) {
        
        FileInputStream entrada = null;

        try {
            File localFile = new File(archivo);
            entrada = new FileInputStream(localFile);
            String rutafinal = localFile.getName();
            clienteftp.storeFile(rutafinal, entrada);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                entrada.close();
            } catch (IOException ex) {
                Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}//final
