import com.baizhi.dao.MasterDAO;
import com.baizhi.entity.Master;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestMaster {
    @Test
    public void test01() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring.xml");
        MasterDAO masterDAO = (MasterDAO) ctx.getBean("masterDAO");
        List<Master> masters = masterDAO.queryAll(0, 1);
        for (Master master : masters) {
            System.out.println(master);
        }


    }

    @Test
    public void test02() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring.xml");
        MasterDAO masterDAO = (MasterDAO) ctx.getBean("masterDAO");
        masterDAO.save(new Master(null, "sdf", "sdf", "dsfsd", null));
    }

    @Test
    public void test03() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring.xml");
        MasterDAO masterDAO = (MasterDAO) ctx.getBean("masterDAO");
        Long aLong = masterDAO.queryLength();
        System.out.println(aLong);
    }
    @Test
    public void test04() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring.xml");
        MasterDAO masterDAO = (MasterDAO) ctx.getBean("masterDAO");
       masterDAO.remove(1);
    }
    @Test
    public void test05() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring.xml");
        MasterDAO masterDAO = (MasterDAO) ctx.getBean("masterDAO");
        Master master = masterDAO.queryOneId(1);
        System.out.println(master);
    }
}