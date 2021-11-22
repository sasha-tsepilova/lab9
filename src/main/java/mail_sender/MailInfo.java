package mail_sender;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Setter @Getter
public class MailInfo {
    private MailCode mailCode;
    private Client client;

    public String getMailText(){
        String text = mailCode.generateText();
        HashMap<String, String> templates= new HashMap<String, String>();
        templates.put("%NAME%", client.getName());
        templates.put("%AGE%", (new Integer(client.getAge())).toString());
        for(String key: templates.keySet()){
            text = text.replace(key, templates.get(key));
        }
        return text;
    }

    public String getEmail(){
        return client.getEmail();
    }
}
