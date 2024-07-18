package arquitectura.hexagonal.infra.inputport;

import arquitectura.hexagonal.domain.Orders;

import java.math.BigDecimal;


public interface OrderInputPort {
    public Orders createOrder(String customerId, BigDecimal total );
}