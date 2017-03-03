package Lab;


import java.awt.Color;
import java.util.ArrayList;
import javax.swing.tree.DefaultTreeModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fernando Goti
 */
public class Cliente extends Personas {

    private int Ticket;
    private long dinero;
    private ArrayList<Orden> orden;

    public Cliente() {
        super();
    }

    public Cliente(int Ticket, long dinero, ArrayList<Orden> orden, int edad, long id, String Nacionalidad, String Lugar_nacimiento, String Nombre, DefaultTreeModel arbol_genealogico, Color color_piel, ArrayList<Familiares> familiares) {
        super(edad, id, Nacionalidad, Lugar_nacimiento, Nombre, arbol_genealogico, color_piel, familiares);
        this.Ticket = Ticket;
        this.dinero = dinero;
        this.orden = orden;
    }

    public int getTicket() {
        return Ticket;
    }

    public void setTicket(int Ticket) {
        this.Ticket = Ticket;
    }

    public long getDinero() {
        return dinero;
    }

    public void setDinero(long dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Orden> getOrden() {
        return orden;
    }

    public void setOrden(ArrayList<Orden> orden) {
        this.orden = orden;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }

}
