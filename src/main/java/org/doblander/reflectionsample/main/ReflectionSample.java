/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.doblander.reflectionsample.main;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import org.doblander.reflectionsample.service.HelloMeth;

/**
 *
 * @author intruder
 */
public class ReflectionSample {

    /* constant for package name of implementation classes so that the user
     * has not to provide the fully qualified class name---
     * which is expected by "Class.forName()"
     */
    private static final String PACKAGE_NAME
            = "org.doblander.reflectionsample.impl.";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String buf = "";

        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        new DataInputStream(System.in)));

        while (true) {
            try {
                System.out.print("Klassenname oder ende eingeben: ");
                buf = in.readLine();

                if (buf.equals("ende")) {
                    break;
                }

                buf = PACKAGE_NAME + buf;

                Class c = Class.forName(buf);
                Object o = c.newInstance();
                ((HelloMeth) o).hello();

            } catch (IOException e) {
                System.out.println(e.toString());
            } catch (ClassNotFoundException e) {
                System.out.println("Klasse nicht gefunden");
            } catch (ClassCastException e) {
                System.out.println(e.toString());
            } catch (InstantiationException e) {
                System.out.println(e.toString());
            } catch (IllegalAccessException e) {
                System.out.println(e.toString());
            }
        }
    }
}
