import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.io.IOException;

public class Handler implements RequestHandler<String, String> {

    public String handleRequest(String s, Context context) {
        try {
            if(s.equals("list")) {
                return Exchange.getList();
            }else{
                return Exchange.getExchange();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Error";
    }
}
