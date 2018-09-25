import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.repository.ICustomerRepository;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {

    /*@Bean(name="customerService")
    public CustomerService getCustomerService(){
        //CustomerServiceImpl service= new CustomerServiceImpl(getCustomerRepository());
        CustomerServiceImpl service= new CustomerServiceImpl();
        //service.setCustomerRepository(getCustomerRepository());
        return service;
    }

    /*@Bean(name="customerRepository")
    public ICustomerRepository getCustomerRepository(){
        return new HibernateCustomerRepositoryImpl();
    }*/
}
