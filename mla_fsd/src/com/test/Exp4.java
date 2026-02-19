package com.test;

//Exception handling
public class Exp4 {

	public static void main(String[] args) {
		
		System.out.println("MLA");
//		System.out.println(11/0); // arithmetic exception
		System.out.println("coders");
		
//		String name = null; // null pointer 
//		System.out.println(name.charAt(1));
		int[] arr = {2,4,};
//		System.out.println(arr[3]); //Array index out of bound
		
//		int x = Integer.parseInt("22a3"); // number format
		
//		Class.forName("");
		
		try {
			System.out.println(11/0);
			String name = null;
			System.out.println();
			
		}
//		finally {
//			System.out.println("");
//		}
		catch(ArithmeticException ae) {
			System.exit(0);// completely exit without executing finally 
			return; // exit from the catch block and move to finally	
		}
//		System.out.println();
		catch (NullPointerException npe) {
		}
		catch (ArrayIndexOutOfBoundsException e) {	
		}
		catch (StringIndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		catch (Exception e) {
			System.out.println("Try again");
		}
//		System.out.println(); 
		finally {
			try {
				
			} catch (Exception e2) {
			}
		}
	}

}


//
//exception- userdefined
//		 - predefined- asynchronus(error)
//		 			 - Sysnchronus (exception)- checked (compile time)
//		 			 			   - unchecked(runtime exception)

//
//
//throwable lang.Trowable
//- error lang.error  - out of memory and stack over flow
//- exception  - io, sql. filenot found, class not found
//	- runtime - arithmetic, null pointer, inexoutof bound, illeagalargument