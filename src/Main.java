import com.sun.net.httpserver.HttpServer;
import java.io.*;
import java.net.InetSocketAddress;

public class Main {

    public static void main(String[] args) throws IOException {

        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        server.createContext("/", exchange -> {

            File file = new File("quotes.html");

            if (!file.exists()) {
                String error = "quotes.html not found!";
                exchange.sendResponseHeaders(404, error.length());
                OutputStream os = exchange.getResponseBody();
                os.write(error.getBytes());
                os.close();
                return;
            }

            FileInputStream fis = new FileInputStream(file);
            byte[] responseBytes = fis.readAllBytes();
            fis.close();

            exchange.getResponseHeaders().set("Content-Type", "text/html");
            exchange.sendResponseHeaders(200, responseBytes.length);

            OutputStream os = exchange.getResponseBody();
            os.write(responseBytes);
            os.close();
        });

        server.start();
        System.out.println("Server running at http://localhost:8000");
    }
}
