package two;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
* @Description: 设置响应信息
* @Author: maiBangMin
* @date: 2020/8/21 17:45
* @Version: 1.0
*/
public class SetResponceInfo extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        System.out.println("[已收到请求]");

        // 1.设置响应头 k/v形式
        // 1.1 如果key相同，则会覆盖
        response.setHeader("aaa","AAA");
        response.setHeader("aaa","BBB");

        // 1.2 如果key相同,不会覆盖值
        response.addHeader("bbb","CCC");
        response.addHeader("bbb","DDD");

        // 2.设置响应状态码
        response.setStatus(300);

    }


}
