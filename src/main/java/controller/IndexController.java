package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Msg;
import pojo.TbAdmin;
import pojo.TbGrade;
import pojo.TbbUser;
import service.AdminService;
import service.GradeService;
import service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Classname IndexController
 * @Description
 * @@Author
 * @Date 2019/5/13 20:32
 * @Vestion 1.0
 **/
@Controller
public class IndexController {
   @Autowired
    private UserService userService;
  @Autowired
  private GradeService gradeService;
  @Autowired
  private AdminService adminService;

    @RequestMapping("/loginPage.do")
     public String toLogin(){ ;
      return  "login";
    }

    @RequestMapping("/login.do")
    public String login(TbAdmin tbb, HttpServletRequest request, Model model){
        TbAdmin login = adminService.login(tbb);
        if(login!=null){
            request.getSession().setAttribute("user",login);
            model.addAttribute("user",login);

           // List<TbGrade> myAll = gradeService.getMyAll(login);

            List<TbbUser> all = userService.getAll();
            model.addAttribute("list",all);

            return "user/index";
    }
        Msg msg=new Msg("密码错误或用户不存在",false);
        model.addAttribute("msg",msg);
        return  "login";

    }
   @RequestMapping("/index")
   public String index2(HttpServletRequest request, Model model){


       model.addAttribute("user", request.getSession().getAttribute("user"));

       // List<TbGrade> myAll = gradeService.getMyAll(login);

       List<TbbUser> all = userService.getAll();
       model.addAttribute("list",all);
        return  "user/index";
   }

    @RequestMapping("/see/{id}")
    public String get(@PathVariable("id") int id,Model model){

        model.addAttribute("g",gradeService.getMyAll(id));
        return  "user/h1";
    }
    @RequestMapping("/delete/{id}")
    @ResponseBody
    public Msg delete(@PathVariable("id") int id){

        return userService.deleteById(id);

    }
    @RequestMapping("/score/delete/{id}")
    @ResponseBody
    public Msg delete2(@PathVariable("id") int id){

        Msg m=gradeService.deleteById(id);
        return m;

    }
    @RequestMapping("/score/update")
    @ResponseBody
    public Msg update(@RequestBody TbGrade tbGrade){
        System.out.println("更新参数："+tbGrade);
        Msg m=gradeService.update(tbGrade);
        return m;

    }
    @RequestMapping("/score/getOne/{id}")
    @ResponseBody
    public TbGrade getById(@PathVariable("id") int id){

        return  gradeService.getOneById(id);

    }
    @RequestMapping("/score/addTbGrade")
    @ResponseBody
    public Msg add(@RequestBody TbGrade tbGrade,HttpServletRequest request){
        System.out.println("添加参数："+tbGrade);
        Msg m=gradeService.add(tbGrade);
        return m;

    }
    @RequestMapping("logout")
    public void logout(HttpServletRequest request, HttpServletResponse response){

        request.getSession().removeAttribute("user");

        try {
            response.sendRedirect("loginPage.do");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @RequestMapping("/user/addUser")
    @ResponseBody
    public Msg add(@RequestBody TbbUser tbbUsere){
        System.out.println("添加用户参数："+tbbUsere);

        return userService.add(tbbUsere);

    }
    @RequestMapping("/user/updateUser")
    @ResponseBody
    public Msg updateUser(@RequestBody TbbUser tbbUsere){
        System.out.println("更新用户参数："+tbbUsere);

        return userService.update(tbbUsere);

    }

}
