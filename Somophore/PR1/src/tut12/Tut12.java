package tut12;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Tut12 {

    static String[] loadVocab() throws Exception{
        File f = new File("vocab.bin");
        String[] vocab;
        try (FileInputStream fis = new FileInputStream(f); 
        ObjectInputStream ois = new ObjectInputStream(fis)) {
            vocab = (String[]) ois.readObject();
            for (int i = 0; i < vocab.length; i++) {
                System.out.println("vocab" + "[" + i + "]:" + vocab[i]);
            }
            ois.close();
            return vocab;
        }
    }

    public static ArrayList<String> loadLines() throws Exception {
        Scanner sc = new Scanner(Paths.get("vector.txt"));
        String lineString = null;
        ArrayList<String> lineArray = new ArrayList<>();
        while (sc.hasNextLine()) {
            lineString = sc.nextLine();
            System.out.println(lineString);
            lineArray.add(lineString);
        }

        return lineArray;

    }

    public static int[] toIntVecTor() throws Exception {
        ArrayList<String> lineArray = loadLines();
        String[] arrayOfString1Line;
        int[] arrayOfInt1Line = null;
        for (String lineString : lineArray) {
            arrayOfString1Line = lineString.split(" ");
            int length = arrayOfString1Line.length;
            arrayOfInt1Line = new int[length];
            for (int i = 0; i < length; i++) {
                arrayOfInt1Line[i] = Integer.parseInt(arrayOfString1Line[i]);
            }

        }
        return arrayOfInt1Line;

    }

    public static String toSentence(int[] arrayOfInt1Line, String[] vocab) throws Exception {
        String senTence = "";
        for (int i = 0; i < arrayOfInt1Line.length; i++) {
            senTence = senTence + vocab[arrayOfInt1Line[i]] + "\t";
        }
        System.out.println(senTence);
        return senTence;

    }

    public static void main(String[] args) throws Exception {
        String[] vocab = loadVocab();
        ArrayList<String> lineArray = loadLines();
        System.out.println("\n Vocabulary has been loaded!\n");
        loadVocab();
        System.out.println("\n Loaded lines\n");
        loadLines();
        String[] arrayOfString1Line;
        int[] arrayOfInt1Line;
        String sentence = "";
        for (String lineString : lineArray) {
            arrayOfString1Line = lineString.split(" ");
            int length = arrayOfString1Line.length;
            arrayOfInt1Line = new int[length];
            for (int i = 0; i < length; i++) {
                arrayOfInt1Line[i] = Integer.parseInt(arrayOfString1Line[i]);
                sentence = sentence + vocab[arrayOfInt1Line[i]]+" ";
            }
            sentence = sentence + "\n";

        }
        System.out.println(sentence);
    }
}
