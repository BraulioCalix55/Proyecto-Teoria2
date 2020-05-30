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
public class Solicitud {
    private String id,cif,nompersona,tipopuesto;

    public Solicitud(String id, String idempre, String nompersona, String tipopuesto) {
        this.id = id;
        this.cif = idempre;
        this.nompersona = nompersona;
        this.tipopuesto=tipopuesto;
    }

    public Solicitud(String id) {
        this.id = id;
    }
    
    

    public Solicitud() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String idempre) {
        this.cif = idempre;
    }

    public String getNompersona() {
        return nompersona;
    }

    public void setNompersona(String nompersona) {
        this.nompersona = nompersona;
    }

    public String getTipopuesto() {
        return tipopuesto;
    }

    public void setTipopuesto(String tipopuesto) {
        this.tipopuesto = tipopuesto;
    }

    public Document toDocument(){
        Document d=new Document();
        d.append("ID Solicitud", this.id)
        .append("CIF", this.cif)
        .append("Nombre de la persona", this.nompersona)
        .append("Tipo de puesto", this.tipopuesto);
        
        return d;
    }
    
    public Document toDocumentName(){
        Document d=new Document();
        d.append("ID Solicitud", this.id);
        return d;
    }

    
            
    
}
