package two;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
* @Description: 获取请求信息
* @Author: maiBangMin
* @date: 2020/8/21 16:33
* @Version: 1.0
*/
public class GetRequestInfo extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        // 获取请求行数据
        // 1. 请求方式
        System.out.println("[请求方式]" + request.getMethod());

        // 2. 获取请求的完整地址
        System.out.println("[请求的完整地址]" + request.getRequestURL());

        // 3. 获取请求的资源地址
        System.out.println("[获取请求的地址]" + request.getRequestURI());

        // 4. 获取请求中的协议
        System.out.println("[获取请求的协议]" + request.getScheme());

        // 2.获取请求头信息
        // 2.1.根据key获取value
        System.out.println(request.getHeader("accept"));
        // 2.2.获取请求头中的所有 key
        Enumeration<String> headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()){
            System.out.println("[请求头中key]" + headerNames.nextElement());
        }

        // 3.获取请求体信息
        // 3.1 key/value 形式
        System.out.println("[name]" + request.getParameter("name"));
        System.out.println("[password]" + request.getParameter("pwd"));

        // 4.获取相同key的多个数据值
        String[] values = request.getParameterValues("fav");
        for (String str:values) {
            System.out.println("[多个相同的key]" + str);
        }

        // 5.其他常用方法
        // 5.1 获取远程客户端地址
        System.out.println("[remoteAddress]" + request.getRemoteAddr());
        // 5.2 获取远程客户端的主机名称
        System.out.println("[remoteHostName]" + request.getRemoteHost());
        // 5.3 获取远程客户端的端口号
        System.out.println("[remotePort]" + request.getRemotePort());


    }

}
