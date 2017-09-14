import javax.websocket.OnMessage;
import javax.websocket.PongMessage;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.nio.ByteBuffer;

@ServerEndpoint("/topic/{id}")
public class WebsocketEndpointClient {

    @OnMessage
    public void textMessage(@PathParam("id") String id, Session
            session, String message) {
        System.out.println("Topic " + id + " - Text message: " + message);
    }
    @OnMessage
    public void binaryMessage(@PathParam ("id") String id, Session
            session, ByteBuffer message) {
        System.out.println("Topic " + id + " - Binary message: " +
                message.toString());
    }

    @OnMessage
    public void pongMessage(@PathParam ("id") String id, Session
            session, PongMessage message) {
        System.out.println("Topic " + id + " - Pong message: "
                + message.getApplicationData().toString());
    }
}