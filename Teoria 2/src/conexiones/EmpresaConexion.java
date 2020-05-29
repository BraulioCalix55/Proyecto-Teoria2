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
import principal.Empresa;

/**
 *
 * @author David
 */
public class EmpresaConexion {
    Empresa empresa;

    public EmpresaConexion(Empresa empresa) {
        this.empresa=empresa;
    }
    
    public void crearEmpresa(){
        MongoClient mongoClient = MongoClients.create(
        "mongodb+srv://admin:Cuaderno2020@database-1-ubdcf.mongodb.net/ProyectoTBD2?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("ProyectoTBD2");
        try {
            MongoCollection<org.bson.Document> collection=database.getCollection("Empresas");
            collection.insertOne(empresa.toDocument());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
}
