package Lab;


import java.awt.Color;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fernando Goti
 */
public class Contactos {

    private int codigo;
    private String nombre;
    private String Sexo;
    private Date fecha_nacimiento;
    private Color color;
    private String direccion;
    private String Hobbie1;
    private String Hobbie2;
    private String Hobbie3;
    private String Hobbie4;
    private String Hobbie5;

    public Contactos() {
    }

    public Contactos(int codigo, String nombre, String Sexo, Date fecha_nacimiento, Color color, String direccion, String Hobbie1, String Hobbie2, String Hobbie3, String Hobbie4, String Hobbie5) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.Sexo = Sexo;
        this.fecha_nacimiento = fecha_nacimiento;
        this.color = color;
        this.direccion = direccion;
        this.Hobbie1 = Hobbie1;
        this.Hobbie2 = Hobbie2;
        this.Hobbie3 = Hobbie3;
        this.Hobbie4 = Hobbie4;
        this.Hobbie5 = Hobbie5;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHobbie1() {
        return Hobbie1;
    }

    public void setHobbie1(String Hobbie1) {
        this.Hobbie1 = Hobbie1;
    }

    public String getHobbie2() {
        return Hobbie2;
    }

    public void setHobbie2(String Hobbie2) {
        this.Hobbie2 = Hobbie2;
    }

    public String getHobbie3() {
        return Hobbie3;
    }

    public void setHobbie3(String Hobbie3) {
        this.Hobbie3 = Hobbie3;
    }

    public String getHobbie4() {
        return Hobbie4;
    }

    public void setHobbie4(String Hobbie4) {
        this.Hobbie4 = Hobbie4;
    }

    public String getHobbie5() {
        return Hobbie5;
    }

    public void setHobbie5(String Hobbie5) {
        this.Hobbie5 = Hobbie5;
    }

    @Override
    public String toString() {
        return "Contactos{" + "nombre=" + nombre + '}';
    }

}
