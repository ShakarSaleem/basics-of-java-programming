package advanced_programming;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server_Class {
	public static void main(String args[]) throws IOException {
		ServerSocket sc = new ServerSocket(1342);
		int number, temp;

		// accept the incoming request the accept
		Socket sk = sc.accept();
		// Accept the number client puts in
		Scanner keyboard = new Scanner(sk.getInputStream());

		// below line accept the number the client inputs
		number = keyboard.nextInt();

		// Modified success below
		temp = number * 2 + 659 - 963 * 963 / 5 + 95;

		PrintStream p = new PrintStream(sk.getOutputStream());
		p.println(temp);

		keyboard.close();
		sk.close();
		sc.close();
	}
}
// first run the server then the client.