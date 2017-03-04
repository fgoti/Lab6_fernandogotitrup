package Lab;


import java.awt.Color;
import java.util.ArrayList;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
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
public class Personas {

    private int edad;
    private long id;
    private String Nacionalidad;
    private String Lugar_nacimiento;
    private String Nombre;
    private DefaultTreeModel arbol_genealogico;
    private Color color_piel;
    private ArrayList<Familiares> familiares;

    public Personas() {
    }

    public Personas(int edad, long id, String Nacionalidad, String Lugar_nacimiento, String Nombre, DefaultTreeModel arbol_genealogico, Color color_piel, ArrayList<Familiares> familiares) {
        this.edad = edad;
        this.id = id;
        this.Nacionalidad = Nacionalidad;
        this.Lugar_nacimiento = Lugar_nacimiento;
        this.Nombre = Nombre;
        this.arbol_genealogico = arbol_genealogico;
        this.color_piel = color_piel;
        this.familiares = familiares;
    }

    Personas(Integer integer, long parseLong, String text, String text0, String text1, Color background) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public String getLugar_nacimiento() {
        return Lugar_nacimiento;
    }

    public void setLugar_nacimiento(String Lugar_nacimiento) {
        this.Lugar_nacimiento = Lugar_nacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public DefaultTreeModel getArbol_genealogico() {
        return arbol_genealogico;
    }

    public void setArbol_genealogico(DefaultTreeModel arbol_genealogico) {
        this.arbol_genealogico = arbol_genealogico;
    }

    public Color getColor_piel() {
        return color_piel;
    }

    public void setColor_piel(Color color_piel) {
        this.color_piel = color_piel;
    }

    public ArrayList<Familiares> getFamiliares() {
        return familiares;
    }

    public void setFamiliares(ArrayList<Familiares> familiares) {
        this.familiares = familiares;
    }

    @Override
    public String toString() {
        return Nombre;
    }

}
