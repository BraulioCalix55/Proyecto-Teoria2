/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import org.bson.Document;

/**
 *
 * @author David
 */
public class Empresa {
    String nombre;
    String CIF;
    String director;
    String direccion;

    public Empresa(String nombre, String CIF, String director, String direccion) {
        this.nombre = nombre;
        this.CIF = CIF;
        this.director = director;
        this.direccion = direccion;
    }

    public Empresa(String nombre) {
        this.nombre = nombre;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public Document toDocument(){
        Document d=new Document();
        d.append("Nombre de la empresa", this.nombre)
        .append("CIF", this.CIF)
        .append("Director", this.director)
        .append("Direccion", this.direccion);
        
        return d;
    }
    
    public Document toDocumentName(){
        Document d=new Document();
        d.append("Nombre de la empresa", this.nombre);
        return d;
    }
    
}
