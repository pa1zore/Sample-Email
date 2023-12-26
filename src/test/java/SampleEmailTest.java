import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SampleEmailTest {
    Email email ;
    @BeforeEach
     void setup()
    {
        email = new Email(" ");
    }
    @AfterAll
   static void end()
        {
            System.out.println("all test run successfully");
    }

    // to send parameters one bye one
    //sending one by one parameters to testcases and printing results

    //test for weight only
     @CsvSource(value = {"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"})
    @ParameterizedTest
    void should_return_true_after_giving_all_valid_emails (String useremail)
     {
         //given
         email=new Email(useremail);
         //when
         boolean actual =email.isEmail();
         //then
         Assertions.assertTrue(actual);

     }
    @CsvSource(value = {"abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",".abc@abc.com","abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com","abc.@gmail.com","abc@gmail.com.aa.au","abc@gmail.com.1a"})
    @ParameterizedTest
    void should_return_false_after_giving_all_valid_emails (String useremail)
    {
        //given
        email=new Email(useremail);
        //when
        boolean actual =email.isEmail();
        //then
        Assertions.assertFalse(actual);

    }
}
