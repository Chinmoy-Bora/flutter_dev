import java.io.*;
class test {
public void apply() {
try ( DataInputStream din = new DataInputStream(System.in) ) {
FileOutputStream fos = new FileOutputStream("test.txt");
System.out.println("\n Write something to file... \n Enter '!' to end writing ");
char ch;
while ( (ch = (char)din.read() ) != '!' ) {
fos.write(ch);
}
fos.close( );
}
catch(Exception ex) {
System.out.println("error " + ex); }
}
public static void main ( String args[] ) {
test din_f_demo = new test ();
din_f_demo.apply(); }
}
