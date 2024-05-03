package controlFlowStatements;

public class JavaComments {

	public static void main(String[] args) {
//		Single Line comments
		System.out.println("//Single Line Comments");
		System.out.println("---------------------------------------------------------");

//		Multiline Comments
		System.out.println("/*This is the book\n Good to go for \n multiline comments */");

//		Doc Comments
		System.out.println("---------------------------------------------------------");
		System.out.println("Doc comments");
		System.out.println("/**\n * @author Anurati \n* @version 16.0 \n* @since 2021-07-06 \n*/");

		System.out.println("---------------------------------------------------------");
		System.out.println("Bellow commented line also executed");
//		 \u000d System.out.println("Java comment is executed!!");

//		The above code generate the output because the compiler parses the Unicode 
//		character \u000d // as a new line before the lexical transformation,

		System.out.println("---------------------------------------------------------");
//		 the below comment will be executed
//		
		System.out.println("Java comment is executed!!");
	}
}