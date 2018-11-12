import com.baizhi.entity.Jixiang;
import com.baizhi.service.JixiangService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class jixiang {
    @Test
    public void test02(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:spring.xml");
        JixiangService jixiangDAO = (JixiangService) ctx.getBean("jixiangService");
        List<Jixiang> jixiangs = jixiangDAO.queryChapter(1);
        for (Jixiang jixiang : jixiangs) {
            System.out.println(jixiang);
        }
    }
    @Test
    public void test03(){

    }
}
