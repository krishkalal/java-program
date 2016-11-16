import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
 
public class UnzipUtility
{
	public static final int BufferSize = 4096;
	public void unzip(String filepath,String destination) throws Exception
	{
		File desdir = new File(destination);
		if(!desdir.exists())
		{
			desdir.mkdir();
		}
		ZipInputStream zipin = new ZipInputStream(new FileInputStream(filepath));
		ZipEntry entry = zipin.getNextEntry();
		while(entry!=null)
		{
			String path = destination + File.separator + entry.getName();
			if(!entry.isDirectory())
			{
				extractFile(zipin,path);
			}
			else
			{
				File dir = new File(path);
				dir.mkdir();
			}
			zipin.closeEntry();
			entry = zipin.getNextEntry();
		}
		zipin.close();
	}
	public void extractFile(ZipInputStream zipin,String path) throws Exception
	{
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path));
		byte[] by = new byte[BufferSize];
		int read = 0;
		while((read = zipin.read(by)) != -1)
		{
			bos.write(by,0,read);
		}
		bos.close();
	}
}