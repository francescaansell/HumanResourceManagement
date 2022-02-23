/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.EmployeeList;
import view.HomePageUI;

/**
 * This class will
 * @author Group1HRM
 */
public class EmployeeListCntl {
    private EmployeeList employeeList = new EmployeeList();
    private HomePageUI homePageUI;
    private EmployeeCntl employeeCntl;
    
    /**
     * 
     * @return 
     */
    public EmployeeList getEmployeeList(){
        return employeeList;
    }

    public EmployeeListCntl()
    {
        
    }
    
    public void showListUI(){
        
    }
    
    /*
    public void showDetailUI(int selectedRow){
        animalCntl = new AnimalCntl(this, selectedRow);
    }
    


    public AnimalTableModel getAnimalTableModel()
    {
        return animalTableModel;
    }

    public void setAnimalTableModel(AnimalTableModel animalTableModel)
    {
        this.animalTableModel = animalTableModel;
    }
*/


    
}
