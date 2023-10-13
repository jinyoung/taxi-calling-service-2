package taxi.calling.service.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import taxi.calling.service.CustomerManagementApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { CustomerManagementApplication.class })
public class CucumberSpingConfiguration {}
