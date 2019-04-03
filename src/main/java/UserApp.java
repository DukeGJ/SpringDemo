import domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserApp {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = (User) context.getBean("bean1");
        System.out.println("无参构造依赖注入"+user);
        user = (User) context.getBean("bean2");
        System.out.println("有参构造依赖注入"+user);
        user = (User) context.getBean("bean3");
        System.out.println("有参构造注入内部bean"+user);
    }
}
