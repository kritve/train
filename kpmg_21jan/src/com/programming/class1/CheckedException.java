package com.programming.class1;

import java.io.*;

public class CheckedException {

	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		Reader r = new InputStreamReader(System.in);
		br = new BufferedReader(r);
		String str = null;
		try {
			do {
				System.out.println("Enter sth and i will read");
				str = br.readLine();
				System.out.println(str);
			} while (!str.equalsIgnoreCase("exit"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if(br!=null) {
				br.close();
			}
		}
	}
}
