package com.techvidvan.exceptions;
public class UnCheckedExceptions
{
  public static void main(String args[])
  {
    //NullPointerException
    String myString = null; // null value
    try {
		System.out.println(myString.charAt(0));
	} catch (Exception e) {
//		e.printStackTrace();
	}
    finally {
		System.out.println("always called");
	}
  }
}