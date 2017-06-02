package lab6_ricardosanchez;

import java.util.ArrayList;

public class Clientes {
    private ArrayList<Productos> ListaP = new ArrayList();
    private String Nombre;
    private int Edad;

    public Clientes(String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public ArrayList<Productos> getListaP() {
        return ListaP;
    }

    public void setListaP(ArrayList<Productos> ListaP) {
        this.ListaP = ListaP;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
}
