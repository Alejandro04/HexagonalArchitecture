package arquitectura.hexagonal.application;

import java.math.BigDecimal;
import java.util.UUID;

import arquitectura.hexagonal.domain.Orders;
import arquitectura.hexagonal.infra.inputport.OrderInputPort;
import arquitectura.hexagonal.infra.outputport.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderUserCase implements OrderInputPort {

    @Autowired
    EntityRepository entityRepository;

    @Override
    public Orders createOrder(String customerId, BigDecimal total) {
        Orders order = Orders.builder()
                .id( UUID.randomUUID().toString() )
                .customerId( customerId )
                .total( total )
                .build();

        return entityRepository.save( order );
    }

}