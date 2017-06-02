package lab6_ricardosanchez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Administracion {
    private ArrayList <Productos> listaP = new ArrayList();
    private File archivo = null;

    public Administracion (String Path) {
        archivo = new File(Path);
    }

    public ArrayList<Productos> getListaP() {
        return listaP;
    }

    public void setListaPersonas(ArrayList<Productos> listaP) {
        this.listaP = listaP;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    //Mutador extra
    public void setP(Productos p){
        this.listaP.add(p);
    }

    @Override
    public String toString() {
        return "Lista: " + listaP;
    }
    //Metodo de administracion
    public void escribirArchivo(){
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter (archivo,false);
            bw = new BufferedWriter(fw);
            for (Productos t : listaP) {
                bw.write(t.getNombreP() + ";");
                bw.write(t.getCategoria() + ";");
                bw.write(t.getPrecio() + ";");
                bw.write(t.getDescuento() + ";");
            }
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("EXCEPTION");
        }
    }
    public void cargarArchivo(){
        Scanner sc = null;
        //listaP = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while(sc.hasNext()){
                listaP.add(new Productos(sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble()));
                System.out.println("");
            }
        } catch (Exception e) {}
        finally{
            sc.close();
        }
    }
}
