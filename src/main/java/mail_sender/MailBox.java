package mail_sender;

import java.util.ArrayList;

public class MailBox {
    ArrayList<MailInfo> infos;
    public void addMailInfo (MailInfo info){
        infos.add(info);
    }
    public void sendAll(){
        for(MailInfo info : infos){
            MailSender.sendMail(info);
        }
    }
}
