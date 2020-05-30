/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author User
 */
public class Persona {
private String id,genero,nombre,edad,legal,hijos,enfermedad,antecedentes,titulo,indice,años,empleo,contrato,sueldo;
    
public Persona() {
    
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    

    public Persona(String id, String genero, String nombre, String edad, String legal, String hijos, String enfermedad, String antecedentes, String titulo, String indice, String años, String empleo, String contrato, String sueldo) {
        this.id = id;
        this.genero = genero;
        this.nombre = nombre;
        this.edad = edad;
        this.legal = legal;
        this.hijos = hijos;
        this.enfermedad = enfermedad;
        this.antecedentes = antecedentes;
        this.titulo = titulo;
        this.indice = indice;
        this.años = años;
        this.empleo = empleo;
        this.contrato = contrato;
        this.sueldo = sueldo;
    }

    public Persona(String genero, String nombre, String edad, String legal, String enfermedad, String antecedentes, String titulo, String indice, String años, String empleo, String contrato, String sueldo) {
        this.genero = genero;
        this.nombre = nombre;
        this.edad = edad;
        this.legal = legal;
        this.enfermedad = enfermedad;
        this.antecedentes = antecedentes;
        this.titulo = titulo;
        this.indice = indice;
        this.años = años;
        this.empleo = empleo;
        this.contrato = contrato;
        this.sueldo = sueldo;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getLegal() {
        return legal;
    }

    public void setLegal(String legal) {
        this.legal = legal;
    }

    public String getHijos() {
        return hijos;
    }

    public void setHijos(String hijos) {
        this.hijos = hijos;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIndice() {
        return indice;
    }

    public void setIndice(String indice) {
        this.indice = indice;
    }

    public String getAños() {
        return años;
    }

    public void setAños(String años) {
        this.años = años;
    }

    public String getEmpleo() {
        return empleo;
    }

    public void setEmpleo(String empleo) {
        this.empleo = empleo;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }
    
    public Document toDocument(){
        
        Document d=new Document();
        d.append("Nombre", this.nombre)
        .append("Genero", this.genero)
        .append("Edad", this.edad)
        .append("Estado legal", this.legal)
        .append("Enfermedades previas", this.enfermedad)
        .append("Antecedentes", this.antecedentes)
        .append("Titulo", this.titulo)
        .append("Indice", this.indice)
        .append("Años", this.años)
        .append("Tipo Empleo", this.empleo)
        .append("Tipo Contrato", this.contrato)
        .append("Sueldo", this.sueldo);
        return d;
    }
    public Document toDocumentName(){
        Document d=new Document();
        d.append("Nombre", this.nombre);
        return d;
    }
    
}
