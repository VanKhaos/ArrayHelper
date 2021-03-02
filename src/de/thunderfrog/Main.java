package de.thunderfrog;


import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        // TEST ARRAY
        String[] myArray = {"Müller", "Brauer", "Schulze", "Brauer", "Huber", "Meier" ,"Brauer"};

        // KLASSEN AUFRUF
        ArrayHelper<Object> arrayHelper = new ArrayHelper<>();

        System.out.println("Einfache Ausgabe");
        // ARRAY AUSGABE
        arrayHelper.ausgabe(myArray);
        System.out.println(arrayHelper.size(myArray));

        System.out.println();
        System.out.println("VERGRÖßERN");
        // ARRAY VERGRÖßERN
        myArray = arrayHelper.resize(String.class,myArray,0);
        arrayHelper.ausgabe(myArray);
        System.out.println(arrayHelper.size(myArray));


        System.out.println();
        System.out.println("VERKLEINERN");
        // ARRAY VERKLEINERN
        myArray = arrayHelper.resize(String.class,myArray,-3);
        arrayHelper.ausgabe(myArray);
        System.out.println(arrayHelper.size(myArray));


        System.out.println();
        System.out.println("HINZUFÜGEN");
        // ARRAY ELEMENT HINZUFÜGEN
        myArray = arrayHelper.add(String.class,myArray,"Test");
        arrayHelper.ausgabe(myArray);
        System.out.println(arrayHelper.size(myArray));


        System.out.println();
        System.out.println("ÄNDERN");
        // ARRAY WERT ÄNDERN
        myArray = arrayHelper.set(myArray,0,"Test2");
        arrayHelper.ausgabe(myArray);
        System.out.println(arrayHelper.size(myArray));

        System.out.println();
        System.out.println("LÖSCHEN");
        // ARRAY WERT LÖSCHEN
        myArray = arrayHelper.remove(String.class,myArray,0);
        arrayHelper.ausgabe(myArray);
        System.out.println(arrayHelper.size(myArray));

        System.out.println();
        System.out.println("EINZELNER WERT");
        // ARRAY EINZELNER WERT
        String arryString = arrayHelper.get(myArray,2);
        System.out.println(arryString);
    }
}
