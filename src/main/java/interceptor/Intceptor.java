package interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import pojo.TbAdmin;
import pojo.TbbUser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Classname Intceptor
 * @Description
 * @@Author Pupansheng
 * @Date 2019/5/14 11:10
 * @Vestion 1.0
 **/
public class Intceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截网址: "+request.getRequestURI());
        TbAdmin user =(TbAdmin) request.getSession().getAttribute("user");
        if(user!=null)
            return true;
        else
        {

            response.sendRedirect("/loginPage.do");
            return  false;

        }
    }
}
