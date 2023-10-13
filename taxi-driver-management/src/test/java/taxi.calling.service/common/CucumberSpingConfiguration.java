package taxi.calling.service.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import taxi.calling.service.TaxiDriverManagementApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { TaxiDriverManagementApplication.class })
public class CucumberSpingConfiguration {}
