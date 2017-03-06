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
public class Jefes extends Personas {

    private String seccion_trabajo;
    private ArrayList<Empleado> empleado;
    private int numero_empleadosAtendidos;
    private long ganancias;

    public Jefes() {
        super();
    }

    public Jefes(String seccion_trabajo, ArrayList<Empleado> empleado, int numero_empleadosAtendidos, long ganancias, int edad, long id, String Nacionalidad, String Lugar_nacimiento, String Nombre, DefaultTreeModel arbol_genealogico, Color color_piel, ArrayList<Familiares> familiares) {
        super(edad, id, Nacionalidad, Lugar_nacimiento, Nombre, arbol_genealogico, color_piel, familiares);
        this.seccion_trabajo = seccion_trabajo;
        this.empleado = empleado;
        this.numero_empleadosAtendidos = numero_empleadosAtendidos;
        this.ganancias = ganancias;
    }

    public String getSeccion_trabajo() {
        return seccion_trabajo;
    }

    public void setSeccion_trabajo(String seccion_trabajo) {
        this.seccion_trabajo = seccion_trabajo;
    }

    public ArrayList<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(ArrayList<Empleado> empleado) {
        this.empleado = empleado;
    }

    public int getNumero_empleadosAtendidos() {
        return numero_empleadosAtendidos;
    }

    public void setNumero_empleadosAtendidos(int numero_empleadosAtendidos) {
        this.numero_empleadosAtendidos = numero_empleadosAtendidos;
    }

    public long getGanancias() {
        return ganancias;
    }

    public void setGanancias(long ganancias) {
        this.ganancias = ganancias;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
}
