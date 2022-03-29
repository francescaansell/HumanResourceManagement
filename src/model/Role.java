package model;

public class Role {
    public String rolename; 
    public int roleID; 
    public String[] roleOptions; 

    public Role(String rolename, int roleID, String[] roleOptions){
        rolename = this.rolename; 
        roleID = this.roleID; 
        roleOptions = this.roleOptions; 
    }

    public int getRoleID() {
        return roleID;
    }
    public String[] getRoleOptions() {
        return roleOptions;
    }
    public String getRolename() {
        return rolename;
    }
    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }
    public void setRoleOptions(String[] roleOptions) {
        this.roleOptions = roleOptions;
    }
    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
    @Override
    public String toString() {
        return "Role Name: " + this.rolename + " RoleID: " + this.roleID + " RoleOptions: " + this.roleOptions;
    }

    
}
