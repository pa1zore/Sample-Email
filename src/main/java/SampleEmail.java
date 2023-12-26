import java.sql.SQLOutput;

class Email
{
    String email;
  public   Email(String email)
    {
        this.email=email;
    }
    public boolean isEmail()
    {
      if(email.matches("^[a-z]+[-_.+]{0,1}[[0-9]*[a-z]*]+[@][[0-9]*[a-z]*]+.[a-z]+[a-z]+.[a-z]+[a-z]+$"))
        {
            System.out.println("valid email");
            return true;
        }
        else if (email.matches("^[a-z]+[-_.+]{0,1}[[0-9]*[a-z]*]+[@][[0-9]*[a-z]*]+.[a-z]+[a-z]+$")) {
            System.out.println("valid email");

            return true;

        }

        System.out.println(" Invalid email");

        return false;
    }
}
public class SampleEmail {
    public static void main(String[] args) {
        Email e= new Email("abc@abc@gmail.com");
        boolean k = e.isEmail();
        System.out.println(k);
    }

}
