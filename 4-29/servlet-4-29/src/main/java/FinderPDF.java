import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * @author HanChao
 * @date 2020-04-29 19:17
 * 描述信息：
 */
@WebServlet("/Finder")
public class FinderPDF extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        File file = new File("/Library/Tomcat/apache-tomcat-9.0.34/webapps/myfinder/WEB-INF/classes/Spring Boot.pdf");
        //File file = new File("/Spring Boot.pdf");
        resp.setContentType("application/PDF;charset=utf-8");

        InputStream fileInputStream = new FileInputStream(file.getAbsolutePath());
        OutputStream outputStream = resp.getOutputStream();

        byte[] bytes = new byte[1024];
        while ((fileInputStream.read(bytes)) != -1){
            outputStream.write(bytes);
        }

        outputStream.close();
        fileInputStream.close();


    }
}
