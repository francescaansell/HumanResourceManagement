package model;

import java.util.ArrayList;

public class Role extends Employee{
    public String roleName; 
    public String accessLevel; 

    public Role(String firstName, String lastName, String userName, String pw, Department department, 
                int employeeID, int numLeaveDays, Boolean fullTime, ArrayList<TimeSheet> previousTimesheets, String roleName, String accessLevel){
        super(firstName, lastName, userName, pw, department, employeeID, numLeaveDays, previousTimesheets, fullTime);
        this.roleName = roleName;
        this.accessLevel = accessLevel;
    }

    public Role(){
        super();
        this.roleName = "role name";
        this.accessLevel = "green";
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
