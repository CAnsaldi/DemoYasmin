import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.BufferedReader;
import java.io.IOException;


import javax.swing.*;
import java.awt.Dimension;
import java.awt.FlowLayout;
//import java.awt.HeadlessException;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.*;


public class Main {
    public static String textFieldText = "";
    public static void main(String[] args) {


        String month = "February";
        int monthInt;
        switch (month){
            case "January": monthInt = 1;
            case "February": monthInt = 2;
            case "March": monthInt = 3;
            case "April": monthInt = 4;
            default: monthInt = 0;
        }


        JFrame f = new JFrame();
        f.setBounds(800,800,800,800);
        //JButton b=new JButton("click");//creating instance of JButton
        //b.setBounds(50,100,95,30);//x axis, y axis, width, height
        JTextField t = new JTextField(textFieldText);
        t.setBounds(50,50, 300,40);
        Font font1 = new Font("SansSerif", Font.BOLD, 20);
        t.setFont(font1);

        //f.add(b);//adding button in JFrame
        f.add(t);

        f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible


        t.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                JTextField textField = (JTextField) e.getSource();
                String text = textField.getText();
                if(containsNumber(text)){
                    textField.setText(textFieldText);
                } else {
                    textFieldText = text;
                    textField.setText(textFieldText);
                }
            }
        });



/*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter something: ");
        try {
            String s = br.readLine();
        } catch (Exception e){

        }

        System.out.print("Enter Integer:");
        try {
            String y = br.readLine();
            int i = Integer.parseInt(y);
        } catch(Exception nfe) {
            System.err.println("Invalid Format!");
        }

        for(int i=0; i<1000; i++){
            System.out.println(i);
        }
        System.out.println("Test");*/
        /*int[][][] x = { {{1, 3, 5, 7, 9, 11},{0,2,4,6,8,10}},{ {7,6,5,6,2,55}, {7,6,5,6,2,55} }   };

        for(int i = 0; i<x.length;i++){

            for (int j = 0; j<x[i].length;j++){
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
        */
        /*
        //Arrays und Matritzen initialisieren
        double[][] matrix = {{15,47,23},{-2,-55,3},{33,-4,3},{0,2,3}};
        double[] vector = {0.5,-2.5,2};
        double[][] x = new double[3][4];

        //Multiplizieren, Matrix X ausgeben, Matrix X transponieren
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                //Multiplizieren
                double value = matrix[i][j]*vector[j];
                //Transponiert in X einfügen (i und j vertauscht)
                x[j][i] = value;
                //Resultat der Multiplikation drucken
                System.out.print(value + " ");
            }
            //Zeilenumbruch
            System.out.println();
        }

        System.out.println();

        //Transponierte Matrix X ausgeben
        for(int i=0; i<x.length; i++){
            for(int j=0; j<x[i].length; j++){
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }

        for(double[] number : x){
            System.out.println(number[0]);
        }

        ArrayList<Fahrzeug> vehicles = new ArrayList<Fahrzeug>();

        Auto audi = new Auto(3,4,4,"Audi",250);
        vehicles.add(audi);
        Auto lada = new Auto(5,1,4,"Lada",25);
        vehicles.add(lada);
        Auto vw = new Auto(13,13,4,"VW",180);
        vehicles.add(vw);
        Auto volvo = new Auto(1,2,4,"Volvo",250);
        vehicles.add(volvo);

        Fahrrad mountainBike = new Fahrrad(3,3,2,"Simano",true);
        vehicles.add(mountainBike);


        Iterator<Fahrzeug> it = vehicles.iterator();
        while(it.hasNext()){
            Fahrzeug f = it.next();
            System.out.println(f.getMarke());
            System.out.println(f.getClass());
        }
*/


    }





    private static boolean containsNumber(String text) {
        char[] chars = text.toCharArray();
        for(char c : chars){
            if(Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }
}
