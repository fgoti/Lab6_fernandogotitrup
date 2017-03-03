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
public class Familiares {

    private int edad;
    private long id;
    private String Nacionalidad;
    private String lugar_nacionalidad;
    private String nombre;
    private Color color_piel;
    private Personas familiares_padre;
    private ArrayList<Familiares> hijos;

    public Familiares() {
    }

    public Familiares(int edad, long id, String Nacionalidad, String lugar_nacionalidad, String nombre, Color color_piel, Personas familiares_padre, ArrayList<Familiares> hijos) {
        this.edad = edad;
        this.id = id;
        this.Nacionalidad = Nacionalidad;
        this.lugar_nacionalidad = lugar_nacionalidad;
        this.nombre = nombre;
        this.color_piel = color_piel;
        this.familiares_padre = familiares_padre;
        this.hijos = hijos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getLugar_nacionalidad() {
        return lugar_nacionalidad;
    }

    public void setLugar_nacionalidad(String lugar_nacionalidad) {
        this.lugar_nacionalidad = lugar_nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor_piel() {
        return color_piel;
    }

    public void setColor_piel(Color color_piel) {
        this.color_piel = color_piel;
    }

    public Personas getFamiliares_padre() {
        return familiares_padre;
    }

    public void setFamiliares_padre(Personas familiares_padre) {
        this.familiares_padre = familiares_padre;
    }

    public ArrayList<Familiares> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Familiares> hijos) {
        this.hijos = hijos;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
