/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_diegorosales_juanlopez;

/**
 *
 * @author jjlm1
 */
public class Admin extends User{
    protected int torneos;

    public Admin() {
    }

    public Admin(int torneos, String user, String password) {
        super(user, password);
        this.torneos = torneos;
    }

    public int getTorneos() {
        return torneos;
    }

    public void setTorneos(int torneos) {
        this.torneos = torneos;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
