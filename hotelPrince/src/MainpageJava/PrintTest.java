/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainpageJava;

/**
 *
 * @author prince
 */

import java.awt.print.PrinterJob;
import javax.print.PrintService;

public class PrintTest {
    public static void main(String[] args) {
        // Créer un objet PrinterJob
        PrinterJob job = PrinterJob.getPrinterJob();
        // Obtenir le tableau des services d'impression
        PrintService[] services = job.lookupPrintServices();
        // Afficher le nombre de services d'impression
        System.out.println("Nombre de services d'impression : " + services.length);
        // Parcourir le tableau et afficher le nom de chaque service
        for (int i = 0; i < services.length; i++) {
            System.out.println("Service " + (i+1) + " : " + services[i].getName());
        }
    }
}
