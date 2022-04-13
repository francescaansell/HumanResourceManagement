package view;
import java.awt.Dimension;
import controller.*;
import javax.swing.*;
public class OnboardEmployeeUI extends JFrame{

    private JLabel chooseEmployee;
    private JButton retrievePendingBtn; 
    private JTextField chooseEmployeeField; 
    private JLabel firstName;
    private JTextField firstNameField;
    private JLabel lastName;
    private JTextField lastNameField;
    private JLabel id;
    private JTextField idField;
    private JButton approveBtn; 
    private JTextField roleField; 
    private JButton backBtn; 
    private JLabel role; 
    private JLabel department; 
    private JTextField departmentField; 
    private JLabel payscale; 
    private JTextField payscaleField; 
    private JLabel chooseEmployeeID; 
    private JTextField chooseEmployeeIDField; 

    public OnboardEmployeeUI(OnboardCntl onboardCntl){
        
        retrievePendingBtn = new JButton("Get Employee"); 
        chooseEmployee = new JLabel ("Enter an employees last name to search for their pending account");
        chooseEmployeeField = new JTextField(); 
        chooseEmployeeID = new JLabel("Enter Employee ID"); 
        chooseEmployeeIDField = new JTextField(); 

        firstName = new JLabel ("First Name:");
        firstNameField = new JTextField (5);
        lastName = new JLabel ("Last Name:");
        lastNameField = new JTextField (5);
        id = new JLabel ("Employee ID:");
        idField = new JTextField (5);
        approveBtn = new JButton ("Approve"); 
        role = new JLabel ("Role:"); 
        roleField = new JTextField(); 
        backBtn = new JButton("Back"); 
        department = new JLabel("Department:");
        departmentField = new JTextField(5); 
        payscale = new JLabel("PayScale:"); 
        payscaleField = new JTextField(5);


        //adjust size and set layout
        setPreferredSize (new Dimension (816, 589));
        setLayout (null);

        //add components
        add (chooseEmployee);
        add (retrievePendingBtn);
        add (chooseEmployeeField); 
        add (firstName);
        add (firstNameField);
        add (lastName);
        add (lastNameField);
        add (id);
        add (idField);
        add (approveBtn); 
        add (roleField); 
        add (backBtn); 
        add (role);
        add (department); 
        add (departmentField);
        add (payscale); 
        add (payscaleField);
        add (chooseEmployeeID); 
        add (chooseEmployeeIDField); 

       
        backBtn.setBounds(25, 5, 100, 50); ;

        chooseEmployee.setBounds (25, 120, 400, 30); 
        chooseEmployeeField.setBounds (25, 160, 200, 25);
        chooseEmployeeID.setBounds(25, 200, 400, 30); 
        chooseEmployeeIDField.setBounds(25, 240, 200, 25);

        retrievePendingBtn.setBounds (25, 300, 390, 30); 
        
        //Right Side of Screen
        firstName.setBounds (625, 40, 100, 25);
        firstNameField.setBounds (710, 40, 165, 20);

        lastName.setBounds (625, 80, 100, 25);
        lastNameField.setBounds (710, 80, 165, 20);

        id.setBounds (625, 120, 100, 25);
        idField.setBounds (710, 120, 165, 20);

        role.setBounds(625, 160, 100, 25);
        roleField.setBounds (710, 160, 165, 20);

        department.setBounds(625, 200, 100, 25);
        departmentField.setBounds(710, 200, 165, 20);

        payscale.setBounds(625, 240, 100, 25);
        payscaleField.setBounds(710, 240, 165, 20);

        approveBtn.setBounds (625, 300, 265, 30); 
        
    }


    //TODO change get Field to get String (.getText())
    public void setFirstNameField(String str){
        this.firstNameField.setText(str);
    }
    public JTextField getFirstNameField(){
        return firstNameField; 
    }
    public void setLastNameField(String str){
        this.lastNameField.setText(str);
    }
    public JTextField getLastNameField(){
        return lastNameField; 
    }

    public void setEmployeeNameField(String str){
        this.chooseEmployeeField.setText(str); 
    }
    public String getEmployeeName(){
        return chooseEmployeeField.getText().trim(); 
    }
    public JTextField getRoleField(){
        return roleField; 
    }
    public void setRole(String str){
        this.roleField.setText(str);
    }

    public JButton getRetrievePendingButton(){
        return retrievePendingBtn; 
    }
    public JButton getApproveBtn(){
        return approveBtn; 
    }
    public JButton getBackBtn(){
        return backBtn;
    } 
    public JTextField getIDField(){
        return idField; 
    }
    public void setIDField(int i){
        this.idField.setText(""+ i); 
    }
    public String getPayScale(){
        return payscaleField.getText().trim(); 
    }
    public void setPayScale(String str){
        payscaleField.setText(str); 
    }
    public String getDepartment(){
        return departmentField.getText().trim();
    }
    public void setDepartmentField(String department){
        this.departmentField.setText(department);
    }
    public Integer getChooseEmployeeID(){
        return Integer.parseInt(chooseEmployeeIDField.getText().trim());
    }
    public void setChooseEmployeeID(Integer i){
        this.chooseEmployeeIDField.setText("" + i); 
    }
  
}

