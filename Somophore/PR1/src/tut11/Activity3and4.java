package tut11;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HT
 */
import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Activity3and4 {
    public static void main (String [] args) throws FileNotFoundException, IOException{
        ArrayList<String> a = new ArrayList<>();
        a.add("Kris");
        a.add("Mei");
        a.add("Rain");
        for (int i = 0; i<a.size(); i++){
           System.out.println(a.get(i));
        }
        File f = new File("data.bin");
        FileOutputStream fc = new FileOutputStream(f);
        ObjectOutputStream fnc = new ObjectOutputStream(fc);
        fnc.writeObject(a);
        fnc.close();
        
        FileInputStream fi = new FileInputStream(f);
        ObjectInputStream fni = new ObjectInputStream(fi);
        a = (String []) fni.readObject();
        fni.close();
}
}

