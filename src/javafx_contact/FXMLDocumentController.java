
package javafx_contact;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {

    @FXML
    private Button refresh;

    @FXML
    private Button mc1;

    @FXML
    private Button mc2;

    @FXML
    private Button mc3;

    @FXML
    private Button mc4;

    @FXML
    private Button mc5;

    @FXML
    private Button mc6;

    @FXML
    private Button mc7;

    @FXML
    private Button mc8;

    @FXML
    private Button mc9;

    @FXML
    private Button mc10;

    @FXML
    private TextField sfname;

    @FXML
    private TextField slname;

    @FXML
    private TextField s1phn;

    @FXML
    private TextField s2phn;

    @FXML
    private TextField sadr;

    @FXML
    private TextField semail;

    @FXML
    private Button ec1;

    @FXML
    private Button ec2;

    @FXML
    private Button ec3;

    @FXML
    private Button ec4;

    @FXML
    private Button ec5;

    @FXML
    private Button ec6;

    @FXML
    private Button ec7;

    @FXML
    private Button ec8;

    @FXML
    private Button ec9;

    @FXML
    private Button ec10;

    @FXML
    private TextField efname;

    @FXML
    private TextField elname;

    @FXML
    private TextField e1phn;

    @FXML
    private TextField e2phn;

    @FXML
    private TextField eadr;

    @FXML
    private TextField eemail;
    
    @FXML
    private Label updatetxt;
    
    @FXML
    private Label refreshsuccess;

    @FXML
    private Button ws1;

    @FXML
    private Button ws2;

    @FXML
    private Button ws3;

    @FXML
    private Button ws4;

    @FXML
    private Button ws5;

    @FXML
    private Button ws6;

    @FXML
    private Button ws7;

    @FXML
    private TextArea dclass;

    @FXML
    private TextArea dtime;

    @FXML
    private TextArea dfac;

    @FXML
    private TextArea dqn;

    @FXML
    private Button update;

    @FXML
    private Button as1;

    @FXML
    private Button as2;

    @FXML
    private Button as3;

    @FXML
    private Button as4;

    @FXML
    private Button as5;

    @FXML
    private Button as6;

    @FXML
    private Button as7;

    @FXML
    private TextArea eclass;

    @FXML
    private TextArea etime;

    @FXML
    private TextArea efac;

    @FXML
    private TextArea eqn;
    
    @FXML
    private Label updateTxt2;
    
    @FXML
    private Label updatesuccess;
    
    @FXML
    private TextField cfield;

    @FXML
    private Button percent;

    @FXML
    private Button nine;

    @FXML
    private Button eight;

    @FXML
    private Button five;

    @FXML
    private Button clear;

    @FXML
    private Button four;

    @FXML
    private Button seven;

    @FXML
    private Button six;

    @FXML
    private Button mult;

    @FXML
    private Button divide;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button plus;

    @FXML
    private Button minus;

    @FXML
    private Button zero;

    @FXML
    private Button dot;

    @FXML
    private Button recipro;

    @FXML
    private Button sqrt;

    @FXML
    private Button equals;
    
    double data =0;
    int opr=-1;
    
    String tempfname="";
    String templname="";
    String tempphn1="";
    String tempphn2="";
    String tempadr="";
    String tempemail="";
    
    String Showfname [] = new String [100];
    String Showlname [] = new String [100];
    String Show1phn [] = new String [100];
    String Show2phn [] = new String [100];
    String Showadr [] = new String [100];
    String Showemail [] = new String [100];
    
    String tempclass="";
    String temptime="";
    String tempfac="";
    String tempqn="";
    
    String Showclass [] = new String [10];
    String Showtime [] = new String [10];
    String Showfac [] = new String [10];
    String Showqn [] = new String [10];
    
    @FXML
    void edit(ActionEvent event) throws FileNotFoundException {
        File fname1 = new File("fname1.txt");
        File lname1 = new File("lname1.txt");
        File phn1_1 = new File("phn1_1.txt");
        File phn2_1 = new File("phn2_1.txt");
        File adr1 = new File("adr1.txt");
        File email1 = new File("email1.txt");
        
        File fname2 = new File("fname2.txt");
        File lname2 = new File("lname2.txt");
        File phn1_2 = new File("phn1_2.txt");
        File phn2_2 = new File("phn2_2.txt");
        File adr2 = new File("adr2.txt");
        File email2 = new File("email2.txt");
        
        File fname3 = new File("fname3.txt");
        File lname3 = new File("lname3.txt");
        File phn1_3 = new File("phn1_3.txt");
        File phn2_3 = new File("phn2_3.txt");
        File adr3 = new File("adr3.txt");
        File email3 = new File("email3.txt");
        
        File fname4 = new File("fname4.txt");
        File lname4 = new File("lname4.txt");
        File phn1_4 = new File("phn1_4.txt");
        File phn2_4 = new File("phn2_4.txt");
        File adr4 = new File("adr4.txt");
        File email4 = new File("email4.txt");
        
        File fname5 = new File("fname5.txt");
        File lname5 = new File("lname5.txt");
        File phn1_5 = new File("phn1_5.txt");
        File phn2_5 = new File("phn2_5.txt");
        File adr5 = new File("adr5.txt");
        File email5 = new File("email5.txt");
        
        File fname6 = new File("fname6.txt");
        File lname6 = new File("lname6.txt");
        File phn1_6 = new File("phn1_6.txt");
        File phn2_6 = new File("phn2_6.txt");
        File adr6 = new File("adr6.txt");
        File email6 = new File("email6.txt");
        
        File fname7 = new File("fname7.txt");
        File lname7 = new File("lname7.txt");
        File phn1_7 = new File("phn1_7.txt");
        File phn2_7 = new File("phn2_7.txt");
        File adr7 = new File("adr7.txt");
        File email7 = new File("email7.txt");
        
        File fname8 = new File("fname8.txt");
        File lname8 = new File("lname8.txt");
        File phn1_8 = new File("phn1_8.txt");
        File phn2_8 = new File("phn2_8.txt");
        File adr8 = new File("adr8.txt");
        File email8 = new File("email8.txt");
        
        File fname9 = new File("fname9.txt");
        File lname9 = new File("lname9.txt");
        File phn1_9 = new File("phn1_9.txt");
        File phn2_9 = new File("phn2_9.txt");
        File adr9 = new File("adr9.txt");
        File email9 = new File("email9.txt");
        
        File fname10 = new File("fname10.txt");
        File lname10 = new File("lname10.txt");
        File phn1_10 = new File("phn1_10.txt");
        File phn2_10 = new File("phn2_10.txt");
        File adr10 = new File("adr10.txt");
        File email10 = new File("email10.txt");
        
        tempfname   =  efname.getText();
        templname   =  elname.getText();
        tempphn1    =   e1phn.getText();
        tempphn2    =   e2phn.getText();
        tempadr     =    eadr.getText();
        tempemail   =  eemail.getText();
        
         if (event.getSource() == ec1){
        PrintWriter pfname1 = new PrintWriter (fname1);
        PrintWriter plname1 = new PrintWriter (lname1);
        PrintWriter pphn1_1 = new PrintWriter (phn1_1);
        PrintWriter pphn2_1 = new PrintWriter (phn2_1);
        PrintWriter pAdr1 = new PrintWriter (adr1);
        PrintWriter pemail1 = new PrintWriter (email1);
        
        pfname1.println(tempfname);
        plname1.println(templname);
        pphn1_1.println(tempphn1);
        pphn2_1.println(tempphn2);
        pAdr1.println(tempadr);
        pemail1.println(tempemail);
        
        ec1.setText(tempfname);
        pfname1.close();
        plname1.close();
        pphn1_1.close();
        pphn2_1.close();
        pAdr1.close();
        pemail1.close();
        updatetxt.setText("Saved Successfully!");
        }
         
        else if (event.getSource() == ec2){
        PrintWriter pfname2 = new PrintWriter (fname2);
        PrintWriter plname2 = new PrintWriter (lname2);
        PrintWriter pphn1_2 = new PrintWriter (phn1_2);
        PrintWriter pphn2_2 = new PrintWriter (phn2_2);
        PrintWriter pAdr2 = new PrintWriter (adr2);
        PrintWriter pemail2 = new PrintWriter (email2);
        
        pfname2.println(tempfname);
        plname2.println(templname);
        pphn1_2.println(tempphn1);
        pphn2_2.println(tempphn2);
        pAdr2.println(tempadr);
        pemail2.println(tempemail);
        
        ec2.setText(tempfname);
        pfname2.close();
        plname2.close();
        pphn1_2.close();
        pphn2_2.close();
        pAdr2.close();
        pemail2.close();
        updatetxt.setText("Saved Successfully!");
        }
        else if (event.getSource() == ec3){
        PrintWriter pfname3 = new PrintWriter (fname3);
        PrintWriter plname3 = new PrintWriter (lname3);
        PrintWriter pphn1_3 = new PrintWriter (phn1_3);
        PrintWriter pphn2_3 = new PrintWriter (phn2_3);
        PrintWriter pAdr3 = new PrintWriter (adr3);
        PrintWriter pemail3 = new PrintWriter (email3);
        
        pfname3.println(tempfname);
        plname3.println(templname);
        pphn1_3.println(tempphn1);
        pphn2_3.println(tempphn2);
        pAdr3.println(tempadr);
        pemail3.println(tempemail);
        
        ec3.setText(tempfname);
        pfname3.close();
        plname3.close();
        pphn1_3.close();
        pphn2_3.close();
        pAdr3.close();
        pemail3.close();
        updatetxt.setText("Saved Successfully!");
        }
        else if (event.getSource() == ec4){
        PrintWriter pfname4 = new PrintWriter (fname4);
        PrintWriter plname4 = new PrintWriter (lname4);
        PrintWriter pphn1_4 = new PrintWriter (phn1_4);
        PrintWriter pphn2_4 = new PrintWriter (phn2_4);
        PrintWriter pAdr4 = new PrintWriter (adr4);
        PrintWriter pemail4 = new PrintWriter (email4);
        
        pfname4.println(tempfname);
        plname4.println(templname);
        pphn1_4.println(tempphn1);
        pphn2_4.println(tempphn2);
        pAdr4.println(tempadr);
        pemail4.println(tempemail);
        
        ec4.setText(tempfname);
        pfname4.close();
        plname4.close();
        pphn1_4.close();
        pphn2_4.close();
        pAdr4.close();
        pemail4.close();
        updatetxt.setText("Saved Successfully!");
        }
         
        else if (event.getSource() == ec5){
        PrintWriter pfname5 = new PrintWriter (fname5);
        PrintWriter plname5 = new PrintWriter (lname5);
        PrintWriter pphn1_5 = new PrintWriter (phn1_5);
        PrintWriter pphn2_5 = new PrintWriter (phn2_5);
        PrintWriter pAdr5 = new PrintWriter (adr5);
        PrintWriter pemail5 = new PrintWriter (email5);
        
        pfname5.println(tempfname);
        plname5.println(templname);
        pphn1_5.println(tempphn1);
        pphn2_5.println(tempphn2);
        pAdr5.println(tempadr);
        pemail5.println(tempemail);
        
        ec5.setText(tempfname);
        pfname5.close();
        plname5.close();
        pphn1_5.close();
        pphn2_5.close();
        pAdr5.close();
        pemail5.close();
        updatetxt.setText("Saved Successfully!");
        }
        
         else if (event.getSource() == ec6){
        PrintWriter pfname6 = new PrintWriter (fname6);
        PrintWriter plname6 = new PrintWriter (lname6);
        PrintWriter pphn1_6 = new PrintWriter (phn1_6);
        PrintWriter pphn2_6 = new PrintWriter (phn2_6);
        PrintWriter pAdr6 = new PrintWriter (adr6);
        PrintWriter pemail6 = new PrintWriter (email6);
        
        pfname6.println(tempfname);
        plname6.println(templname);
        pphn1_6.println(tempphn1);
        pphn2_6.println(tempphn2);
        pAdr6.println(tempadr);
        pemail6.println(tempemail);
        
        ec6.setText(tempfname);
        pfname6.close();
        plname6.close();
        pphn1_6.close();
        pphn2_6.close();
        pAdr6.close();
        pemail6.close();
        updatetxt.setText("Saved Successfully!");
        }
         
        else if (event.getSource() == ec7){
        PrintWriter pfname7 = new PrintWriter (fname7);
        PrintWriter plname7 = new PrintWriter (lname7);
        PrintWriter pphn1_7 = new PrintWriter (phn1_7);
        PrintWriter pphn2_7 = new PrintWriter (phn2_7);
        PrintWriter pAdr7 = new PrintWriter (adr7);
        PrintWriter pemail7 = new PrintWriter (email7);
        
        pfname7.println(tempfname);
        plname7.println(templname);
        pphn1_7.println(tempphn1);
        pphn2_7.println(tempphn2);
        pAdr7.println(tempadr);
        pemail7.println(tempemail);
        
        ec7.setText(tempfname);
        pfname7.close();
        plname7.close();
        pphn1_7.close();
        pphn2_7.close();
        pAdr7.close();
        pemail7.close();
        updatetxt.setText("Saved Successfully!");
        }
        
        else if (event.getSource() == ec8){
        PrintWriter pfname8 = new PrintWriter (fname8);
        PrintWriter plname8 = new PrintWriter (lname8);
        PrintWriter pphn1_8 = new PrintWriter (phn1_8);
        PrintWriter pphn2_8 = new PrintWriter (phn2_8);
        PrintWriter pAdr8 = new PrintWriter (adr8);
        PrintWriter pemail8 = new PrintWriter (email8);
        
        pfname8.println(tempfname);
        plname8.println(templname);
        pphn1_8.println(tempphn1);
        pphn2_8.println(tempphn2);
        pAdr8.println(tempadr);
        pemail8.println(tempemail);
        
        ec8.setText(tempfname);
        pfname8.close();
        plname8.close();
        pphn1_8.close();
        pphn2_8.close();
        pAdr8.close();
        pemail8.close();
        updatetxt.setText("Saved Successfully!");
        }
         
         else if (event.getSource() == ec9){
        PrintWriter pfname9 = new PrintWriter (fname9);
        PrintWriter plname9 = new PrintWriter (lname9);
        PrintWriter pphn1_9 = new PrintWriter (phn1_9);
        PrintWriter pphn2_9 = new PrintWriter (phn2_9);
        PrintWriter pAdr9 = new PrintWriter (adr9);
        PrintWriter pemail9 = new PrintWriter (email9);
        
        pfname9.println(tempfname);
        plname9.println(templname);
        pphn1_9.println(tempphn1);
        pphn2_9.println(tempphn2);
        pAdr9.println(tempadr);
        pemail9.println(tempemail);
        
        ec9.setText(tempfname);
        pfname9.close();
        plname9.close();
        pphn1_9.close();
        pphn2_9.close();
        pAdr9.close();
        pemail9.close();
        updatetxt.setText("Saved Successfully!");
        }
         
        else if (event.getSource() == ec10){
        PrintWriter pfname10 = new PrintWriter (fname10);
        PrintWriter plname10 = new PrintWriter (lname10);
        PrintWriter pphn1_10 = new PrintWriter (phn1_10);
        PrintWriter pphn2_10 = new PrintWriter (phn2_10);
        PrintWriter pAdr10 = new PrintWriter (adr10);
        PrintWriter pemail10 = new PrintWriter (email10);
        
        pfname10.println(tempfname);
        plname10.println(templname);
        pphn1_10.println(tempphn1);
        pphn2_10.println(tempphn2);
        pAdr10.println(tempadr);
        pemail10.println(tempemail);
        
        ec10.setText(tempfname);
        pfname10.close();
        plname10.close();
        pphn1_10.close();
        pphn2_10.close();
        pAdr10.close();
        pemail10.close();
        updatetxt.setText("Saved Successfully!");
        }
    }

    @FXML
    void show(ActionEvent event) throws FileNotFoundException {
        File fname1 = new File("fname1.txt");
        File lname1 = new File("lname1.txt");
        File phn1_1 = new File("phn1_1.txt");
        File phn2_1 = new File("phn2_1.txt");
        File adr1 = new File("adr1.txt");
        File email1 = new File("email1.txt");
        
        File fname2 = new File("fname2.txt");
        File lname2 = new File("lname2.txt");
        File phn1_2 = new File("phn1_2.txt");
        File phn2_2 = new File("phn2_2.txt");
        File adr2 = new File("adr2.txt");
        File email2 = new File("email2.txt");
        
        File fname3 = new File("fname3.txt");
        File lname3 = new File("lname3.txt");
        File phn1_3 = new File("phn1_3.txt");
        File phn2_3 = new File("phn2_3.txt");
        File adr3 = new File("adr3.txt");
        File email3 = new File("email3.txt");
        
        File fname4 = new File("fname4.txt");
        File lname4 = new File("lname4.txt");
        File phn1_4 = new File("phn1_4.txt");
        File phn2_4 = new File("phn2_4.txt");
        File adr4 = new File("adr4.txt");
        File email4 = new File("email4.txt");
        
        File fname5 = new File("fname5.txt");
        File lname5 = new File("lname5.txt");
        File phn1_5 = new File("phn1_5.txt");
        File phn2_5 = new File("phn2_5.txt");
        File adr5 = new File("adr5.txt");
        File email5 = new File("email5.txt");
        
        File fname6 = new File("fname6.txt");
        File lname6 = new File("lname6.txt");
        File phn1_6 = new File("phn1_6.txt");
        File phn2_6 = new File("phn2_6.txt");
        File adr6 = new File("adr6.txt");
        File email6 = new File("email6.txt");
        
        File fname7 = new File("fname7.txt");
        File lname7 = new File("lname7.txt");
        File phn1_7 = new File("phn1_7.txt");
        File phn2_7 = new File("phn2_7.txt");
        File adr7 = new File("adr7.txt");
        File email7 = new File("email7.txt");
        
        File fname8 = new File("fname8.txt");
        File lname8 = new File("lname8.txt");
        File phn1_8 = new File("phn1_8.txt");
        File phn2_8 = new File("phn2_8.txt");
        File adr8 = new File("adr8.txt");
        File email8 = new File("email8.txt");
        
        File fname9 = new File("fname9.txt");
        File lname9 = new File("lname9.txt");
        File phn1_9 = new File("phn1_9.txt");
        File phn2_9 = new File("phn2_9.txt");
        File adr9 = new File("adr9.txt");
        File email9 = new File("email9.txt");
        
        File fname10 = new File("fname10.txt");
        File lname10 = new File("lname10.txt");
        File phn1_10 = new File("phn1_10.txt");
        File phn2_10 = new File("phn2_10.txt");
        File adr10 = new File("adr10.txt");
        File email10 = new File("email10.txt");
        
        Scanner infname1 = new Scanner (fname1);
        Scanner inlname1 = new Scanner (lname1);
        Scanner inphn1_1 = new Scanner (phn1_1);
        Scanner inphn2_1 = new Scanner (phn2_1);
        Scanner inadr1 = new Scanner (adr1);
        Scanner inemail1 = new Scanner (email1);
        
        Scanner infname2 = new Scanner (fname2);
        Scanner inlname2 = new Scanner (lname2);
        Scanner inphn1_2 = new Scanner (phn1_2);
        Scanner inphn2_2 = new Scanner (phn2_2);
        Scanner inadr2 = new Scanner (adr2);
        Scanner inemail2 = new Scanner (email2);
        
        Scanner infname3 = new Scanner (fname3);
        Scanner inlname3 = new Scanner (lname3);
        Scanner inphn1_3 = new Scanner (phn1_3);
        Scanner inphn2_3 = new Scanner (phn2_3);
        Scanner inadr3 = new Scanner (adr3);
        Scanner inemail3 = new Scanner (email3);
        
        Scanner infname4 = new Scanner (fname4);
        Scanner inlname4 = new Scanner (lname4);
        Scanner inphn1_4 = new Scanner (phn1_4);
        Scanner inphn2_4 = new Scanner (phn2_4);
        Scanner inadr4 = new Scanner (adr4);
        Scanner inemail4 = new Scanner (email4);
        
        Scanner infname5 = new Scanner (fname5);
        Scanner inlname5 = new Scanner (lname5);
        Scanner inphn1_5 = new Scanner (phn1_5);
        Scanner inphn2_5 = new Scanner (phn2_5);
        Scanner inadr5 = new Scanner (adr5);
        Scanner inemail5 = new Scanner (email5);
        
        Scanner infname6 = new Scanner (fname6);
        Scanner inlname6 = new Scanner (lname6);
        Scanner inphn1_6 = new Scanner (phn1_6);
        Scanner inphn2_6 = new Scanner (phn2_6);
        Scanner inadr6 = new Scanner (adr6);
        Scanner inemail6 = new Scanner (email6);
        
        Scanner infname7 = new Scanner (fname7);
        Scanner inlname7 = new Scanner (lname7);
        Scanner inphn1_7 = new Scanner (phn1_7);
        Scanner inphn2_7 = new Scanner (phn2_7);
        Scanner inadr7 = new Scanner (adr7);
        Scanner inemail7 = new Scanner (email7);
        
        Scanner infname8 = new Scanner (fname8);
        Scanner inlname8 = new Scanner (lname8);
        Scanner inphn1_8 = new Scanner (phn1_8);
        Scanner inphn2_8 = new Scanner (phn2_8);
        Scanner inadr8 = new Scanner (adr8);
        Scanner inemail8 = new Scanner (email8);
        
        Scanner infname9 = new Scanner (fname9);
        Scanner inlname9 = new Scanner (lname9);
        Scanner inphn1_9 = new Scanner (phn1_9);
        Scanner inphn2_9 = new Scanner (phn2_9);
        Scanner inadr9 = new Scanner (adr9);
        Scanner inemail9 = new Scanner (email9);
        
        Scanner infname10 = new Scanner (fname10);
        Scanner inlname10 = new Scanner (lname10);
        Scanner inphn1_10 = new Scanner (phn1_10);
        Scanner inphn2_10 = new Scanner (phn2_10);
        Scanner inadr10 = new Scanner (adr10);
        Scanner inemail10 = new Scanner (email10);
        
        Showfname[1]    = infname1.nextLine();
        Showlname[1]    = inlname1.nextLine();
        Show1phn[1]     = inphn1_1.nextLine();
        Show2phn[1]     = inphn2_1.nextLine();
        Showadr[1]      = inadr1.nextLine();
        Showemail[1]    = inemail1.nextLine();
        
        Showfname[2]    = infname2.nextLine();
        Showlname[2]    = inlname2.nextLine();
        Show1phn[2]     = inphn1_2.nextLine();
        Show2phn[2]     = inphn2_2.nextLine();
        Showadr[2]      = inadr2.nextLine();
        Showemail[2]    = inemail2.nextLine();
        
        Showfname[3]    = infname3.nextLine();
        Showlname[3]    = inlname3.nextLine();
        Show1phn[3]     = inphn1_3.nextLine();
        Show2phn[3]     = inphn2_3.nextLine();
        Showadr[3]      = inadr3.nextLine();
        Showemail[3]    = inemail3.nextLine();
        
        Showfname[4]    = infname4.nextLine();
        Showlname[4]    = inlname4.nextLine();
        Show1phn[4]     = inphn1_4.nextLine();
        Show2phn[4]     = inphn2_4.nextLine();
        Showadr[4]      = inadr4.nextLine();
        Showemail[4]    = inemail4.nextLine();
        
        Showfname[5]    = infname5.nextLine();
        Showlname[5]    = inlname5.nextLine();
        Show1phn[5]     = inphn1_5.nextLine();
        Show2phn[5]     = inphn2_5.nextLine();
        Showadr[5]      = inadr5.nextLine();
        Showemail[5]    = inemail5.nextLine();
        
        Showfname[6]    = infname6.nextLine();
        Showlname[6]    = inlname6.nextLine();
        Show1phn[6]     = inphn1_6.nextLine();
        Show2phn[6]     = inphn2_6.nextLine();
        Showadr[6]      = inadr6.nextLine();
        Showemail[6]    = inemail6.nextLine();
        
        Showfname[7]    = infname7.nextLine();
        Showlname[7]    = inlname7.nextLine();
        Show1phn[7]     = inphn1_7.nextLine();
        Show2phn[7]     = inphn2_7.nextLine();
        Showadr[7]      = inadr7.nextLine();
        Showemail[7]    = inemail7.nextLine();
        
        Showfname[8]    = infname8.nextLine();
        Showlname[8]    = inlname8.nextLine();
        Show1phn[8]     = inphn1_8.nextLine();
        Show2phn[8]     = inphn2_8.nextLine();
        Showadr[8]      = inadr8.nextLine();
        Showemail[8]    = inemail8.nextLine();
        
        Showfname[9]    = infname9.nextLine();
        Showlname[9]    = inlname9.nextLine();
        Show1phn[9]     = inphn1_9.nextLine();
        Show2phn[9]     = inphn2_9.nextLine();
        Showadr[9]      = inadr9.nextLine();
        Showemail[9]    = inemail9.nextLine();
        
        Showfname[10]    = infname10.nextLine();
        Showlname[10]    = inlname10.nextLine();
        Show1phn[10]     = inphn1_10.nextLine();
        Show2phn[10]     = inphn2_10.nextLine();
        Showadr[10]      = inadr10.nextLine();
        Showemail[10]    = inemail10.nextLine();
        
        if (event.getSource() == mc1){
        sfname.setText(Showfname[1]);
        slname.setText(Showlname[1]);
        s1phn.setText(Show1phn[1]);
        s2phn.setText(Show2phn[1]);
        sadr.setText(Showadr[1]);
        semail.setText(Showemail[1]);
        }
        
        else if (event.getSource() == mc2){
        sfname.setText(Showfname[2]);
        slname.setText(Showlname[2]);
        s1phn.setText(Show1phn[2]);
        s2phn.setText(Show2phn[2]);
        sadr.setText(Showadr[2]);
        semail.setText(Showemail[2]);
        }
        
        else if (event.getSource() == mc3){
        sfname.setText(Showfname[3]);
        slname.setText(Showlname[3]);
        s1phn.setText(Show1phn[3]);
        s2phn.setText(Show2phn[3]);
        sadr.setText(Showadr[3]);
        semail.setText(Showemail[3]);
        }
        
        else if (event.getSource() == mc4){
        sfname.setText(Showfname[4]);
        slname.setText(Showlname[4]);
        s1phn.setText(Show1phn[4]);
        s2phn.setText(Show2phn[4]);
        sadr.setText(Showadr[4]);
        semail.setText(Showemail[4]);
        }
        
        else if (event.getSource() == mc5){
        sfname.setText(Showfname[5]);
        slname.setText(Showlname[5]);
        s1phn.setText(Show1phn[5]);
        s2phn.setText(Show2phn[5]);
        sadr.setText(Showadr[5]);
        semail.setText(Showemail[5]);
        }
        
        else if (event.getSource() == mc6){
        sfname.setText(Showfname[6]);
        slname.setText(Showlname[6]);
        s1phn.setText(Show1phn[6]);
        s2phn.setText(Show2phn[6]);
        sadr.setText(Showadr[6]);
        semail.setText(Showemail[6]);
        }
        
        else if (event.getSource() == mc7){
        sfname.setText(Showfname[7]);
        slname.setText(Showlname[7]);
        s1phn.setText(Show1phn[7]);
        s2phn.setText(Show2phn[7]);
        sadr.setText(Showadr[7]);
        semail.setText(Showemail[7]);
        }
        
        else if (event.getSource() == mc8){
        sfname.setText(Showfname[8]);
        slname.setText(Showlname[8]);
        s1phn.setText(Show1phn[8]);
        s2phn.setText(Show2phn[8]);
        sadr.setText(Showadr[8]);
        semail.setText(Showemail[8]);
        }
        
        else if (event.getSource() == mc9){
        sfname.setText(Showfname[9]);
        slname.setText(Showlname[9]);
        s1phn.setText(Show1phn[9]);
        s2phn.setText(Show2phn[9]);
        sadr.setText(Showadr[9]);
        semail.setText(Showemail[9]);
        }
        
        else if (event.getSource() == mc10){
        sfname.setText(Showfname[10]);
        slname.setText(Showlname[10]);
        s1phn.setText(Show1phn[10]);
        s2phn.setText(Show2phn[10]);
        sadr.setText(Showadr[10]);
        semail.setText(Showemail[10]);
        }
        
        else if (event.getSource() == refresh){
        mc1.setText(Showfname[1]);
        mc2.setText(Showfname[2]);
        mc3.setText(Showfname[3]);
        mc4.setText(Showfname[4]);
        mc5.setText(Showfname[5]);
        mc6.setText(Showfname[6]);
        mc7.setText(Showfname[7]);
        mc8.setText(Showfname[8]);
        mc9.setText(Showfname[9]);
        mc10.setText(Showfname[10]);
        refreshsuccess.setText("All Contacts Successfully Updated!");
        }
    }
    
    @FXML
    void editweeks(ActionEvent event) throws FileNotFoundException{
        File class1 = new File("class1.txt");
        File time1 = new File("time1.txt");
        File fac1 = new File("fac1.txt");
        File qn1 = new File("qn1.txt");
        
        File class2 = new File("class2.txt");
        File time2 = new File("time2.txt");
        File fac2 = new File("fac2.txt");
        File qn2 = new File("qn2.txt");
        
        File class3 = new File("class3.txt");
        File time3 = new File("time3.txt");
        File fac3 = new File("fac3.txt");
        File qn3 = new File("qn3.txt");
        
        File class4 = new File("class4.txt");
        File time4 = new File("time4.txt");
        File fac4 = new File("fac4.txt");
        File qn4 = new File("qn4.txt");
        
        File class5 = new File("class5.txt");
        File time5 = new File("time5.txt");
        File fac5 = new File("fac5.txt");
        File qn5 = new File("qn5.txt");
        
        File class6 = new File("class6.txt");
        File time6 = new File("time6.txt");
        File fac6 = new File("fac6.txt");
        File qn6 = new File("qn6.txt");
        
        File class7 = new File("class7.txt");
        File time7 = new File("time7.txt");
        File fac7 = new File("fac7.txt");
        File qn7 = new File("qn7.txt");
        
        tempclass =  eclass.getText();
        temptime  =  etime.getText();
        tempfac   =  efac.getText();
        tempqn    =  eqn.getText();
        
        if (event.getSource() == as1){
        PrintWriter pfname1 = new PrintWriter (class1);
        PrintWriter ptime1  = new PrintWriter (time1);
        PrintWriter pfac1   = new PrintWriter (fac1);
        PrintWriter pqn1    = new PrintWriter (qn1);
        
        pfname1.println(tempclass);
        ptime1.println(temptime);
        pfac1.println(tempfac);
        pqn1.println(tempqn);
        
        pfname1.close();
        ptime1.close();
        pfac1.close();
        pqn1.close();
        updateTxt2.setText("Schedule Saved!");
        }
        
        else if (event.getSource() == as2){
        PrintWriter pfname2 = new PrintWriter (class2);
        PrintWriter ptime2  = new PrintWriter (time2);
        PrintWriter pfac2   = new PrintWriter (fac2);
        PrintWriter pqn2    = new PrintWriter (qn2);
        
        pfname2.println(tempclass);
        ptime2.println(temptime);
        pfac2.println(tempfac);
        pqn2.println(tempqn);
        
        pfname2.close();
        ptime2.close();
        pfac2.close();
        pqn2.close();
        updateTxt2.setText("Schedule Saved!");
        }
        
        else if (event.getSource() == as3){
        PrintWriter pfname3 = new PrintWriter (class3);
        PrintWriter ptime3  = new PrintWriter (time3);
        PrintWriter pfac3   = new PrintWriter (fac3);
        PrintWriter pqn3    = new PrintWriter (qn3);
        
        pfname3.println(tempclass);
        ptime3.println(temptime);
        pfac3.println(tempfac);
        pqn3.println(tempqn);
        
        pfname3.close();
        ptime3.close();
        pfac3.close();
        pqn3.close();
        updateTxt2.setText("Schedule Saved!");
        }
        
        else if (event.getSource() == as4){
        PrintWriter pfname4 = new PrintWriter (class4);
        PrintWriter ptime4  = new PrintWriter (time4);
        PrintWriter pfac4   = new PrintWriter (fac4);
        PrintWriter pqn4    = new PrintWriter (qn4);
        
        pfname4.println(tempclass);
        ptime4.println(temptime);
        pfac4.println(tempfac);
        pqn4.println(tempqn);
        
        pfname4.close();
        ptime4.close();
        pfac4.close();
        pqn4.close();
        updateTxt2.setText("Schedule Saved!");
        }
        
        else if (event.getSource() == as5){
        PrintWriter pfname5 = new PrintWriter (class5);
        PrintWriter ptime5  = new PrintWriter (time5);
        PrintWriter pfac5   = new PrintWriter (fac5);
        PrintWriter pqn5    = new PrintWriter (qn5);
        
        pfname5.println(tempclass);
        ptime5.println(temptime);
        pfac5.println(tempfac);
        pqn5.println(tempqn);
        
        pfname5.close();
        ptime5.close();
        pfac5.close();
        pqn5.close();
        updateTxt2.setText("Schedule Saved!");
        }
        
        else if (event.getSource() == as6){
        PrintWriter pfname6 = new PrintWriter (class6);
        PrintWriter ptime6  = new PrintWriter (time6);
        PrintWriter pfac6   = new PrintWriter (fac6);
        PrintWriter pqn6    = new PrintWriter (qn6);
        
        pfname6.println(tempclass);
        ptime6.println(temptime);
        pfac6.println(tempfac);
        pqn6.println(tempqn);
        
        pfname6.close();
        ptime6.close();
        pfac6.close();
        pqn6.close();
        updateTxt2.setText("Schedule Saved!");
        }
        
        else if (event.getSource() == as7){
        PrintWriter pfname7 = new PrintWriter (class7);
        PrintWriter ptime7  = new PrintWriter (time7);
        PrintWriter pfac7   = new PrintWriter (fac7);
        PrintWriter pqn7    = new PrintWriter (qn7);
        
        pfname7.println(tempclass);
        ptime7.println(temptime);
        pfac7.println(tempfac);
        pqn7.println(tempqn);
        
        pfname7.close();
        ptime7.close();
        pfac7.close();
        pqn7.close();
        updateTxt2.setText("Schedule Saved!");
        }
        
    }
    
    @FXML
    void displayweeks(ActionEvent event) throws FileNotFoundException{
        File class1     = new File("class1.txt");
        File time1      = new File("time1.txt");
        File fac1       = new File("fac1.txt");
        File qn1        = new File("qn1.txt");
        
        File class2 = new File("class2.txt");
        File time2 = new File("time2.txt");
        File fac2 = new File("fac2.txt");
        File qn2 = new File("qn2.txt");
        
        File class3 = new File("class3.txt");
        File time3 = new File("time3.txt");
        File fac3 = new File("fac3.txt");
        File qn3 = new File("qn3.txt");
        
        File class4 = new File("class4.txt");
        File time4 = new File("time4.txt");
        File fac4 = new File("fac4.txt");
        File qn4 = new File("qn4.txt");
        
        File class5 = new File("class5.txt");
        File time5 = new File("time5.txt");
        File fac5 = new File("fac5.txt");
        File qn5 = new File("qn5.txt");
        
        File class6 = new File("class6.txt");
        File time6 = new File("time6.txt");
        File fac6 = new File("fac6.txt");
        File qn6 = new File("qn6.txt");
        
        File class7 = new File("class7.txt");
        File time7 = new File("time7.txt");
        File fac7 = new File("fac7.txt");
        File qn7 = new File("qn7.txt");
        
        Scanner inclass1    = new Scanner (class1);
        Scanner intime1     = new Scanner (time1);
        Scanner infac1      = new Scanner (fac1);
        Scanner inqn1       = new Scanner (qn1);
        
        Scanner inclass2    = new Scanner (class2);
        Scanner intime2     = new Scanner (time2);
        Scanner infac2      = new Scanner (fac2);
        Scanner inqn2       = new Scanner (qn2);
        
        Scanner inclass3    = new Scanner (class3);
        Scanner intime3     = new Scanner (time3);
        Scanner infac3      = new Scanner (fac3);
        Scanner inqn3       = new Scanner (qn3);
        
        Scanner inclass4    = new Scanner (class4);
        Scanner intime4     = new Scanner (time4);
        Scanner infac4      = new Scanner (fac4);
        Scanner inqn4       = new Scanner (qn4);
        
        Scanner inclass5    = new Scanner (class5);
        Scanner intime5    = new Scanner (time5);
        Scanner infac5      = new Scanner (fac5);
        Scanner inqn5       = new Scanner (qn5);
        
        Scanner inclass6    = new Scanner (class6);
        Scanner intime6    = new Scanner (time6);
        Scanner infac6      = new Scanner (fac6);
        Scanner inqn6       = new Scanner (qn6);
        
        Scanner inclass7    = new Scanner (class7);
        Scanner intime7    = new Scanner (time7);
        Scanner infac7      = new Scanner (fac7);
        Scanner inqn7       = new Scanner (qn7);
        
        Showclass[1]   = inclass1.nextLine();
        Showtime[1]    = intime1.nextLine();
        Showfac[1]     = infac1.nextLine();
        Showqn[1]      = inqn1.nextLine();
        
        Showclass[2]   = inclass2.nextLine();
        Showtime[2]    = intime2.nextLine();
        Showfac[2]     = infac2.nextLine();
        Showqn[2]      = inqn2.nextLine();
        
        Showclass[3]   = inclass3.nextLine();
        Showtime[3]    = intime3.nextLine();
        Showfac[3]     = infac3.nextLine();
        Showqn[3]      = inqn3.nextLine();
        
        Showclass[4]   = inclass4.nextLine();
        Showtime[4]    = intime4.nextLine();
        Showfac[4]     = infac4.nextLine();
        Showqn[4]      = inqn4.nextLine();
        
        Showclass[5]   = inclass5.nextLine();
        Showtime[5]    = intime5.nextLine();
        Showfac[5]     = infac5.nextLine();
        Showqn[5]      = inqn5.nextLine();
        
        Showclass[6]   = inclass6.nextLine();
        Showtime[6]    = intime6.nextLine();
        Showfac[6]     = infac6.nextLine();
        Showqn[6]      = inqn6.nextLine();
        
        Showclass[7]   = inclass7.nextLine();
        Showtime[7]    = intime7.nextLine();
        Showfac[7]     = infac7.nextLine();
        Showqn[7]      = inqn7.nextLine();
        
        if (event.getSource() == ws1){
        dclass.setText(Showclass[1]);
        dtime.setText(Showtime[1]);
        dfac.setText(Showfac[1]);
        dqn.setText(Showqn[1]);
        }
        
        else if (event.getSource() == ws2){
        dclass.setText(Showclass[2]);
        dtime.setText(Showtime[2]);
        dfac.setText(Showfac[2]);
        dqn.setText(Showqn[2]);
        }
        
        else if (event.getSource() == ws3){
        dclass.setText(Showclass[3]);
        dtime.setText(Showtime[3]);
        dfac.setText(Showfac[3]);
        dqn.setText(Showqn[3]);
        }
        
        else if (event.getSource() == ws4){
        dclass.setText(Showclass[4]);
        dtime.setText(Showtime[4]);
        dfac.setText(Showfac[4]);
        dqn.setText(Showqn[4]);
        }
        
        else if (event.getSource() == ws5){
        dclass.setText(Showclass[5]);
        dtime.setText(Showtime[5]);
        dfac.setText(Showfac[5]);
        dqn.setText(Showqn[5]);
        }
        
        else if (event.getSource() == ws6){
        dclass.setText(Showclass[6]);
        dtime.setText(Showtime[6]);
        dfac.setText(Showfac[6]);
        dqn.setText(Showqn[6]);
        }
        
        else if (event.getSource() == ws7){
        dclass.setText(Showclass[7]);
        dtime.setText(Showtime[7]);
        dfac.setText(Showfac[7]);
        dqn.setText(Showqn[7]);
        }
        
        else if (event.getSource() == update){
        ws1.setText("Sunday: "+ Showfac[1]);
        ws2.setText("Monday: "+ Showfac[2]);
        ws3.setText("Tuesday: "+ Showfac[3]);
        ws4.setText("Wednesday: "+ Showfac[4]);
        ws5.setText("Thursday: "+ Showfac[5]);
        ws6.setText("Friday: "+ Showfac[6]);
        ws7.setText("Saturday: "+ Showfac[7]);
        updatesuccess.setText("Schedules Updated!");}
    }
    
    @FXML
    void displaycal(ActionEvent event){
    if (event.getSource() == one){
        cfield.setText(cfield.getText()+ "1");
        }
        else if (event.getSource() == two){
        cfield.setText(cfield.getText()+ "2");
        }
        else if (event.getSource() == three){
        cfield.setText(cfield.getText()+ "3");
        }
        else if (event.getSource() == four){
        cfield.setText(cfield.getText()+ "4");
        }
        else if (event.getSource() == five){
        cfield.setText(cfield.getText()+ "5");
        }
        else if (event.getSource() == six){
        cfield.setText(cfield.getText()+ "6");
        }
        else if (event.getSource() == seven){
        cfield.setText(cfield.getText()+ "7");
        }
        else if (event.getSource() == eight){
        cfield.setText(cfield.getText()+ "8");
        }
        else if (event.getSource() == nine){
        cfield.setText(cfield.getText()+ "9");
        }
        else if (event.getSource() == zero){
        cfield.setText(cfield.getText()+ "0");
        }
    else if (event.getSource() == clear){
        cfield.setText("");
        }
        else if (event.getSource() == plus){
        data = Double.parseDouble(cfield.getText());
        opr = 1;
        cfield.setText("");
        }
        else if (event.getSource() == minus){
        data = Double.parseDouble(cfield.getText());
        opr = 2;
        cfield.setText("");
        }
        else if (event.getSource() == mult){
        data = Double.parseDouble(cfield.getText());
        opr = 3;
        cfield.setText("");
        }
        else if (event.getSource() == divide){
        data = Double.parseDouble(cfield.getText());
        opr = 4;
        cfield.setText("");
        }
    else if (event.getSource() == percent){
        opr = 5;
        }
    else if (event.getSource() == sqrt){
        opr = 6;
        }
    else if (event.getSource() == dot){
        cfield.setText(cfield.getText() + ".");
        }
    else if (event.getSource() == recipro){
        opr = 9;
        }
     else if (event.getSource() == equals){
        double data2 = Double.parseDouble(cfield.getText());
        switch(opr){
            case 1: double ans = data + data2;
                cfield.setText(String.valueOf(ans));
                break;
                
             case 2 : ans = data - data2;
                cfield.setText(String.valueOf(ans));
                break;
            case 3 : ans = data * data2;
                cfield.setText(String.valueOf(ans));
                break;
            case 4 : 
                ans=0;
                try{
                ans = data / data2;
                cfield.setText(String.valueOf(ans));
                }catch (Exception e){
                cfield.setText("ERROR"+ e);}
                break; 
            case 5 : data = 0.01;
                ans = data * data2;
                cfield.setText(String.valueOf(ans));
                break;
            case 6 : data = Double.parseDouble(cfield.getText());
                ans = Math.sqrt(data);
                cfield.setText(String.valueOf(ans));
                break;
            case 9 : data = Double.parseDouble(cfield.getText());
                ans = 1/data;
                cfield.setText(String.valueOf(ans));
                break;
        }
                       
        }
    
    }
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
    
}
