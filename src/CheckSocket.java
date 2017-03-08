import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by gedeiswara on 3/8/2017.
 */
public class CheckSocket {
    static boolean isPort(String hostname, int PortNumber) {
        boolean res = true;
        try {
            InetSocketAddress isa = new InetSocketAddress(hostname, PortNumber);
            Socket sock = new Socket();
            sock.connect(isa, 500);
            System.out.println("Port " + PortNumber + " at " + hostname + " is up");
        } catch (Exception e) {
            if (PortNumber > 65535) {
                System.out.println("Port Number cannot be greater than 65535");
            } else {
                res = false;
                System.out.println("Port " + PortNumber + " at " + hostname + " is down / not reachable");
            }

        }
        return (res);
    }
}
