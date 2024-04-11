import java.io.*;
public class Buffered_Output_Stream_Demo {
public void apply() throws IOException {
FileOutputStream fout=new FileOutputStream("Buffered_file_out.txt");
BufferedOutputStream bout=new BufferedOutputStream(fout);
String s = "Jorhat Engineering College.";
byte b[] = s.getBytes();
bout.write(b); bout.flush(); bout.close();
fout.close();
System.out.println("\n\nData written successfully to file using BufferedOutputStream....\n\n"); }
public static void main (String args[]) throws Exception {
Buffered_Output_Stream_Demo bosf = new Buffered_Output_Stream_Demo();
bosf.apply(); }
}
