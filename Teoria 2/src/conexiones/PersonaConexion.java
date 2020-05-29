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
import java.util.ArrayList;
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
            collection.insertOne(persona.toDocument());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public ArrayList obtenerPersonas(){
        ArrayList<String> personas=new ArrayList();
        MongoClient mongoClient = MongoClients.create(
        "mongodb+srv://admin:Cuaderno2020@database-1-ubdcf.mongodb.net/ProyectoTBD2?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("ProyectoTBD2");
        try {
            MongoCollection<org.bson.Document> collection=database.getCollection("Proyecto");
            MongoCursor<org.bson.Document> cursor=collection.find().iterator();
            Persona p=new Persona();
            String id="", 
            genero="",
            nombre="",
            edad="",
            legal="",
            hijos="",
            enfermedad="",
            antecedentes="",
            titulo="",
            indice="",
            años="",
            empleo="",
            contrato="",
            sueldo="";
            
            while(cursor.hasNext()){
                String principal="", principal1="";
                principal=cursor.next().toString();
                
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        
        
        return personas;
    }
    
}
