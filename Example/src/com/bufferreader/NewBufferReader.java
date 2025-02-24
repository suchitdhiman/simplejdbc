package com.bufferreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewBufferReader {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Something: ");
        String line = br.readLine();
        System.out.println(line);
        
        
	}

}
