package Lab;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando Goti
 */
public class Articulos_Ventas {

    private long precio;

    public Articulos_Ventas() {
    }

    public Articulos_Ventas(long precio) {
        this.precio = precio;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return null;
    }
}
