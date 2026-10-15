package ejemplopdfahb;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Image;
import static java.awt.PageAttributes.MediaType.C;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.swing.*;

/**
 * @author andres
 */
public class ejemploPDF extends JFrame {

    JButton btnPDF;

    public ejemploPDF() {

        setTitle("PDF");
        setSize(100, 100);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        componentes();
        setVisible(true);

    }

    public void componentes() {

        btnPDF = new JButton("Crear PDF");
        btnPDF.setBounds(50, 60, 100, 30);
        btnPDF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                CrearPDF();
            }
        }
        );

        add(btnPDF);

    }

    public void CrearPDf() {

        Document documento = new Document(PageSize.LETTER);

        try {
            FileOutputStream fichero = new FileOutputStream("C:/Users/USUARIO/Desktop/PP1 ANDRES/itext/EJEMPLOPDF.pdf");
            PdfWriter write = PdfWriter.getInstance(documento, fichero);

            documento.open();

            PdfContentByte titulo = write.getDirectContent();
            BaseFont btf = BaseFont.createFont(BaseFont.HELVETICA_BOLD, BaseFont.CP1252, BaseFont.CACHED);

            titulo.beginText();
            titulo.setTextMatrix(200, 300);
            titulo.showText("Creacion del PDF");
            titulo.setColorFill(BaseColor.GREEN);
            titulo.endText();

            PdfContentByte contenido = write.getDirectContent();
            BaseFont btf2 = BaseFont.createFont(BaseFont.HELVETICA_BOLD, BaseFont.CP1252, BaseFont.CACHED);

            contenido.beginText();
            contenido.setTextMatrix(50, 100);
            contenido.showText("Creacion del contenido del PDF");
            contenido.setColorFill(BaseColor.BLACK);
            contenido.endText();

            Image imagen = Image.getInstance("C:/Users/USUARIODesktop/PP1 ANDRES/INTERFAZ GRAFICA/FB_IMG_1596591789564.webp");
            imagen.setAligment(Element.PARAGRAPH);
            imagen.scaleAbsolute(200, 300);

            Paragraph parrafo = new Paragraph("no se"
                    + "que"
                    + "escribir");
            parrafo.setAligment(Element.ALIGN_CENTER);

            documento.add(imagen);
            documento.add(parrafo);
            documento.close();

        } catch (DocumentException | FileNotFoundException ev) {
            java.util.logging.Logger.getLogger(ejemploPDF.class.getName()).log(java.util.logging_level);
        } catch (MalformedURLException ev) {
            java.util.logging.Logger.getLogger(ejemploPDF.class.getName()).log(java.util.logging_level);
        } catch (IOException ev) {
            java.util.logging.Logger.getLogger(ejemploPDF.class.getName()).log(java.util.logging_level);
        }
    }

    public static void main(String args[]) {

        ejemploPDF ejemplo = new ejemploPDF();

    }
}
