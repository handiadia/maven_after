import com.baizhi.dao.ChapterDAO;
import com.baizhi.entity.Chapter;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestChapter {
    @Test
    public void test01(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:spring.xml");
        ChapterDAO chapterDAO = (ChapterDAO) ctx.getBean("chapterDAO");
        chapterDAO.save(new Chapter(null,"dffdfd","dfd","fdgdg",2));

    }
}
