package com.paracamplus.ilp1.ilp1tme1.test;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import com.paracamplus.ilp1.interpreter.interfaces.EvaluationException;
import com.paracamplus.ilp1.interpreter.test.InterpreterRunner;
import com.paracamplus.ilp1.parser.ParseException;

public class InterpreterTest extends com.paracamplus.ilp1.interpreter.test.InterpreterTest{

	protected static String[] samplesDirName = { "SamplesTME1" }; 
    protected static String pattern = "test[0-9]*";
	
	public InterpreterTest(File file) {
		super(file);
	}
	
	@Test
    public void processFile() throws  ParseException, IOException, EvaluationException {
    	InterpreterRunner run = new InterpreterRunner();
    	configureRunner(run);
    	run.testFile(file);
    	run.checkPrintingAndResult(file);
    }
        
    @Parameters(name = "{0}")
    public static Collection<File[]> data() throws Exception {
    	return InterpreterRunner.getFileList(samplesDirName, pattern);
    }    	   

}
