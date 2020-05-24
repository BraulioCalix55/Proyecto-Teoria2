/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoria.pkg2;

/**
 *
 * @author User
 */
public class solicitud {
    private String id,idempre,nompersona,tipoemp;

    public solicitud(String id, String idempre, String nompersona, String tipoemp) {
        this.id = id;
        this.idempre = idempre;
        this.nompersona = nompersona;
        this.tipoemp = tipoemp;
    }

    public solicitud() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdempre() {
        return idempre;
    }

    public void setIdempre(String idempre) {
        this.idempre = idempre;
    }

    public String getNompersona() {
        return nompersona;
    }

    public void setNompersona(String nompersona) {
        this.nompersona = nompersona;
    }

    public String getTipoemp() {
        return tipoemp;
    }

    public void setTipoemp(String tipoemp) {
        this.tipoemp = tipoemp;
    }
    
            
    
}
