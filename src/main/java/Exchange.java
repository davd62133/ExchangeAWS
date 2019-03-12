import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Exchange {
    static String hostList="http://apilayer.net/api/list?access_key=f79adf16a72ee1e28f86d0b6e1bc38d7";
    static String hostExchange="http://apilayer.net/api/live?access_key=f79adf16a72ee1e28f86d0b6e1bc38d7";

    public static String getList() throws IOException {
        return getInfo(hostList);
    }

    public static String getExchange() throws IOException {
        return getInfo(hostExchange);
    }

    public static String getInfo(String host) throws IOException {
        String info = "";

        URL oracle = new URL(host);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            info += inputLine;
        in.close();
        return info;
    }
}
