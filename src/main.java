/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class main {
   public static void main(String[] args)
   {
      Instructor myInstructor =
          new Instructor("Ilham", "Andrean", "AI18071");

      TextBook myTextBook =
          new TextBook("Jaringan Komputer",
                       "Edy Victor Haryanto", "Penerbit Andi");

      Course myCourse = 
         new Course("Computer Network", myInstructor,
                    myTextBook);

      System.out.println(myCourse);
   }
}

