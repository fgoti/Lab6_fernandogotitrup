package Lab;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fernando Goti
 */
public class Baleadas extends Articulos_Ventas {

    private ArrayList ingredientes;

    public Baleadas() {
        super();
    }

    public Baleadas(ArrayList ingredientes, long precio) {
        super(precio);
        this.ingredientes = ingredientes;
    }

    public ArrayList getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return null;
    }
}
