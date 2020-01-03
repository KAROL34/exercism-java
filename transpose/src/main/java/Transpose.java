import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

/*
Given an input text output it transposed.

Roughly explained, the transpose of a matrix:

ABC
DEF
is given by:
AD
BE
CF

 */
public class Transpose {
    public String transpose(String input) {
        String output=new String();
        List<String> listaNew=new ArrayList<>();


       String[] stringsArray=input.split("\n");
        int rows=stringsArray.length;
        int columns = Collections.max(Arrays.asList(stringsArray), Comparator.comparing(String::length)).length(); // or s -> s.length()
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){

            }
        }

    }

    public static void main(String[] args) {
        Transpose transpos=new Transpose();
        System.out.println(transpos.transpose("A1"));

    }

}
