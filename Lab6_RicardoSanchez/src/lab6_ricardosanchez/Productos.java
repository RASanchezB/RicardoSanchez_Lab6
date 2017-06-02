package lab6_ricardosanchez;
public class Productos {
    private String NombreP;
    private String Categoria;
    private double Precio;
    private double Descuento;

    public Productos(String NombreP, String Categoria, double Precio, double Descuento) {
        this.NombreP = NombreP;
        this.Categoria = Categoria;
        this.Precio = Precio;
        this.Descuento = Descuento;
    }

    public String getNombreP() {
        return NombreP;
    }

    public void setNombreP(String NombreP) {
        this.NombreP = NombreP;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public double getDescuento() {
        return Descuento;
    }

    public void setDescuento(double Descuento) {
        this.Descuento = Descuento;
    }

    @Override
    public String toString() {
        return NombreP + "Precio: Lps" + Precio;
    }
    
    
}
