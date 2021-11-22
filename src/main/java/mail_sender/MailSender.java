package mail_sender;

public class MailSender {
    public static void sendMail(MailInfo info){
        System.out.println(info.getMailText()+"\n"+"Status: sent to "+info.getEmail());
    }
}
