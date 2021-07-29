package tut3;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import utils.TextIO;

public class ProgWriter {
	public static void main(String[] args) {
		String Template =   "public class  _ClassName_  { \n"
                          + "public static void main (String[] args) { \n"
                          + " System.out.println( _Greeting_); \n"
                          + "} \n"
                          + "}"; 
		
 // input className from user
        TextIO.putln("ClassName: ");
		String className = TextIO.getln();		
 // input greeting from user
		TextIO.putln("Greeting: ");
		String greeting = TextIO.getln(); 
		
 // replace placeholders from Template
		String prog = Template.replace("_ClassName_", className); 
		String progText = prog.replace("_Greeting_", greeting); 
 // parse the program text
        CompilationUnit codeUnit = JavaParser.parse(progText);

// obtain the generated source code
        System.out.println(codeUnit);
		
				
	}
}

