
import java.io.IOException;
import java.util.Scanner;
class ChatBot
{
    protected String chatbotresponse(String userinput)
    {
        if(userinput.equalsIgnoreCase("hello")|| userinput.equalsIgnoreCase("hi"))
        {
            return "Hello,I am Alex.How may I help you?";
        }
        else if(userinput.equalsIgnoreCase("hello,how are you?")||userinput.equalsIgnoreCase("how are you?"))
        {
            return "Hello, I am good. How are you? And how may I help you?";
        }
        else if(userinput.equalsIgnoreCase("I am also fine")||userinput.equalsIgnoreCase("I am also good"))
        {
            return "Good to hear.";
        }
        else if(userinput.equalsIgnoreCase("how is today's day?")||userinput.equalsIgnoreCase("what is today's weather?"))
        {
            return "Today is a good day.";
        }
        else if(userinput.equalsIgnoreCase("who are you?")||userinput.equalsIgnoreCase("tell me something about you"))
        {
            return "Hello I am Alex, your friend. Tell me how can I help you?";
        }
        else if(userinput.equalsIgnoreCase("open notepad"))
        {
            Runtime rs = Runtime.getRuntime();
            try
            {
                rs.exec("notepad");
                System.out.println("Notepad openend successfully");
            }
            catch (IOException e)
            {
                System.out.println(e);
            }
            return "";
        }
        else
        {
            return "Invalid question. How may I help you?";
        }
    }

}
public class Main{
    public static void main(String[] args) {
        String input = new String();
        Scanner sc=new Scanner(System.in);
        ChatBot callchatbot = new ChatBot();
        System.out.println("ChatBot: Hi! I am Alex, your assistant. How may I help you?");
        while(true) {
            System.out.print("You: ");
            input = sc.nextLine();
            if (input.equals("exit")) {
                System.out.println("Chatbot: Goodbye! Have a great day!");
                break;
            }
            else {
                String answer = callchatbot.chatbotresponse(input);
                System.out.println("Chatbot: " + answer);
            }
        }
    }
}