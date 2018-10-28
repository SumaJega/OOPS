import java.util.*;
import java.io.*;
class file
{
    public static void main(String args[])
    {
        File s=new File("file.java");
        long l=s.lastModified();
        Date d=new Date();
        if(s.exists())
        {
	    System.out.println("================================");
            System.out.println("FILE FOUND");
            System.out.println("FILE NAME: "+s.getName());
            System.out.println("FILE NAME READ : "+s.canRead());
            System.out.println("FILE NAME WRITE: "+s.canWrite());
            System.out.println("FILE DATE: "+d);
            System.out.println("FILE LENGTH: "+s.length());
            System.out.println("FILE PATH: "+s.getPath());
            System.out.println("FILE ABPATH: "+s.getAbsolutePath());
            System.out.println("FILE PARENT: "+s.getParent());
	    System.out.println("================================");
        }
        else
        {
            System.out.println("FILE NOT FOUND");
        }

    }
}    
