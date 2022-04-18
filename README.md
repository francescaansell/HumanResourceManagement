Preset Logins (as of 4/18 git hub push): 
* username, password

Admins
* jah320, buddy123!

Supervisors
* fla568, ilovedogs7!
* ves824, coffeelover0!
* hannahk, 12345

Employees 
* guykane, netflix2!
* 


The scope of our project has changed after meeting with proffessor Vora. This is a breakdown of our specfied scope (i.e. what use cases we implemented)
Current Status and Capabilites : 

(1) Authentication 
* User cannot loging until approved by admin or supervisor 
* User can login once approved
* Can distinguish between supervisor and employee
* Ensures everyone has a unqiue ID
      * NOTE if you are testing the request an account feature you will need to view the terminal/output to see what number you are assigned. (This was discussed with Proffessor Vora)
* could/should be implemented 
  * ensuring proper passwords 
 
(2) Update Employee Information 
* Employees can update their own information (but only information that the backend system allows)

(3) Approved and Update Employees
* A supervisor can approve an employee 
* A supervisor can update information about an employee such as pay scale, id, supervisor, etc. 

(4) Manage Complaints (Supervisor)
* Can assign an supervsior to a complaint
* Can view complaints assigned to them 
* Can filter complaints based on types 
* To be implemented 
  * Enable supervisors to update information within the complaint (other than just supervsior)

(5) Create Complaint (Employee)
* Can create an complaint with description, those involved, date of occurance, and date submitted 
* to be implemented 
  * "View complaint status"
    * this will include being able to see who has been assigned and what action has/or will be taken 

Refactoring Changes 
1. Unused Imports
2. Unused Getters and Setters
3. Unclear Naming
4. Naming Convention Inconsistency: Controllers
5. Naming Convention Inconsistency: User vs. Employee
6. Naming Convention Inconsistency: Attributes
7. Inefficient Use of Get Methods
8. Inefficiently Utilizing ArrayList<Employee> Instead of Existing UserList Object 
9. Lack a method to calculate amount of PTO remaining
10. Using a for loop instead of a pipeline



 
