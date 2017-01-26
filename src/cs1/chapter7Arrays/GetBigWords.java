package cs1.chapter7Arrays;

/**
 * Created by jjenkins on 10/11/2016.
 * Write a static method, getBigWords, that gets a
 * String parameter and returns an array whose elements are the
 * words in the parameter that contain more than 5 letters. (A word is defined as a
 * contiguous sequence of letters.) So, given a String like "There are 87,000,000 people in Canada",
 * getBigWords would return an array of two elements, "people" and "Canada".
 */
public class GetBigWords {
    public static void main (String args[]) {

    System.out.println(getBigWords("Location,location,location").length);


    }
    public static String[] getBigWords(String s){
        String[] split;
        //split the words up
        if(s.matches("^.*[,].*$")){
            //split at comma
         split = s.split(",");
        }
        else{
            //split at space
            split = s.split("\\s+");
        }


        int counter = 0;
        //itterate over the array

        for(int i = 0; i < split.length; i++)
        {
            //if the word is bigger then 5
            if(split[i].length() > 5)
            {
                if(split[i].matches("[a-zA-Z,]+"))
                {
                    counter ++;

                }

            }
        }
        String [] words = new String[counter];
        //System.out.print(words.length);
        int counter2 =0;
        for(int i = 0; i < split.length; i++)
        {
            //if the word is bigger then 5
            if(split[i].length() > 5)
            {

                //if it is all letters
                if(split[i].matches("[a-zA-Z,]+"))
                {

                     words[counter2] = split[i];
                    //System.out.println(split[i]);
                    counter2++;

                }
            }
        }

        return words;
    }
}
