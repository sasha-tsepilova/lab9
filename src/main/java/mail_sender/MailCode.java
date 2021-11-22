package mail_sender;

import lombok.SneakyThrows;

import java.io.File;
import java.util.Scanner;

public enum MailCode {
    HAPPY_BIRTHDAY("./birthday.txt"), SALE("sale.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }
    @SneakyThrows
    public String generateText() {
        Scanner input = new Scanner(filename);
        File file = new File(input.nextLine());

        input = new Scanner(file);
        String line = "";

        while (input.hasNextLine()) {
            line += input.nextLine();
            line += "\n";
            System.out.println(line);
        }
        input.close();
        return line;
    }
}
