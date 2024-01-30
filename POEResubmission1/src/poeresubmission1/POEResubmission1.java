/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poeresubmission1;

import javax.swing.JOptionPane; 

public class POEResubmission1 {

public static String showReport;
public static  String Username;    
public static String password;
public static String passwordInput;
public static String usernameInput;
public static String firstname;
public static String lastname;
public static String registerUser;
public static String checkUsername;
public static String logInUser;
public static String returnLogInStatus;
public static String checkPasswordComplexity;
public static String taskNumber;
public static String taskName;
public static String  taskDuration;
public static String developerDetails;
public static String taskStatus;
public static String taskDescription;
public static String numberOfTasks;
 
public static String taskDescription2;
public static String taskStatus2;
public static String taskNumber2;
public static String taskName2;
public static String  taskDuration2;
public static String developerDetails2;
public static String taskDescription3;
public static String taskStatus3;
public static String taskNumber3;
public static String taskName3;
public static String  taskDuration3;
public static String developerDetails3;
public static String taskDescription4;
public static String taskStatus4;
public static String taskNumber4;
public static String taskName4;
public static String  taskDuration4;
public static String developerDetails4;
public static String searchTask;
public static String taskName1; 
public static String taskOne;
public static String task2;
public static String task3;
public static String Task4;
public static String searchTaskDeveloper;
 
 
        
         
 public static void main(String[] args) {
 
    
  //Scanner input = new Scanner(System.in);
       JOptionPane.showMessageDialog(null,"Register User");
        //System.out.println("Register");
        JOptionPane.showMessageDialog(null, "\n1.username must not be longer than 5 chracters" + "\n2.must contain a underscore");
        JOptionPane.showInputDialog("Enter username");
      
      JOptionPane.showMessageDialog(null,"username caputred successfully");
        
    
      
        JOptionPane.showMessageDialog(null,"\n1.password must be at least 8 characters long"
                + "\n2. contain a capital letter " + "\n3. contain a number" + "\n4.contain a special character");
        JOptionPane.showInputDialog("Enter password");
      
       
        {
            JOptionPane.showMessageDialog(null," password caputred successfully");
            
        }
          firstname = JOptionPane.showInputDialog(null,"Please enter your firstname");
       
  
          JOptionPane.showInputDialog(null,"Please enter your lastname");
       
        JOptionPane.showMessageDialog(null,"Login: ");    
          JOptionPane.showInputDialog(null,"Please enter your username");
       
          
        { 
            JOptionPane.showMessageDialog(null,"Username captured successfully");
        
       
        
          JOptionPane.showInputDialog(null,"Please enter your password");
     
        
        {
          
            
        }
           JOptionPane.showMessageDialog(null,"Login successful" );
           JOptionPane.showMessageDialog(null,"welcome" + " " + firstname + " " + "Its great to see you again.");
        
           JOptionPane.showMessageDialog(null,"welcome to EasyKanban" );
             //Display menu
             
             }
        int option1 = Integer.parseInt(JOptionPane.showInputDialog(null,"\n.Please select a option down below :" + "\n1.Add tasks" + "\n2.show report" + "\n3.quit application")); 
        
        if (option1 ==1){
           
        int option2 =Integer.parseInt(JOptionPane.showInputDialog("enter Number Of Tasks to added" + "\n1. 1" + "\n2. 2" + "\n3. 3" + "\n4.4"));
           int option3 = 0;
      
         if (option2 ==2)  {
             JOptionPane.showMessageDialog(null, "task 1:");
             
        taskName = JOptionPane.showInputDialog("Enter a name for the task");
        taskDescription = JOptionPane.showInputDialog(" Enter developer details");
        developerDetails = JOptionPane.showInputDialog("Enter task description ");
        taskDuration =  JOptionPane.showInputDialog("Enter duration");
        taskStatus =  JOptionPane.showInputDialog("\n.Select a task status" + "\n1.to do" + "\n2.doing" + "\n3.done");
     
        JOptionPane.showMessageDialog(null, "task 2:");
         
         taskName2 = JOptionPane.showInputDialog("Enter a name for the task");
         taskDescription2 = JOptionPane.showInputDialog("Enter developer details ");
         developerDetails2 = JOptionPane.showInputDialog("Enter task description");
        taskDuration2 =  JOptionPane.showInputDialog("Enter developer details Enter duration");
        taskStatus2 =  JOptionPane.showInputDialog("\n.Select a Task Status" + "\n1.to do" + "\n2.doing" + "\n3.done");
        }else if (option2 == 3){
            
            JOptionPane.showMessageDialog(null, "task 1:");
            
        taskName = JOptionPane.showInputDialog("Enter a name for the task");
        taskDescription = JOptionPane.showInputDialog("Enter developer details");
        developerDetails = JOptionPane.showInputDialog("Enter task description ");
        taskDuration =  JOptionPane.showInputDialog("Enter duration");
        taskStatus =  JOptionPane.showInputDialog("\n.Select a Task Status" + "\n1.to do" + "\n2.doing" + "\n3.done");
     
        JOptionPane.showMessageDialog(null, "task 2:");
         
        taskName2 = JOptionPane.showInputDialog("Enter a name for the task");
        taskDescription2 = JOptionPane.showInputDialog("Enter developer details");
        developerDetails2 = JOptionPane.showInputDialog("Enter task description");
        taskDuration2 =  JOptionPane.showInputDialog("Enter duration");
        taskStatus2 =  JOptionPane.showInputDialog("\n.Select a task status" + "\n1.to do" + "\n2.doing" + "\n3.done");
        
        JOptionPane.showMessageDialog(null, "task 3:");
        
        taskName3 = JOptionPane.showInputDialog("Enter a name for the task");
        taskDescription3 = JOptionPane.showInputDialog("Enter developer details");
        developerDetails3 = JOptionPane.showInputDialog("Enter task description");
        taskDuration3 = JOptionPane.showInputDialog("Enter duration");
        taskStatus3 = JOptionPane.showInputDialog("\n.Select a task status" + "\n1.to do" + "\n2.doing" + "\n3.done");
        }else if (option2 ==4){
            
            JOptionPane.showMessageDialog(null, "task 1:");
          
         taskName = JOptionPane.showInputDialog("Enter a name for the task.");
         taskDescription = JOptionPane.showInputDialog("Enter developer details.");
         developerDetails = JOptionPane.showInputDialog("Enter task description.");
        taskDuration =  JOptionPane.showInputDialog("Enter duration. ");
        taskStatus =  JOptionPane.showInputDialog("\n.Select a task status" + "\n1.to do" + "\n2.doing" + "\n3.done");
     
        JOptionPane.showMessageDialog(null, "task 2:");
        
         taskName2 = JOptionPane.showInputDialog("Enter a name for the task");
         taskDescription2 = JOptionPane.showInputDialog("Enter developer details");
         developerDetails2 = JOptionPane.showInputDialog("Enter task description");
        taskDuration2 =  JOptionPane.showInputDialog("Enter duration ");
        taskStatus2 =  JOptionPane.showInputDialog("\n.Select a task status" + "\n1.to do" + "\n2.doing" + "\n3.done");
        
        JOptionPane.showMessageDialog(null, "task 3:");
        
        taskName3 = JOptionPane.showInputDialog("Enter a name for the task");
        taskDescription3 = JOptionPane.showInputDialog("Enter developer details");
        developerDetails3 = JOptionPane.showInputDialog("Enter task description");
        taskDuration3 = JOptionPane.showInputDialog("Enter duration of which task should run");
        taskStatus3 = JOptionPane.showInputDialog("\n.Select a task status" + "\n1.to do" + "\n2.doing" + "\n3.done");
       
        JOptionPane.showMessageDialog(null, "task 4:");
        
        taskName4 = JOptionPane.showInputDialog("Enter a name for the task");
        taskDescription4 = JOptionPane.showInputDialog("Enter developer details   ");
        developerDetails4 = JOptionPane.showInputDialog("Enter task description");
        taskDuration4 = JOptionPane.showInputDialog("Enter duration of which task should run");
        taskStatus4 = JOptionPane.showInputDialog("\n.Select a task status" + "\n1.to do" + "\n2.doing" + "\n3.done");
       
        }
                   else if (option3 == 4){
                       
                   }
                   
               }
        }


 
    }

    
    

