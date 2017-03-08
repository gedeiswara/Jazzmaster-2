/**
 * Created by gedeiswara on 3/8/2017.
 */
class SocketUpDown {
    public static void main(String[] args) {
        
        try {
            boolean check = CheckSocket.isPort(args[0], Integer.parseInt(args[1]));
        } catch (Exception ex) {
            System.out.println("Please put the desired input");
        }

    }
}
