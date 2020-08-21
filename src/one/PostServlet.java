package one;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PostServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        this.doPost(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        System.out.println("进入方法");
        response.getWriter().write("响应请求");

    }

}
