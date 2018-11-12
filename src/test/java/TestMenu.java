import com.baizhi.entity.Menu;
import com.baizhi.service.MenuService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestMenu {
    @Test
    public void test01(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:spring.xml");
        MenuService menuDAO = (MenuService) ctx.getBean("menuService");
        List<Menu> menuList = menuDAO.queryAll();
        System.out.println(menuList);

    }
}
