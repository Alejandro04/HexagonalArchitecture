package arquitectura.hexagonal.infra.dummy;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("send")
public class DummyController {

    @Autowired
    private DummyService dummyService;

    @GetMapping
    public void testSendMessage() {
        String message = "Hello RabbitMQ";
        this.dummyService.sendToRabbit(message);
    }

}