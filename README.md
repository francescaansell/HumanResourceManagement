### Preset Logins (as of 4/19 git hub push): 
* username, password

Admins
* jah320, Buddy123!

Supervisors
* fla568, Ilovedogs7!
* ves824, Coffeelover0!
* hah920, Psustudent22!

Employees 
* guykane, Netflix2!

Pending Accounts 
* bet114, Goldengirls1!
* wad364, MickeyMouse1!

### IMPORTANT NOTES
Our project was completed in VS code. 
If you are having trouble running our program you may need to add the JAR file to your reference library in VS code. It should however run without any changes. 
If you are testing the request an account feature you will need to view the terminal/output to see what number you are assigned. (This was discussed with Proffessor Vora)

### Current Status and Capabilites : 

The scope of our project has changed after meeting with proffessor Vora. This is a breakdown of our specfied scope (i.e. what use cases we implemented) The bolded headings are those in which where focused on for the assignment due on 4/20. 


(1) Authentication 
* User cannot loging until approved by admin or supervisor 
* User can login once approved
* Can distinguish between supervisor and employee
* Ensures everyone has a unqiue ID
* Will be implemented in later iterations
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
* Supervisors can update information within the complaint (such as involved, description, date, etc.)
* Will be implemented in later interations 
  * Close Complaint
  * View open complaints, closed complaints, or both

(5) Create Complaint (Employee)
* Can create an complaint with description, those involved, date of occurance, and date submitted 
* Complaints are stored and able to be acsessed later in an organized way 
* Will be implemented in later iterations
  * requiring nessisary fields to be completed before submitting complaint

 (6) View complaint status (Employee)
 * This includes being able to see who has been assigned and what action has/or will be taken 
  

### Refactoring Changes 
1. Unused Imports
2. Unused Getters and Setters
3. Unclear Naming
4. Naming Convention Inconsistency: Controllers
5. Naming Convention Inconsistency: User vs. Employee
6. Naming Convention Inconsistency: Attributes
7. Inefficient Use of Get Methods
8. Inefficiently Utilizing ArrayList<Employee> Instead of Existing UserList Object 
9. Lack a method to calculate amount of PTO remaining
Was not implemented because this use case has been removed from scope. 
10. Using a for loop instead of a pipeline



 
