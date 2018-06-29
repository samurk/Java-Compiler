/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myide;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import static myide.IDE.jTextArea2;
/**
 *
 * @author Sami-ur-Rehman Khan
 */
public class CompilerClass {
    private static void printLines(String name, InputStream ins) throws Exception {
    String line = null;
    BufferedReader in = new BufferedReader(new InputStreamReader(ins));
        while ((line = in.readLine()) != null) 
        {
            System.out.println(name + " " + line);
            String s=name + " " + line;
            jTextArea2.setText(s);
        }
    }
public static void runProcess(String command) throws Exception {
Process pro = Runtime.getRuntime().exec(command);
printLines(command +"", pro.getInputStream());
printLines(command +"", pro.getErrorStream());
pro.waitFor();
jTextArea2.setText(command + " exitValue() " + pro.exitValue());
}

}
