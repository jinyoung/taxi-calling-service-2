package taxi.calling.service.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import taxi.calling.service.config.kafka.KafkaProcessor;
import taxi.calling.service.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    TaxiDriverRepository taxiDriverRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='CustomerRegistered'"
    )
    public void wheneverCustomerRegistered_CallTaxi(
        @Payload CustomerRegistered customerRegistered
    ) {
        CustomerRegistered event = customerRegistered;
        System.out.println(
            "\n\n##### listener CallTaxi : " + customerRegistered + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='TaxiDriverRegistered'"
    )
    public void wheneverTaxiDriverRegistered_StartTrip(
        @Payload TaxiDriverRegistered taxiDriverRegistered
    ) {
        TaxiDriverRegistered event = taxiDriverRegistered;
        System.out.println(
            "\n\n##### listener StartTrip : " + taxiDriverRegistered + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='CustomerInfoUpdated'"
    )
    public void wheneverCustomerInfoUpdated_MakePayment(
        @Payload CustomerInfoUpdated customerInfoUpdated
    ) {
        CustomerInfoUpdated event = customerInfoUpdated;
        System.out.println(
            "\n\n##### listener MakePayment : " + customerInfoUpdated + "\n\n"
        );
        // Sample Logic //

    }
}
//>>> Clean Arch / Inbound Adaptor
