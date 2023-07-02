/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mensualidad.modelo;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author odali
 */
public class Estudiante {
    private String idEstudiante;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String grado;
    private Integer numeroCuota;

    public Estudiante (){
        this(null,null,null,null,null);
    }
    public Estudiante(String idEstudiante, String nombre, String apellidoPaterno, String apellidoMaterno, String grado) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.grado = grado;
        //Datos Tontos
        this.numeroCuota = 9;
    }
    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public Integer getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(Integer numeroCuota) {
        this.numeroCuota = numeroCuota;
    }
    // Propiedades de JavaFX
    public StringProperty idProperty() {
        return new SimpleStringProperty(idEstudiante); 
    }    
    
    public StringProperty nombreProperty(){
        return new SimpleStringProperty(nombre);        
    }
    
    public StringProperty apellidoPaternoProperty(){
        return new SimpleStringProperty(apellidoPaterno);
    }
    
    public StringProperty apellidoMaternoProperty(){
        return new SimpleStringProperty(apellidoMaterno);
    }
    
    public StringProperty gradoProperty(){
        return new SimpleStringProperty(grado);
    }
    
    public IntegerProperty numeroCuotaProperty(){
        return new SimpleIntegerProperty(numeroCuota);
    }
    
    
    
}
