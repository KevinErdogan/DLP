package com.paracamplus.ilp1.ilp1tme1;

import java.io.File;
import java.io.IOException;

import com.paracamplus.ilp1.interpreter.interfaces.EvaluationException;
import com.paracamplus.ilp1.interpreter.test.InterpreterTest;
import com.paracamplus.ilp1.parser.ParseException;

public class FileInterpreter extends InterpreterTest {

	public FileInterpreter(File file) {
		super(file);
	}

	public static void main(String[] args) {
		try {
			new FileInterpreter(new File(args[0])).processFile();
		} catch (ParseException | IOException | EvaluationException e) {
			e.printStackTrace();
		}
	}
}
