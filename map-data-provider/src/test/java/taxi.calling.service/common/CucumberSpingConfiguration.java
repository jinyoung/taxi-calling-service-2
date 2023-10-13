package taxi.calling.service.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import taxi.calling.service.MapDataProviderApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { MapDataProviderApplication.class })
public class CucumberSpingConfiguration {}
