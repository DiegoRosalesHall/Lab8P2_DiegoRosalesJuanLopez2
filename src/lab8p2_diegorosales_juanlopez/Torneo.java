/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_diegorosales_juanlopez;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jjlm1
 */
public class Torneo implements Serializable{
    protected String nombre;
    protected ArrayList<Participante>participantes=new ArrayList<>();
    protected boolean flag_abierto;
    protected boolean flag_terminado;
    protected Participante ganador;

    private static final long SerialVersionUID=777L; 
    public Torneo() {
    }

    public Torneo(String nombre, boolean flag_abierto, boolean flag_terminado, Participante ganador) {
        this.nombre = nombre;
        this.flag_abierto = flag_abierto;
        this.flag_terminado = flag_terminado;
        this.ganador = ganador;
    }

    public Torneo(String nombre, boolean flag_abierto, boolean flag_terminado) {
        this.nombre = nombre;
        this.flag_abierto = flag_abierto;
        this.flag_terminado = flag_terminado;
    }

    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }

    public boolean isFlag_abierto() {
        return flag_abierto;
    }

    public void setFlag_abierto(boolean flag_abierto) {
        this.flag_abierto = flag_abierto;
    }

    public boolean isFlag_terminado() {
        return flag_terminado;
    }

    public void setFlag_terminado(boolean flag_terminado) {
        this.flag_terminado = flag_terminado;
    }

    public Participante getGanador() {
        return ganador;
    }

    public void setGanador(Participante ganador) {
        this.ganador = ganador;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
}
