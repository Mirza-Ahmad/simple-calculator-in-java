/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculatorjava;
/**
 *
 * @author M. Usama
 */
import java.util.*;
public class SimpleCalculatorJava 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      Scanner is=new Scanner(System.in);
      float num1,num2;
      char ch;
      float result;
      System.out.println("Enter a first number:");
      num1=is.nextFloat();
      System.out.println("Ente an operation:");
      ch=is.next().charAt(0);
      System.out.println("Enter a second number");
      num2=is.nextFloat();
      switch(ch)
      {
          case '+':
          {
          result=num1+num2;
          System.out.println("The sum is = "+ result);
          break;
          }
          case '-':
          {
          result=num1-num2;
          System.out.println("The minus is = "+ result);
          break;
          }
          case '*':
          {
          result=num1*num2;
          System.out.println("The multiplication is = " + result);
          break;
          }
          case '/':
          {
          result=num1/num2;
          System.out.println("The division is = " + result);
          break;
          }
          default:
          System.out.println("invlaid input");
    }
}
}
