package pronostico;

import java.util.List;
import java.util.Optional;

public class Participante {
    String idparticipante;
    String nombre;
    Integer puntos;
    Integer acierto = 0;
    Integer jugada = 0;
    Integer extra = 0;

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public Participante(String id,String nombre) {
        this.idparticipante=id;
        this.nombre=nombre;
        this.puntos=0;
    }

   public String getIdparticipante() {
        return idparticipante;
    }

   /* public void setIdparticipante(String idparticipante) {
        this.idparticipante = idparticipante;
    }*/

 /*   public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
*/
    public void sumaPuntos(Integer puntos){
    	jugada ++;
    	if(puntos != 0) {
        	this.acierto ++;
        }
    	this.puntos=this.puntos+puntos;
    	puntosExtras(jugada, acierto);
    }
    
    // puntos extras por el acierto de todos los pronósticos
    public void puntosExtras(Integer jugada, Integer acierto) {
    	if(jugada == acierto) {
    		extra = 5;
    	}
    }

    // método de Nicolás
    /*@Override
    public String toString() {
        return "Participante{" +
                "idparticipante = '" + idparticipante + '\'' +
                ", nombre = '" + nombre + '\'' +
                ", puntos = " + puntos + 
                '}';
    }*/
    
    @Override
    public String toString() {
        return "Participante: " + nombre + 
        		", aciertos: " + acierto +
        		", puntos = " + puntos +
        		", en un total de: " + jugada + " apuestas. " +
        		"Puntos extras por acertar todas las apuestas: " + extra + " puntos";
    }
}
