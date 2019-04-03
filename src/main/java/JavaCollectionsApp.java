import domain.JavaCollections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaCollectionsApp {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("collections-bean.xml");
        JavaCollections collections = (JavaCollections) context.getBean("bean1");
        System.out.println(collections);
    }
}
