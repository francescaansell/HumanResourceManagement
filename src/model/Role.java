package model;

public class Role {
    public String rolename; 
    public String accessLevel; 

    public Role(String roleName, String accessLevel){
        rolename = this.rolename; 
        accessLevel = this.accessLevel;  
    }

    
    public String getRoleName() {
        return rolename;
    }

    public void setRoleName(String roleName) {
        this.rolename = rolename;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }

    @Override
    public String toString() {
        return "Role Name: " + this.rolename + " Access Groups: " + this.accessLevel;
    }

    
}
