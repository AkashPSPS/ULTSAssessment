package service;

import org.example.repository.OrderRepository;
import org.example.service.OrderService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)

public class OrderServiceTest {

    @InjectMocks
    OrderService orderService;

    @Mock
    OrderRepository orderRepository;

    @Test
    public void testOrderService() {
        Order order = new Order("jv",);
        Mockito.when(orderRepository.saveAll()).thenReturn(order);
        Assertions.assertNotNull();
    }

}
