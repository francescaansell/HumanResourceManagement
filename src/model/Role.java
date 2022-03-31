package model;

import java.util.ArrayList;

public class Role{
    public String roleName; 
    public Integer accessLevel; 

    public Role(String roleName, Integer accessLevel){
     
        this.roleName = roleName;
        this.accessLevel = accessLevel;
    }

    public Role(){
        super();
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
        //super.toString will put all of the Employee class attributes, then manually added the Role classattributes
    }    
}
