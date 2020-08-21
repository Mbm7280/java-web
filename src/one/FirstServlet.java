package one;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
* @Description: Servlet FastStart
* @Author: maiBangMin
* @date: 2020/8/21 16:17
* @Version: 1.0
*/
public class FirstServlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.getWriter().write("hello");
    }

}
