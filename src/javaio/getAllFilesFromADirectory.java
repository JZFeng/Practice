package javaio;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.LinkedList;

public class getAllFilesFromADirectory
{
    public static void main(String args[]) throws Exception
    { // 所有异常抛出
        File file = new File("zip"); // 定义要压缩的文件
         getDirectory(file);
        // traverseFolder2("zip");

//        traverseFolder1("zip");
    }

    public static void getDirectory(File file)
    {
        File flist[] = file.listFiles();
        
        if (flist == null || flist.length == 0)
        {
            return;
        }
        
        for (File f : flist)
        {
            if (f.isDirectory())
            {
                // 这里将列出所有的文件夹
                System.out.println("Dir==>" + f.getAbsolutePath());
                getDirectory(f);
            }
            else
            {
                // 这里将列出所有的文件
                System.out.println("file==>" + f.getAbsolutePath());
            }
        }
    }

    public static void traverseFolder2(String path)
    {

        File file = new File(path);
        if (file.exists())
        {
            File[] files = file.listFiles();
            if (files.length == 0)
            {
                System.out.println("文件夹是空的!");
                return;
            }
            else
            {
                for (File file2 : files)
                {
                    if (file2.isDirectory())
                    {
                        System.out.println("文件夹:" + file2.getAbsolutePath());
                        traverseFolder2(file2.getAbsolutePath());
                    }
                    else
                    {
                        System.out.println("文件:" + file2.getAbsolutePath());
                    }
                }
            }
        }
        else
        {
            System.out.println("文件不存在!");
        }
    }

    public static void traverseFolder1(String path)
    {
        int fileNum = 0, folderNum = 0;
        File file = new File(path);
        if (file.exists())
        {
            LinkedList<File> list = new LinkedList<File>();
            File[] files = file.listFiles();
            for (File file2 : files)
            {
                if (file2.isDirectory())
                {
                    System.out.println("文件夹:" + file2.getAbsolutePath());
                    list.add(file2);
                    fileNum++;
                }
                else
                {
                    System.out.println("文件:" + file2.getAbsolutePath());
                    folderNum++;
                }
            }
            File temp_file;
            while (!list.isEmpty())
            {
                temp_file = list.removeFirst();
                files = temp_file.listFiles();
                for (File file2 : files)
                {
                    if (file2.isDirectory())
                    {
                        System.out.println("文件夹:" + file2.getAbsolutePath());
                        list.add(file2);
                        fileNum++;
                    }
                    else
                    {
                        System.out.println("文件:" + file2.getAbsolutePath());
                        folderNum++;
                    }
                }
            }
        }
        else
        {
            System.out.println("文件不存在!");
        }
        System.out.println("文件夹共有:" + folderNum + ",文件共有:" + fileNum);

    }
};