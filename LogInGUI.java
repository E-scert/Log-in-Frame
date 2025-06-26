/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logingui.ac.za.tut;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


/**
 *
 * @author JREscert
 */
public class LogInGUI extends JFrame{
    //panels 
    private JPanel usernamePnl;
    private JPanel passwordPnl;
    private JPanel headingPnl;
    private JPanel submitPnl;
    private JPanel mainPnl;
    private JPanel loginPnl;
    private JPanel usernameAndPasswordCombinedPnl;
    
    //labels 
    private JLabel usernameLbl;
    private JLabel passwordLbl;
    private JLabel headingLbl;
    private JLabel logingLbl;
    
    //textFields
    private JTextField usernameTxtFld;
    private JPasswordField passwordFld;
    
    //buttons 
    private JButton submitBtn;
    
    public LogInGUI(){
    setTitle("User LogIn Page");
    setSize(400,200);
    setResizable(true);
    setDefaultLookAndFeelDecorated(true);
    //setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    //create panels 
    usernamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
    passwordPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
    submitPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
    loginPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
    
    usernameAndPasswordCombinedPnl = new JPanel(new GridLayout(2,1,1,0));
    usernameAndPasswordCombinedPnl.setBorder(new TitledBorder(new LineBorder(null,0),"Login Details"));
    
    mainPnl = new JPanel(new BorderLayout());
    mainPnl.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
    
    //create labels
    headingLbl = new JLabel("Login Details");
    headingLbl.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
    
    usernameLbl = new JLabel("Username: ");
    passwordLbl = new JLabel("Password: ");
    
    //create fields
    
   usernameTxtFld = new JTextField(10);
   usernameTxtFld.setFocusable(true);
   usernameTxtFld.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
  
   passwordFld = new JPasswordField(10);
   passwordFld.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
   
   //buttons
   submitBtn = new JButton("Submit");
   
   
   //add components to respective panels
   usernamePnl.add(usernameLbl);
   usernamePnl.add(usernameTxtFld);
   passwordPnl.add(passwordLbl);
   passwordPnl.add(passwordFld);
   usernameAndPasswordCombinedPnl.add(usernamePnl);
   usernameAndPasswordCombinedPnl.add(passwordPnl);
   submitPnl.add(submitBtn);
   
    //mainPnl.add(headingPnl,BorderLayout.NORTH);
   mainPnl.add(usernameAndPasswordCombinedPnl,BorderLayout.CENTER);
   mainPnl.add(submitPnl,BorderLayout.SOUTH);

    
   add(mainPnl);
   
   
    
    setVisible(true);
    
    }
    
            
    
}
