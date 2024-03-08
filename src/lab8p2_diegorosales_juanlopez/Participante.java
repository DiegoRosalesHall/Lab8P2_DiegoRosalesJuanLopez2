/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_diegorosales_juanlopez;

import java.util.ArrayList;

/**
 *
 * @author jjlm1
 */
public class Participante extends User{
    protected ArrayList<Torneo>ganados=new ArrayList<>();
    protected ArrayList<Torneo>actuales=new ArrayList<>();

    public Participante() {
    }

    public Participante(String user, String password) {
        super(user, password);
    }
    

    public ArrayList<Torneo> getGanados() {
        return ganados;
    }

    public void setGanados(ArrayList<Torneo> ganados) {
        this.ganados = ganados;
    }

    public ArrayList<Torneo> getActuales() {
        return actuales;
    }

    public void setActuales(ArrayList<Torneo> actuales) {
        this.actuales = actuales;
    }

    @Override
    public String toString() {
        return super.toString();
    }
     
}
