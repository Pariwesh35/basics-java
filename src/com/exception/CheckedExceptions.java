package com.exception;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class CheckedExceptions
{
  public static void main(String args[])
  {
    File file = new File("/home/techvidvan/file.txt");
    try {
		FileReader fileReader = new FileReader(file);
	} catch (FileNotFoundException e) {
		System.out.println("plab B");
		e.printStackTrace();
	}
  }
}