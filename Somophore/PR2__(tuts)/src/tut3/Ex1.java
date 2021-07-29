package tut3;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import utils.TextIO;

public class Ex1 {
 public static void main(String[] args) {
 // program text
 String progText = "class Hello { "
                 + "public static void main (String[] args) { "
//* by removing the word "main"	-> run error due to the lack of "<IDENTIFIER>"	 
                 + " System.out.println(\"Hello world!\"); "
                 + "} "
                 + "}";  
 //* by removing the semi-colon -> Syntax error -> Run error -> can't output the standard Java source code text.
                

 // parse the program text
         CompilationUnit codeUnit = JavaParser.parse(progText);

 // obtain the generated source code
         TextIO.putln(codeUnit);
 }
}
