package com.cricket.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.cricket.model.Match;

public class InputController {
	public static Queue<String> getInput() {
		String path = "C:\\Users\\home\\git\\cricket-console\\Ulaganayagi_kiruthika_BComCA\\src\\com\\cricket\\model\\input.txt";
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
			Queue<String> input = new LinkedList<>();
			String currentLine = bufferedReader.readLine();
			while (currentLine != null) {
				input.addAll(Arrays.asList(currentLine.split(",")));
				currentLine = bufferedReader.readLine();
			}
			bufferedReader.close();
			return input;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
