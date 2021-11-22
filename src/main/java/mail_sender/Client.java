package mail_sender;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Client {
    private String name;
    private int age;
    private int id;
    private Gender sex;
    private String email;

    public Client(){
        id = ClientIDGenerator.generateId();
    }

    private static class ClientIDGenerator {
        private static int counter = 0;
        public static int generateId(){
            counter++;
            return counter;
        }
    }
}
