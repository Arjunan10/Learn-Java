package printfnew;

public class PrintF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a =500000;
double d = 345.5;
boolean isRunning = true;
String name = "Hafi";
char c ='#';

// printf is optional method to format,control,display to console
//it has two arguments,one has print and (object/variablprecision)
//width,conversion-char,flags,precision


System.out.printf("Iam %s",name);
System.out.println();
System.out.printf("Int Value : %,d",a);
System.out.println();
System.out.printf("Double Value: %.2f",d);
System.out.println();
System.out.printf("my sign: %c",c);
System.out.println();
System.out.printf("is it Running = %b",isRunning);

	
	}

}
