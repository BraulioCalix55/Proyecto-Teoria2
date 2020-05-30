/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
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

    public PersonaConexion() {
       
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
    
    
    public void obtenerPersonas(JTable tabla){
        DefaultTableModel modelo= (DefaultTableModel)tabla.getModel();
        modelo.setNumRows(0);
        ArrayList<String> persona=new ArrayList();
        MongoClient mongoClient = MongoClients.create(
        "mongodb+srv://admin:Cuaderno2020@database-1-ubdcf.mongodb.net/ProyectoTBD2?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("ProyectoTBD2");
        try {
            MongoCollection<org.bson.Document> collection=database.getCollection("Personas");
            MongoCursor<org.bson.Document> cursor=collection.find().iterator();
            while(cursor.hasNext()){
                String principal="";
                String[] p;
                principal=cursor.next().toString();
                p=principal.split(",");
                for (int i = 0; i <p.length; i++) {
                    String f[]=p[i].split("=");
                    persona.add(f[1]);
                }
                Object[]row=new Object[persona.size()];
                for (int i = 0; i <persona.size(); i++) {
                    if(i==persona.size()-1){
                        row[i]=(persona.get(i)).substring(0, persona.get(i).length()-2);
                    }
                    else{
                        row[i]=persona.get(i);
                    }
                }
                persona.clear();
                modelo.addRow(row);
            }
            
            tabla.setModel(modelo);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    public Document obtenerPersona(Persona em){
        MongoClient mongoClient = MongoClients.create(
        "mongodb+srv://admin:Cuaderno2020@database-1-ubdcf.mongodb.net/ProyectoTBD2?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("ProyectoTBD2");
        Document r=new Document();
        
        try {
            MongoCollection<org.bson.Document> collection=database.getCollection("Personas");
            Document d=em.toDocumentName();
            FindIterable<Document> result=collection.find(d);
            r=result.first();
            if(r==null){
            }            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return r;
    }
    
    public void reemplazarPersona(Document viejo, Document nuevo){
        MongoClient mongoClient = MongoClients.create(
        "mongodb+srv://admin:Cuaderno2020@database-1-ubdcf.mongodb.net/ProyectoTBD2?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("ProyectoTBD2");
        try {
            MongoCollection<org.bson.Document> collection=database.getCollection("Personas");
            collection.replaceOne(viejo, nuevo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void eliminarPersona(Document viejo){
        MongoClient mongoClient = MongoClients.create(
        "mongodb+srv://admin:Cuaderno2020@database-1-ubdcf.mongodb.net/ProyectoTBD2?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("ProyectoTBD2");
        try {
            MongoCollection<org.bson.Document> collection=database.getCollection("Personas");
            collection.deleteOne(viejo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
