# Programming-Challenges-Solutions
Chapter 8 Starting out with something..
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8;

import java.util.Scanner;

/**
 *
 * @author Niilma M.
 */
import java.util.Scanner;
public class LandTract {
    private int lenght;
    private int width;
    
    //Constructor
    public LandTract(int length, int width)
    {
        this.lenght=length;
        this.width=width;
    }
    
    //GETTERS
    public int getlength()
    {
        return lenght;
    }
    public int getWidth()
    {
        return width;
    }
    
    //SETTERS
    public void setLength(int l)
    {
        this.lenght=l;
    }
    public void setWidth(int w)
    {
        this.width=w;
    }
    
    //FUNCTIONS
    public int getTractArea()
    {
        return lenght*width;//ugh misspelled length but too late to refactor lazy
    }
    
    public void getEquals(LandTract a)
    {
        if(this.getTractArea()==a.getTractArea())
        {
            System.out.println("The areas are equal");
        }
        else
        {
            System.out.println("The areas are not equal");
        }
    }
    //FUNCTIONS
    public String toString()
    {
        String str = "The area of the land is : "+ getTractArea() + " square kilometres. "
                + "\n" ;
                
        return str;
    }
      public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the land for Chicago");
        System.out.print("Enter the width : ");
        int w = input.nextInt();
        System.out.print("Enter the height : ");
        int h = input.nextInt();
        LandTract Chicago = new LandTract(w,h);
        
        System.out.println();
        System.out.println("Enter the land for Niles");
        System.out.print("Enter the width : ");
        int w2 = input.nextInt();
        System.out.print("Enter the height : ");
        int h2 = input.nextInt();
        LandTract Niles = new LandTract(w2,h2);
        System.out.println();
        //Get Area
        
        Chicago.getTractArea();
        Niles.getTractArea();
        System.out.print(Chicago);
        System.out.print(Niles);
        
        //IF THEY ARE EQUAL
        Chicago.getEquals(Niles);
                
        
    }
}
