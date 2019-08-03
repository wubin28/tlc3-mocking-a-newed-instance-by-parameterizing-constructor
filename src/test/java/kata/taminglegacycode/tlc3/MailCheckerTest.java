package kata.taminglegacycode.tlc3;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

public class MailCheckerTest {
    @Test
    public void should_return_number_of_new_mails() {
        MailReceiver mockMailReceiver = mock(MailReceiver.class);
        List<Mail> newMails = Arrays.asList(new Mail(), new Mail());
        given(mockMailReceiver.newMails()).willReturn(newMails);
        MailChecker mailChecker = new MailChecker(10, mockMailReceiver);

        assertThat(mailChecker.numberOfNewMails(), is(2));
    }
}
