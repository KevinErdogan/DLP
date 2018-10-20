package com.paracamplus.ilp1.ilp1tme1.test;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import com.paracamplus.ilp1.compiler.CompilationException;
import com.paracamplus.ilp1.compiler.test.CompilerRunner;
import com.paracamplus.ilp1.parser.ParseException;

public class CompilerTest extends com.paracamplus.ilp1.compiler.test.CompilerTest {

	protected static String[] samplesDirName = { "SamplesTME1" };
	protected static String pattern = "test[0-9]*";
	
	public CompilerTest(File file) {
		super(file);
	}
	
    @Parameters(name = "{0}")
    public static Collection<File[]> data() throws Exception {
    	return CompilerRunner.getFileList(samplesDirName, pattern);
    }    	
    
    @Test
    public void processFile() throws CompilationException, ParseException, IOException {
    	CompilerRunner run = new CompilerRunner();
    	configureRunner(run);
        run.checkPrintingAndResult(file, run.compileAndRun(file));	
    }

}
