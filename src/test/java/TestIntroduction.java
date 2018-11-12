import com.baizhi.dao.GanluDAO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIntroduction {
    @Test
    public void test01(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:spring.xml");
        GanluDAO ganluDAO = (GanluDAO) ctx.getBean("ganluDAO");


    }
}
