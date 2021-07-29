

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import utils.TextIO;

public class ProgWriter {
	public static void main(String[] args) {
		String Template =   "public class  _ClassName_  { "
                          + "public static void main (String[] args) { "
                          + " System.out.println( _Greeting_); "
                          + "} "
                          + "}"; 

 // input className from user
		String className = TextIO.getln();		
 // input greeting from user
		String greeting = TextIO.getln(); 
		
 // replace placeholders from Template
		String prog = Template.replace("_ClassName_", className); 
		String progText = prog.replace("_Greeting_", greeting); 
 // parse the program text
        CompilationUnit codeUnit = JavaParser.parse(progText);

// obtain the generated source code
        TextIO.putln(codeUnit);
		
				
	}
}

