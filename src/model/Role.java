package model;
import java.io.Serializable;

public class Role implements Serializable{
    public String roleName; 
    public Integer accessLevel; 

    public Role(String roleName, Integer accessLevel){
     
        this.roleName = roleName;
        this.accessLevel = accessLevel;
    }

    public Role(){
        this.roleName = "role name";
        this.accessLevel = 5;
    }
    
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Role Name: " + this.roleName + " Access Groups: " + this.accessLevel; 
 
    }    
}
