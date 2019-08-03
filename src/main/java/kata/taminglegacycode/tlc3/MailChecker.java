package kata.taminglegacycode.tlc3;

public class MailChecker {
    private final MailReceiver receiver;
    private final int checkPeriodSeconds;

    public MailChecker(int checkPeriodSeconds) {
        this(checkPeriodSeconds, new MailReceiver());
    }

    public MailChecker(int checkPeriodSeconds, MailReceiver receiver) {
        this.receiver = receiver;
        this.checkPeriodSeconds = checkPeriodSeconds;
    }

    public int numberOfNewMails() {
        return receiver.newMails().size();
    }
}
