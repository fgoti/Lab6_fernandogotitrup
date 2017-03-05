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
public class Empleado extends Personas {

    private String seccion_trabajo;
    private String hora_entrada;
    private String hora_salida;
    private long sueldo;
    private String estado;

    public Empleado() {
        super();
    }

    public Empleado(String seccion_trabajo, String hora_entrada, String hora_salida, long sueldo, String estado, int edad, long id, String Nacionalidad, String Lugar_nacimiento, String Nombre, DefaultTreeModel arbol_genealogico, Color color_piel, ArrayList<Familiares> familiares) {
        super(edad, id, Nacionalidad, Lugar_nacimiento, Nombre, arbol_genealogico, color_piel, familiares);
        this.seccion_trabajo = seccion_trabajo;
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
        this.sueldo = sueldo;
        this.estado = estado;
    }

    Empleado(String seccion_trabajo, String hora_entrada, String hora_salida, long sueldo, String estado, int edad, long id, String Nacionalidad, String Lugar_nacimiento, String Nombre, Color color_piel) {
        this.seccion_trabajo = seccion_trabajo;
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
        this.sueldo = sueldo;
        this.estado = estado;
    }

    public String getSeccion_trabajo() {
        return seccion_trabajo;
    }

    public void setSeccion_trabajo(String seccion_trabajo) {
        this.seccion_trabajo = seccion_trabajo;
    }

    public String getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(String hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public long getSueldo() {
        return sueldo;
    }

    public void setSueldo(long sueldo) {
        this.sueldo = sueldo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
}
