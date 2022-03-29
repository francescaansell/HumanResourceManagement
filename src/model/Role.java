package model;

public class Role extends Employee{
    public String roleName; 
    public String accessLevel; 

    public Role(String firstName, String lastName, String userName, String pw, String department, int employeeID, int numLeaveDays, Boolean fullTime, String roleName, String accessLevel){
        super(firstName, lastName, userName, pw, department, employeeID, numLeaveDays, fullTime);
        this.roleName = roleName;
        this.accessLevel = accessLevel;
    }

    public Role(String roleName, String accessLevel){
        roleName = this.roleName; 
        accessLevel = this.accessLevel;  
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Role Name: " + this.roleName + " Access Groups: " + this.accessLevel; 
        //super.toString will put all of the Employee class attributes, then manually added the Role classattributes
    }    
}
