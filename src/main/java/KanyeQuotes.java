
import java.util.Scanner;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;

public class KanyeQuotes
{
    public static void main( String[] args ) throws Exception
    {

        String host = "https://api.kanye.rest";

        String choice;

        do{
            HttpResponse<JsonNode> response = Unirest.get(host)
                    .asJson();
            System.out.println(response.getBody());
            System.out.println("Type \"next\" to get next quote or \"exit\" to...exit.");
            Scanner scan = new Scanner(System.in);
            choice = scan.nextLine();
        }
        while(choice.equals("next"));
        System.out.println("See you next time!");
    }
}