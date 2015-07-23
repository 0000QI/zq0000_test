package spring.site.helloWorld;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
public class HelloWorldController implements Controller{
	@Override
	public ModelAndView handleRequest(HttpServletRequest req,HttpServletResponse resp) throws Exception{
		ModelAndView mvAndView = new ModelAndView();
		mvAndView.addObject("messsage", "Hello World!");
		mvAndView.setViewName("/helloWorld");
		System.out.println("work!!!");
		return mvAndView;
	}
}
