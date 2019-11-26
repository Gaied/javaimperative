package Projet01;

import java.util.Scanner;

public class Programme {

public static void main(String[] args) {
// TODO Auto-generated method stub
Programme op = new Programme();
/* op.atelier2();
op.atelier3();
op.atelier4();
op.atelier5();
op.atelier6();
op.atelier7();
op.atelier8();
op.atelier9();*/
op.atelier10();
}

public void atelier2() {

int nombre = 7;
float f = 1.1f;
double d = 1.111;
byte b = (byte) -111111;
short s = -2722;

String str = "test";

System.out.println(
"int:" + nombre + "float :" + f + "double :" + d + "byte :" + b + "short :" + s + "String :" + s);

}

public void atelier3() {

Scanner sc = new Scanner(System.in);
System.out.println("Veuillez rentrer votre nom");
String s = sc.nextLine();
System.out.println("votre nom est :" + s);

System.out.println("Veuillez rentrer votre prénom");
String s1 = sc.nextLine();
System.out.println("Votre prénom est :" + s1);

System.out.println("Veuillez rentrer votre âge");
String s2 = sc.nextLine();

System.out.println("Votre âge est :" + s1 + " ans");

}

public void atelier4() {
Scanner sc = new Scanner(System.in);
System.out.println("Veuiller rentrer un nombre a");
int a = sc.nextInt();
System.out.println("Veuiller rentrer une nombre b ");
int b = sc.nextInt();

System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
if (b != 0) {
System.out.println(a / b);
System.out.println(a % b);
System.out.println(a + b - a / b);
System.out.println(a + (b - a) / b);
}

boolean test = a == b;
System.out.println("a==b :" + test);
test = a != b;
System.out.println("a!=b :" + test);
test = a > b;
System.out.println("a>b :" + test);
test = a >= b;
System.out.println("a>=b :" + test);
test = a < b;
System.out.println("a<b :" + test);
test = a <= b;
System.out.println("a<=b :" + test);

boolean c = true, d = false;

boolean z = (c && d);
System.out.println("c && d :" + z);

z = (c || d);
System.out.println("c || d :" + z);

z = !c;
System.out.println("!c :" + z);

}

public void atelier5() {

byte a = 127;
short b = 32767;
// a = b;
System.out.println(a);
}

public void atelier6() {

String s = "Chaine de charactère";
String s2 = new String("Une autre chaine de charactère");
String s3 = new String("une chaine de charactère");
String s4 = "Chaine de charactère";

if (s.equals(s2))
System.out.println("égalité parfaite");
else {

System.out.println("égalité non parfaite");
}

String str = s2.toUpperCase();
System.out.println(str);

int in = s2.length();

System.out.println(in);

int tt = s2.indexOf("c");
System.out.println(tt);

}

public void atelier7() {
int a =27;
int b = 22;

System.out.println(Math.min(a, b));
System.out.println(Math.max(a, b));
System.out.println(Math.abs(a));
System.out.println(Math.random());
}

public void atelier8() {

boolean a = true;
boolean b = false;

byte c = 1;
byte d = 2;

if (a == true) {
System.out.println(" la variable a est vraie");
}else {
System.out.println("la valeur de a est false");
}

if (b== true) {
System.out.println("la valeur de b est vraie");
}else {
System.out.println("la valeur de b est false");
}

    if (c != d) {
    if (c == 1) {
    System.out.println("C est égale à 1");
    }
    if (d == 2) {
    System.out.println("d est égale à deux");
    }
    else {
    
    System.out.println(" c est different de d");
    }
    
    }
         
}

public void atelier9() {
	 int count = 1;
     while (count < 6) {
         System.out.println("Count is: " + count);
         count++;
}
     int x = 10;
     do {
       System.out.print("value of x : " + x + "\n");
       x++;
     }while( x < 1 );
     
  // print numbers from 10 to 19
     for(int y = 10; y < 20; y = y + 1) {
       System.out.print("value of y : " + y );
       System.out.print("\n");
     }
}

public void atelier10() {
	
	String [] T = new String[] {"Pikachu", "Salamèche", "Bulbizarre", "Carapuce", "Racaillou"};
	
	for (String t : T) {
		 
        System.out.println(t);

    }
}

public void atelier11() {
	
}


}