/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author User
 */
public class Plaza {
    private String promedio,sanitario,edad,genero,titulo,años;

    public Plaza() {
    }

    public Plaza(String promedio, String sanitario, String edad, String genero, String titulo, String años) {
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
    
}
