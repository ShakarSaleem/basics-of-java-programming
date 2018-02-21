package advanced_programming;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Network_Client_programming {

	public static void main(String args[]) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int number, temp;

		// simple socket
		Socket socket = new Socket("127.0.0.1", 1342);
		Scanner Keyboard1 = new Scanner(socket.getInputStream());
		System.out.println("enter here:");
		number = keyboard.nextInt();

		// pass on num to server
		PrintStream p = new PrintStream(socket.getOutputStream());

		// use above to pass num to server
		p.println(number);

		// accept result from server
		temp = Keyboard1.nextInt();
		System.out.println(temp);

		keyboard.close();
		socket.close();
		Keyboard1.close();
	}

}
