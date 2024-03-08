
package lab8p2_diegorosales_juanlopez;

import java.io.Serializable;

public class User implements Serializable{
    protected String user, password;

    private static final long SerialVersionUID=777L;
    
    public User() {
    }

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUser() {
        return user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return user;
    }
    
}
