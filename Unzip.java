import java.io.*;
import java.util.*;
class Unzip
{
	public  static void main(String args[])
	{
		String zipfilepath = "z://SS.zip";
		String destination = "F://";
		UnzipUtility2 unziper = new UnzipUtility2();
		try
		{
			unziper.unzip(zipfilepath,destination);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}