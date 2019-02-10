package com.javarush;

public class Artifact {
    //напишите ваш код здесь
    int num;
    String culture;
    int century;

    private Artifact(){}

    public Artifact(int num){
        this.num = num;
    }

    public Artifact(int num, String culture){
        this.num = num;
        this.culture = culture;
    }

    public Artifact(int num, String culture, int century){
        this.num = num;
        this.culture = culture;
        this.century = century;
    }

    public Artifact(String culture, int century){
        this.culture = culture;
        this.century = century;
    }


    public static void main(String[] args) {
        //напишите ваш код здесь
        Artifact numberOne = new Artifact(34567);
        Artifact numberTwo = new Artifact(1234, "Maya");
        Artifact numberThree = new Artifact(456, "Rome", 3);
        Artifact numberFour = new Artifact("Viking", 9);
        Artifact numberFive = new Artifact(8901);


        System.out.println("Artifact One: serial number " + numberOne.num);
        System.out.println("Artifact Two: serial number " + numberTwo.num + ", culture " + numberTwo.culture);
        System.out.println("Artifact Tree: serial number " + numberThree.num + ", culture " + numberThree.culture + ", century " + numberThree.century);
        System.out.println("Artifact Four: culture " + numberFour.culture + ", century " + numberFour.century);
        System.out.println("Artifact Five: serial number " + numberFive.num+ ", century " + numberFive.century);

        System.out.println("Artifact numberOne: serial number " + numberOne.num + ", culture " + numberOne.culture + ", century " + numberOne.century);
        System.out.println("Artifact numberTwo: serial number " + numberTwo.num + ", culture " + numberTwo.culture + ", century " + numberTwo.century);
        System.out.println("Artifact Tree: serial number " + numberThree.num + ", culture " + numberThree.culture + ", century " + numberThree.century);
        System.out.println("Artifact numberFour: serial number " + numberFour.num + ", culture " + numberFour.culture + ", century " + numberFour.century);

    }
}
