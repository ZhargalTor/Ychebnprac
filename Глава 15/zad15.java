import java.io.File;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class zad5 {
    public zad15() {
    }

    public static void main(String[] args) {
        try {
            File xmlFile = new File("Orang.xml");
            File xsltFile = new File("transform.xsl");
            File outputFile = new File("output.html");
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(new StreamSource(xsltFile));
            transformer.transform(new StreamSource(xmlFile), new StreamResult(outputFile));
            System.out.println("Преобразование завершено. Результат сохранен в output.html");
        } catch (Exception var6) {
            Exception e = var6;
            e.printStackTrace();
        }

    }
}
