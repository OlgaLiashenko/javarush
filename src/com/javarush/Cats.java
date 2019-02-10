package com.javarush;

public class Cats {

    /*
  private static int catsCount = 0;
  public static void addNewCat() {
        Cats.catsCount = catsCount + 1;
    }  */


 /*
  private static int catsCount = 0;
  public static void setCatsCount(int catsCount) {
        Cats.catsCount = catsCount;
    }  */



    private String fullName;
    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        this.fullName = fullName;


    }

        public static void main(String[] args) {
           /* Cats cat = new Cats();
            cat.setName("Жужик", "S");
            System.out.println(cat.fullName);  */
        }
    }





