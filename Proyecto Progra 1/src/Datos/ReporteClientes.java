
package Datos;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

public class ReporteClientes {
    
    String nombreArchivo;
    String fecha;
    String[][] clientes;

    Document documento;
    Paragraph titulo;
    FileOutputStream archivo;

    public ReporteClientes(String nombreArchivo, String fecha, String[][] clientes) {
        this.nombreArchivo = nombreArchivo;
        this.fecha = fecha;
        this.clientes = clientes;
        
        documento = new Document();
        titulo = new Paragraph("Reporte de Lista de Clientes");
    }

    public void generarReporte() throws FileNotFoundException, DocumentException{
        JOptionPane.showMessageDialog(null, "Reporte Generado");
        archivo = new FileOutputStream(nombreArchivo + ".pdf");
        PdfWriter.getInstance(documento, archivo);
        
        documento.open();
        titulo.setAlignment(1);
        documento.add(titulo);
        documento.add(Chunk.NEWLINE);
        
        
        PdfPTable tabla = new PdfPTable(4);
        tabla.setWidthPercentage(100);
        
        PdfPCell cedula = new PdfPCell(new Phrase("Cédula"));
        cedula.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell nombre = new PdfPCell(new Phrase("Nombre"));
        nombre.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell apellido = new PdfPCell(new Phrase("Apellido"));
        apellido.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell genero = new PdfPCell(new Phrase("Número"));
        genero.setBackgroundColor(BaseColor.LIGHT_GRAY);
        
        tabla.addCell(cedula);
        tabla.addCell(nombre);
        tabla.addCell(apellido);
        tabla.addCell(genero);
        
        for (int i = 0; i < clientes.length; i++) {
            for (int j = 0; j < clientes[i].length; j++) {
                tabla.addCell(clientes[i][j]);
            }
        }
        
        documento.add(tabla);
        documento.add(Chunk.NEWLINE);
        
        Paragraph fechaGeneracion = new Paragraph("Documento generado en: " + fecha);
        documento.add(fechaGeneracion);
        
        documento.close();
}
}
