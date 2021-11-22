package mail_sender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    Client client;
    @BeforeEach
    void setUp() {
        client = new Client();
        client.setAge(12);
        client.setEmail("sasha1tsepilova@gmail.com");
        client.setName("sasha");
        client.setSex(Gender.FEMALE);
    }

    @Test
    void getName() {
        assertEquals(client.getName(),"sasha");
    }

    @Test
    void getAge() {
        assertEquals(client.getAge(),12);
    }

    @Test
    void getId() {
        assertEquals(client.getId(),4);
    }

    @Test
    void getSex() {
        assertEquals(client.getSex(),Gender.FEMALE);
    }

    @Test
    void getEmail() {
        assertEquals(client.getEmail(),"sasha1tsepilova@gmail.com");
    }
}