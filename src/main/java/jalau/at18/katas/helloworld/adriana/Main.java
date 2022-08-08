package jalau.at18.katas.helloworld.adriana;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Input message:");
        String message = readMessage();
        System.out.println(message);
    }

    private static String readMessage () throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(inputStreamReader);
		String cadena = reader.readLine();
		return cadena;
	}
}
