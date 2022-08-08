package Datos;

import FramesTrainers.PanelGenerarRutinas;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BarcodeQRCode;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

public class ReporteRutina {

    String nombreArchivo;
    String rutaImagen;
    String fecha;
    int semanas;
    String nivel;
    String dias;
    String imc;
    String cliente;
    String edad;
    String altura;
    String peso;
    String padecimiento;

    Document documento;
    Paragraph titulo;
    FileOutputStream archivo;

    public ReporteRutina(String nombreArchivo, String rutaImagen, String fecha, int semanas, String nivel, String dias, String imc, String cliente, String edad, String altura, String peso, String padecimiento) {
        this.nombreArchivo = nombreArchivo;
        this.fecha = fecha;
        this.rutaImagen = rutaImagen;
        this.semanas = semanas;
        this.nivel = nivel;
        this.dias = dias;
        this.imc = imc;
        this.cliente = cliente;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.padecimiento = padecimiento;

        documento = new Document();
        titulo = new Paragraph("Rutina de Ejercicios para " + semanas + " semanas");
    }

    public void generarReporte() throws FileNotFoundException, DocumentException {
        JOptionPane.showMessageDialog(null, "Reporte Generado en PDF, revisar carpeta.");
        archivo = new FileOutputStream(nombreArchivo + ".pdf");
        PdfWriter.getInstance(documento, archivo);

        documento.open();
        Image logo = null;
        try {
            logo = Image.getInstance(rutaImagen);
            logo.scaleAbsolute(150, 90);
            logo.setAbsolutePosition(415, 750);
        } catch (Exception e) {
        }
        documento.add(logo);
        titulo.setAlignment(1);
        documento.add(titulo);
        documento.add(Chunk.NEWLINE);

        Paragraph parrafo1 = new Paragraph("Cliente:\t " + cliente + "\t \t                                    \t" + edad);
        documento.add(parrafo1);
        Paragraph parrafo2 = new Paragraph("El nivel de entreno es:\t " + nivel + "\t \t                                           \t" + altura);
        documento.add(parrafo2);
        Paragraph parrafo3 = new Paragraph("El cliente entrenara  " + dias + " dias a la semana" + "\t \t                              \t" + peso);
        documento.add(parrafo3);
        Paragraph parrafo4 = new Paragraph("Clasificación según IMC:\t " + imc);
        documento.add(parrafo4);
        documento.add(Chunk.NEWLINE);
        Paragraph parrafo5 = new Paragraph("Padecimientos:\t " + padecimiento);
        documento.add(parrafo5);
        documento.add(Chunk.NEWLINE);

        PdfPTable tabla = new PdfPTable(5);
        tabla.setWidthPercentage(100);

        PdfPCell ejercicio = new PdfPCell(new Phrase("Ejercicio"));
        ejercicio.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell series = new PdfPCell(new Phrase("Series"));
        series.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell repeticiones = new PdfPCell(new Phrase("Repeticiones"));
        repeticiones.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell peso = new PdfPCell(new Phrase("Peso"));
        peso.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell descanso = new PdfPCell(new Phrase("Descanso"));
        descanso.setBackgroundColor(BaseColor.LIGHT_GRAY);

        tabla.addCell(ejercicio);
        tabla.addCell(series);
        tabla.addCell(repeticiones);
        tabla.addCell(peso);
        tabla.addCell(descanso);

        tabla.completeRow();

        documento.add(tabla);
        for (int i = 0; i < 18; i++) {
            Paragraph p = new Paragraph("Ej" + (i + 1));
            documento.add(p);
        }
        documento.add(Chunk.NEWLINE);

        Paragraph fechaGeneracion = new Paragraph("Documento generado en: " + fecha);
        documento.add(fechaGeneracion);
        
        BarcodeQRCode qrcode = new BarcodeQRCode("Grupo 1:Yirgrin, Raùl y Juan Rafael", 1, 1, null);
        Image QrenImage = qrcode.getImage();
        QrenImage.scalePercent(200);
        documento.add(QrenImage);
        

        documento.close();
    }
}
