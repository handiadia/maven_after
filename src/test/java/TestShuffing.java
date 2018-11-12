import com.baizhi.service.ShuffingService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestShuffing {

    @Test
    public void test02(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:spring.xml");
        ShuffingService shuffingService = (ShuffingService) ctx.getBean("shuffingService");



    }
    @Test
    public void test03(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:spring.xml");
        ShuffingService shuffingService = (ShuffingService) ctx.getBean("shuffingService");



    }
}
