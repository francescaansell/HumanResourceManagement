Preset Logins (as of 4/13 git hub push): 
* username, password

Admins
* jenhod, 12345

Supervisors
* francescaansell, 12345
* vinces, 12345
* hannahk, 12345

Employees 
* guykane, 12345

Pending 
* josieansell, 12345

Current Status: 

(1) Authentication 
* User cannot loging until approved by admin or supervisor 
* User can login once approved
* Can distinguish between supervisor and employee
  * ensure everyone has a unqiue ID
* could/should be implemented 
  * ensuring unquie usernames 
  * ensuring proper usernames 
  * ensuring proper passwords 
  * request an account with an email and a name and then the SUPERVISOR creates the user name (auto generated using there name and random numbers)
 
(2) Update Employee Information 
* Employees can update their own information (but only information that the backend system allows)

(3) Approved and Update Employees
* A supervisor can approve an employee 
* A supervisor can update information about an employee such as pay scale, id, etc. 
* could/should be implemented 
  * using a email api to notify employees when they have been approved 
  * using a email api to notify employees when a change has been made by a supervisor 

(4) Manage Complaints (Supervisor)
* Can assign an supervsior to a complaint
* Can view complaints assigned to them 
* to be implemented 
  * update information within complaint such as approved 
  * use an email API to notify people

(5) Create Complaint (Employee)
* Can create an complaint with description, those involved, date of occurance, and date submitted 
* to be implemented 
  * view complaint status 
    * this will include being able to see who has been assigned and what action has/or will be taken 
  * possibly find a way to indentify those involed as employees within the system rather than just a string
  * add type attribute to complaint and allow supervisor to sort as such 

Other importants changes that need to be made: 
* change .equals() for employee to check against more than just the last name

****** Would rather make what we have really good instead of trying to half implement multiple things ************