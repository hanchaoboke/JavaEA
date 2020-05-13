import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author HanChao
 * @date 2020-04-28 18:58
 * 描述信息：
 */
@WebServlet("/demo")
public class Webapp extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer c = 0;
        req.setAttribute("result",c);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }



}
