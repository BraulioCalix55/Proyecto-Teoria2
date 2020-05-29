/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import principal.Persona;

/**
 *
 * @author David
 */
public class PersonaConexion {
    Persona persona;
    public PersonaConexion(Persona persona) {
        this.persona=persona;
    }
    
    
    public void crearPersona(){
        MongoClient mongoClient = MongoClients.create(
        "mongodb+srv://admin:Cuaderno2020@database-1-ubdcf.mongodb.net/ProyectoTBD2?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("ProyectoTBD2");
        try {
            MongoCollection<org.bson.Document> collection=database.getCollection("Personas");
            collection.insertOne(new org.bson.Document ("Nombre", persona.getNombre())
                    .append("Genero", persona.getGenero())
                    .append("Edad", persona.getEdad())
                    .append("Estado Civil", persona.getLegal())
                    .append("Hijos", persona.getHijos())
                    .append("Enfermedades Previas", persona.getEnfermedad())
                    .append("Titulo", persona.getTitulo())
                    .append("Indice", persona.getIndice())
                    .append("Años de Experiencia", persona.getAños())
                    .append("Tipo de Empleo", persona.getEmpleo())
                    .append("Contrato", persona.getContrato())
                    .append("Sueldo", persona.getSueldo()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
}
