package javaio.zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class TestZip
{
    private static final int BUFFER_SIZE = 100;

    public static void main(String[] args)
    {
        if (args.length == 2)
        {
            File file = new File(args[0]);
            if (file.exists())
                file.delete();
            zip(new File(args[0]), new File(args[1]).listFiles());
        }
        else
        {
            System.err.println("Command Parameters Error!");
            System.out.println("usage testZip zip_target_name in_file_or_dir_name");
        }
    }

    public static void zip(File zipFile, File[] zippedFiles)
    {
        try
        {
            byte[] buffer = new byte[BUFFER_SIZE];
            FileOutputStream fs = new FileOutputStream(zipFile);
            ZipOutputStream zipOut = new ZipOutputStream(fs);

            for (int i = 0, n = zippedFiles.length; i < n; i++)
            {
                if (zippedFiles[i] == null || !zippedFiles[i].exists())
                    continue;
                if (zippedFiles[i].isDirectory())
                {
                    zip(zippedFiles[i].listFiles(), zipOut, buffer,
                        zippedFiles[i].getName());
                    continue;
                }
                ZipEntry zipAdd = new ZipEntry(zippedFiles[i].getName());
                zipAdd.setTime(zippedFiles[i].lastModified());
                zipOut.putNextEntry(zipAdd);

                FileInputStream in = new FileInputStream(zippedFiles[i]);
                while (true)
                {
                    int readSize = in.read(buffer, 0, buffer.length);
                    if (readSize < 0)
                    {
                        break;
                    }
                    zipOut.write(buffer, 0, readSize);
                }
                in.close();
            }
            zipOut.close();
            fs.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void zip(File[] zippedFiles, ZipOutputStream zipOut, byte[] buffer,
            String base) throws Exception
    {
        base = base + "/";
        for (int i = 0, n = zippedFiles.length; i < n; i++)
        {
            if (zippedFiles[i] == null || !zippedFiles[i].exists())
                continue;

            if (zippedFiles[i].isDirectory())
            {
                zip(zippedFiles[i].listFiles(), zipOut, buffer,
                    base + zippedFiles[i].getName());
                continue;
            }

            ZipEntry zipAdd = new ZipEntry(base + zippedFiles[i].getName());
            zipAdd.setTime(zippedFiles[i].lastModified());
            zipOut.putNextEntry(zipAdd);

            FileInputStream in = new FileInputStream(zippedFiles[i]);
            while (true)
            {
                int readSize = in.read(buffer, 0, buffer.length);
                if (readSize < 0)
                {
                    break;
                }
                zipOut.write(buffer, 0, readSize);
            }
            in.close();
        }
    }
}