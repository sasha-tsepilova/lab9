package mail_sender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailInfoTest {
    MailInfo mailInfo;
    @BeforeEach
    void setUp() {
        Client client = new Client();
        client.setAge(12);
        client.setEmail("sasha1tsepilova@gmail.com");
        client.setName("sasha");
        client.setSex(Gender.FEMALE);
        MailCode mailCode = MailCode.SALE;
        mailInfo = new MailInfo();
        mailInfo.setClient(client);
        mailInfo.setMailCode(mailCode);
    }
    @Test
    void getMailText() {
        assertEquals(mailInfo.getMailText(), "Sale only for you, sasha!\n");
    }

    @Test
    void getEmail() {
        assertEquals(mailInfo.getEmail(),"sasha1tsepilova@gmail.com" );
    }
}