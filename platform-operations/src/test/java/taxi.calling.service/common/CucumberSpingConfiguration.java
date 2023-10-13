package taxi.calling.service.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import taxi.calling.service.PlatformOperationsApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { PlatformOperationsApplication.class })
public class CucumberSpingConfiguration {}
