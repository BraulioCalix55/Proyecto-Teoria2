/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import org.bson.Document;

/**
 *
 * @author User
 */
public class Plaza {
    private String empresa, promedio,sanitario,edad,genero,titulo,años;

    public Plaza() {
    }

    public Plaza(String empresa) {
        this.empresa = empresa;
    }
    
    

    public Plaza(String empresa,String promedio, String sanitario, String edad, String genero, String titulo, String años) {
        this.empresa=empresa;
        this.promedio = promedio;
        this.sanitario = sanitario;
        this.edad = edad;
        this.genero = genero;
        this.titulo = titulo;
        this.años = años;
    }

    public String getPromedio() {
        return promedio;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }

    public String getSanitario() {
        return sanitario;
    }

    public void setSanitario(String sanitario) {
        this.sanitario = sanitario;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAños() {
        return años;
    }

    public void setAños(String años) {
        this.años = años;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    
    
    public Document toDocument(){
        Document d=new Document();
        d.append("Empresa ", this.empresa)
        .append("Requisito de promedio ", this.promedio)
        .append("Requisito sanitario ", this.sanitario)
        .append("Requisito de edad ", this.edad)
        .append("Requisito de genero ", this.genero)
        .append("Requisito de titulo ", this.titulo)
        .append("Requisito de años de experiencia ", this.años);
        return d;
    }
    
    public Document toDocumentName(){
        Document d=new Document();
        d.append("Empresa ", this.empresa);
        return d;
    }
    
}
