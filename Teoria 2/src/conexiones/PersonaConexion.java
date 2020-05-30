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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
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
    
}
