import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAdmin {
    @Test
    public void test01(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:spring.xml");
        AdminService adminDAO = (AdminService) ctx.getBean("adminService");
        Admin a=new Admin(1,"toot","toot");
        adminDAO.updatepassword(a);

    }
}
