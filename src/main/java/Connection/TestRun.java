package Connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



public class TestRun {
    public static void main(String[] args) {
        Session session = null;
        try{
            session = buildSessionFactory().openSession();

            Group group = new Group();
            group.setName("SQL");

            session.save(group);
            System.out.println("Create success");
        }finally {
            if(session != null){
                session.close();
            }
        }
    }
        private static SessionFactory buildSessionFactory(){
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");

            configuration.addAnnotatedClass(Group.class);
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();

            return configuration.buildSessionFactory(serviceRegistry);
    }
}
