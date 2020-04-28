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
        //Integer a = Integer.valueOf(req.getParameter("a"));
        //resp.getWriter().append(a.toString());
        String a = req.getParameter("a");
        String b = req.getParameter("b");

        Integer c = Integer.parseInt(a) + Integer.parseInt(b);

        resp.getWriter().write(c.toString());
        


    }
}
