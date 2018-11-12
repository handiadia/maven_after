import com.baizhi.dao.GanluDAO;
import com.baizhi.entity.Ganlu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestGanlu {
    @Test
    public void test01(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:spring.xml");
        GanluDAO ganluDAO = (GanluDAO) ctx.getBean("ganluDAO");
        List<Ganlu> ganlus = ganluDAO.queryAll(0, 1);
        for (Ganlu ganlu : ganlus) {
            System.out.println(ganlu);
        }

    }
}
