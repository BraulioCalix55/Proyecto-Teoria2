/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import principal.Solicitud;

/**
 *
 * @author David
 */
public class SolicitudConexion {
    Solicitud solicitud;

    public SolicitudConexion(Solicitud solicitud) {
        this.solicitud = solicitud;
    }
    
    public void crearSolicitud(){
        MongoClient mongoClient = MongoClients.create(
        "mongodb+srv://admin:Cuaderno2020@database-1-ubdcf.mongodb.net/ProyectoTBD2?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("ProyectoTBD2");
        try {
            MongoCollection<org.bson.Document> collection=database.getCollection("Solicitudes");
            collection.insertOne(solicitud.toDocument());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
