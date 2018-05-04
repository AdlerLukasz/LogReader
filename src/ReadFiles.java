import java.io.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class ReadFiles {


    public static void main(String[] args) throws IOException {

        prod1();
        prod2();
        uat1();
        uat2();




    }


    public static void prod1() throws IOException {
        ArrayList<String> array = new ArrayList<String>();

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("/Users/mac/DEV/LOG.txt"));
        } catch (FileNotFoundException ex) {
            System.err.println(ex.toString());

        }
        String line;
        int N = 100;
        int counter = 0;
        try {

            while ((line = reader.readLine()) != null && counter < N) {

                array.add(line);
                array.add("\n");
                counter++;
            }

            reader.close();
        } catch (IOException ex) {
            System.err.println(ex.toString());
        }


        String fileName = new SimpleDateFormat("yyyy-MM-dd'.txt'").format(new Date());


        FileWriter writer = new FileWriter("/Users/mac/DEV/PROD_log1_" + fileName);
        for (String str : array) {
            writer.write(str);
        }
        writer.close();

    }


    // NEXT METHOD

    public static void prod2() throws IOException {
        ArrayList<String> array = new ArrayList<String>();

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("/Users/mac/DEV/LOG.txt"));
        } catch (FileNotFoundException ex) {
            System.err.println(ex.toString());

        }
        String line;
        int N = 100;
        int counter = 0;
        try {

            while ((line = reader.readLine()) != null && counter < N) {

                array.add(line);
                array.add("\n");
                counter++;
            }

            reader.close();
        } catch (IOException ex) {
            System.err.println(ex.toString());
        }


        String fileName = new SimpleDateFormat("yyyy-MM-dd'.txt'").format(new Date());


        FileWriter writer = new FileWriter("/Users/mac/DEV/PROD_log2_-" + fileName);
        for (String str : array) {
            writer.write(str);
        }
        writer.close();

    }

    public static void uat1() throws IOException {
        ArrayList<String> array = new ArrayList<String>();

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("/Users/mac/DEV/LOG.txt"));
        } catch (FileNotFoundException ex) {
            System.err.println(ex.toString());

        }
        String line;
        int N = 100;
        int counter = 0;
        try {

            while ((line = reader.readLine()) != null && counter < N) {

                array.add(line);
                array.add("\n");
                counter++;
            }

            reader.close();
        } catch (IOException ex) {
            System.err.println(ex.toString());
        }


        String fileName = new SimpleDateFormat("yyyy-MM-dd'.txt'").format(new Date());


        FileWriter writer = new FileWriter("/Users/mac/DEV/UAT_log1_" + fileName);
        for (String str : array) {
            writer.write(str);
        }
        writer.close();

    }


    public static void uat2() throws IOException {
        ArrayList<String> array = new ArrayList<String>();

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("/Users/mac/DEV/LOG.txt"));
        } catch (FileNotFoundException ex) {
            System.err.println(ex.toString());

        }
        String line;
        int N = 100;
        int counter = 0;
        try {

            while ((line = reader.readLine()) != null && counter < N) {

                array.add(line);
                array.add("\n");
                counter++;
            }

            reader.close();
        } catch (IOException ex) {
            System.err.println(ex.toString());
        }


        String fileName = new SimpleDateFormat("yyyy-MM-dd'.txt'").format(new Date());


        FileWriter writer = new FileWriter("/Users/mac/DEV/UAT_log2_" + fileName);
        for (String str : array) {
            writer.write(str);
        }
        writer.close();

    }


}