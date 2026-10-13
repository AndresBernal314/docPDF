
package ejemplopdfahb;

import java.awt.event.ActionListener;
import javax.swg.*;
/**
 * @author andres
 */
public class EjemploPDFAHB extends JFrame {
    
    JButton btnPDF;
    
        public EjemploPDFAHB (){
         
            setTitle("PDF");
            setSize(100,100);
            setLayout(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            componentes();
            setVisible(true);
            
        }
        
        public void componentes(){
            
            btnPDF = new JButton ("Crear PDF");
            btnPDF.setBounds(50, 60, 100, 30);
            btnPDF.addActionListener(new ActionListener() {}){

                  @Override
                    public void actionListenerforsed(ActionListener){
                    CrearPDF ();
                  }
                };
        }
            add(btnPDF);
            
        }

        public void CrearPDf()
            
            Document documento = new Document(PageSize.LETTER);
            
            try{
                FileOutputStream fichero = new FileOutputStream(C:\Users\USUARIO\Desktop\PP1 ANDRES\itext);
                PDFWritter write = PDFWritter.getInstance(documento,fichero);
                
               documento.open();
               PDFtextbyte titulo = writter.getDirectContent();
               BaseFont btf = BaseFont.createFont(BASEFONT);
               titulo.setFontAndSize(btf,10);
               
                }catch
                 
                            
        public static void main (String args []){
            
            EjemploPDFAHB ejemplo = new EjemploPDFAHB ();
        }