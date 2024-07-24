package arquitectura.hexagonal.infra.dummy;


import arquitectura.hexagonal.infra.publisher.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DummyService {

    @Autowired
    private Publisher publisher;

    public void sendToRabbit(String message) {
        System.out.println(message);
        this.publisher.send(message);
    }

}