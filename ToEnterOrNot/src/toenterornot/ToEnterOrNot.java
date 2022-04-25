/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package toenterornot;

//import statement goes here
import javax.swing.JOptionPane;
public class ToEnterOrNot
{

   
    public static void main(String[] args)
    {
        //declare variables 
        int age;
        final int male = 1;
        final int female =2;
        int gender;
        final int both=3;
        int party;
        int type;
        int totalPayMale;
        int totalPayFemale;
        int maleParty;
        int totalPriceMix;
        //display intro message 
        JOptionPane.showMessageDialog(null, "Welcome to the party!");
        //use parse so that the age an int can be displayed 
        age=Integer.parseInt(JOptionPane.showInputDialog("Please enter your age>>>>"));
        //use if and else to check age
        if(age<18)
        {
            JOptionPane.showMessageDialog(null, "Sorry you are too young and cannot enter:("); 
        }
            else if(age>35)
                {
                    JOptionPane.showMessageDialog(null, "You are too old to enter this party");
                }
        else 
         {
             JOptionPane.showMessageDialog(null, "Welcome to the party");
              gender = Integer.parseInt(JOptionPane.showInputDialog("Please indicate if you are a male or female by enterig either " + male + " for male or " + female + " for female"));
             if(gender <=1)
             {
               JOptionPane.showMessageDialog(null,"Please pay a fee of R10 to enter");
             }
             else
                     {
                        JOptionPane.showMessageDialog(null,"You have free entry!");
                     }
             party = Integer.parseInt(JOptionPane.showInputDialog("Are you attending the party alone or in a group? If you have a group please indicate the number of people(please note this figure excludes you)"));
             type = Integer.parseInt(JOptionPane.showInputDialog(null, "If you are attending with a group of people please indicate if they are all either male by entering 1, female by enter 2 or both by entering 3"));
             
                  if (type == 1)
                      
                  {
                      totalPayMale = party*10;
                      JOptionPane.showMessageDialog(null, "Your total price is:" + totalPayMale);
                  }
                  else if(type == 2) 
                          {
                              totalPayFemale=0;
                              JOptionPane.showMessageDialog(null, "Your total price is:" + totalPayFemale);
                          }
                  else
                  {
                      maleParty = Integer.parseInt(JOptionPane.showInputDialog("Please indicate how many in the group are male"));
                      totalPriceMix=maleParty*10;
                      JOptionPane.showMessageDialog(null, "Your total price is:" + totalPriceMix + " as all male guests must pay R10");
                  }
             
         }
        
        
        
    }
    
}
