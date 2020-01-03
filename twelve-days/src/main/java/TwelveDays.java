

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.

On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.

On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.
 */
class TwelveDays {
    final List<String> listPhrase=new ArrayList<String>(Arrays.asList("Drummers Drumming","Pipers Piping","Lords-a-Leaping","Ladies Dancing","Maids-a-Milking","Swans-a-Swimming","Geese-a-Laying","Gold Rings","Calling Birds","French Hens","Turtle Doves","Partridge in a Pear Tree"));
    final List<String> listOrderCounter=new ArrayList<String>(Arrays.asList("twelveth ","eleventh ","tenth ", "ninth ","eighth ","seventh ","fifth ","fourth","third ","second ","first " ));
    final List<String> listSeq=new ArrayList<String>(Arrays.asList("twelve ","eleven ","ten ", "nine ","eight ","seven ","five ","four","three ","two ","a " ));
    StringBuilder stringBuilder=new StringBuilder();
    final String beggging="On the ";
    final String middle="day of Christmas my true love gave to me: ";
    String verse(int verseNumber) {
        Collections.reverse(listSeq);
        Collections.reverse(listOrderCounter);
        Collections.reverse(listPhrase);
        if (verseNumber==1){
            stringBuilder.append(beggging).append(listOrderCounter.get(0)).append(middle).append(listSeq.get(0)).append(".");
        for (int i=1;i<=verseNumber-1;i++){


                stringBuilder.append(beggging).append(listOrderCounter.get(i)).append(middle).append(listSeq.get(i)).append(".");

        }
    }

    String verses(int startVerse, int endVerse) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
    
    String sing() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
