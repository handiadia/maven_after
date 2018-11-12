import com.baizhi.entity.Workrecord;
import com.baizhi.service.WorkrecordService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWorkrecord {
    @Test
    public void test01() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring.xml");
        WorkrecordService workrecordService = (WorkrecordService) ctx.getBean("workrecordService");
        Workrecord workrecord = workrecordService.queryOneId(2);
        System.out.println(workrecord);

    }
}
