package de.thunderfrog;

import java.lang.reflect.Array;

public class ArrayHelper<T> {
    /*
     *  Generic ArrayHelper Class
     */

    // Array Größe ausgeben
    public int size(T[] array) {
        return array.length;
    }

    // Array Größe verändern
    public <T> T[] resize(Class<T> datatype, T[] array, int diff) {
        // Array um diff vergrößern
        T[] newArray = (T[]) Array.newInstance(datatype,(array.length + diff));

        // Bestehende Elemente übertragen
        for(int i = 0; i < (diff < 0 ? newArray.length : array.length); i++){
            newArray[i] = array[i];
        }
        array = newArray;
        return array;
    }

    // Array Element hinzufügen
    public <T> T[] add(Class<T> datatype,T[] array, Object element) {

        // Array um 1 vergrößern
        array = resize(datatype,array,1);

        // Neues Element als letztes eintragen
        array[array.length - 1] = (T)element;
        return array;
    }

    // ARRAY GET ELEMENT
    public <T> T get(T[] array, int position){
        return array[position];
    }

    // ARRAY SET ELEMENT
    public <T> T[] set(T[] array,int index, Object wert) {
        // Das Element an der Stelle index
        // soll auf den Wert wert gesetzt werden
        array[index] = (T)wert;
        return array;
    }

    // ARRAY ELEMENT LÖSCHEN
    public <T> T[] remove(Class<T> datatype,T[] array, int index) {
        // Das Element am Index soll gelöscht werden:
        // 1. Alle Elemente davor sollen erhalten bleiben
        // 2. Alle Elemente dahinter sollen erhalten bleiben
        // und der Index 1 kleiner werden
        for(int i = index + 1; i < array.length; i++) {
            array[i-1] = array[i];
        }
        //3. Das Array soll um eins kleiner sein
        return resize(datatype,array,-1);
    }

    // ARRAY INDEXOF ELEMENT
    public int indexOf(T[]array, T element){
        for(int i=0; i < size(array);i++) {
            if(get(array,i).equals(element)) {
                return i;
            }
        }
        return -1;
    }


    // ARRAY AUSGABE
    public void ausgabe(T[] array) {
        String rueckgabe = "";
        for(int i = 0; i < array.length; i++) {
            if(i == array.length - 1) {
                rueckgabe = rueckgabe + array[i];
            } else {
                rueckgabe = rueckgabe + array[i] + ",";
            }
        }
        System.out.println(rueckgabe);
    }


}
