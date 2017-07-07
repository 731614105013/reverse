# reverse
import java.io.*;
import java.util.*;
import java.lang.*;
public class Reverse
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String a="gomathi";
    char[] s=a.toCharArray();
    for(int i=s.length-1;i>=0;--i)
    {
      System.out.println(""+s[i]);
    }
  }
  }
