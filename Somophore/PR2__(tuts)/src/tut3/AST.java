package tut3;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import t3.ast.ASTPrinter;
import utils.TextIO;

public class AST { 
 public static void main(String[] args) {
 // program text
 String progText = "class Hello { "
                 + "public static void main (String[] args) { "
                 + " System.out.println(\"Hello world!\"); "
                 + "} "
                 + "}";  
                
 // parse the program text
         CompilationUnit codeUnit = JavaParser.parse(progText);

 // obtain the generated source code
         TextIO.putln(codeUnit);
         
 //  print the abstract syntax tree (AST)         
         ASTPrinter.print(progText);
 }
}
