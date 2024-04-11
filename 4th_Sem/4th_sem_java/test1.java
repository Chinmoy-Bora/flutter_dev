import java.io.*;
public class test1
{
	public void apply()throws  IOException
	{
		FileOutputStream file = new FileOutputStream( "Data_out.txt");
		DataOutputStream dos = new DataOutputStream(file);
		dos.write(65);
		dos.flush();
		dos.close();
	}

	public static void main(String[] args)throws IOException
	{
		test1 t = new test1();
		t.apply();
	}
}
