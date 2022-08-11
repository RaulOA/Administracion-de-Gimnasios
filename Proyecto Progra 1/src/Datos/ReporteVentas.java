package Datos;

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

public class ReporteVentas {

    String nombreArchivo;
    String rutaImagen;
    String fecha;
    String[][] listaVentas;
    String sTotal;
    String iva;
    String total;

    Document documento;
    Paragraph titulo;
    FileOutputStream archivo;

    public ReporteVentas(String nombreArchivo, String rutaImagen, String fecha, String[][] listaVentas, String sTotal, String iva, String total) {
        this.nombreArchivo = nombreArchivo;
        this.fecha = fecha;
        this.rutaImagen = rutaImagen;
        this.listaVentas = listaVentas;
        this.sTotal=sTotal;
        this.iva=iva;
        this.total=total;

        documento = new Document();
        titulo = new Paragraph("Venta realizada el " + fecha + "\n CityFitness");
    }

    public void generarReporte() throws FileNotFoundException, DocumentException {
        JOptionPane.showMessageDialog(null, "PDF de reporte de venta, generado exitosamente");
        archivo = new FileOutputStream("Venta a "+nombreArchivo + ".pdf");
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

        Paragraph parrafo1 = new Paragraph("Gracias por su compra: " + nombreArchivo);
        documento.add(parrafo1);
        Paragraph parrafo2 = new Paragraph("");
        documento.add(parrafo2);

        documento.add(Chunk.NEWLINE);

        PdfPTable tabla = new PdfPTable(4);
        tabla.setWidthPercentage(100);

        PdfPCell producto = new PdfPCell(new Phrase("Producto"));
        producto.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell precio = new PdfPCell(new Phrase("Precio"));
        precio.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell cantidad = new PdfPCell(new Phrase("Cantidad"));
        cantidad.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell importe = new PdfPCell(new Phrase("Importe"));
        importe.setBackgroundColor(BaseColor.LIGHT_GRAY);

        tabla.addCell(producto);
        tabla.addCell(precio);
        tabla.addCell(cantidad);
        tabla.addCell(importe);

        for (int i = 0; i < listaVentas.length; i++) {
            for (int j = 0; j < listaVentas[i].length; j++) {
                tabla.addCell(listaVentas[i][j]);
            }
        }
        documento.add(tabla);
        documento.add(Chunk.NEWLINE);
        
        Paragraph parrafo3 = new Paragraph("SubTotal \t"+sTotal+" Colones");
        documento.add(parrafo3);
        Paragraph parrafo4 = new Paragraph("I . V .A \t"+iva+" Colones");
        documento.add(parrafo4);
        Paragraph parrafo5 = new Paragraph("TOTAL   \t"+total+" Colones");
        documento.add(parrafo5);
        documento.add(Chunk.NEWLINE);
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
