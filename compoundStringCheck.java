import java.io.*;
import java.util.*;
 public class compoundStringCheck{
    public static boolean isCompoundWord(String word,Set<String> wordSet)
    {
for(int i=1;i<word.length();i++)
{
    String prefix=word.substring(0, i);
    String suffix=word.substring(i);
    if(wordSet.contains(prefix)&&(wordSet.contains(suffix)||isCompoundWord(suffix, wordSet))){
        return true;
    }}
        return false;
    }
    public static String[] readFileInputs(String file)
    {
        Set<String> wordSet=new HashSet<>();
        String line;
        String longest="";
        String SecondLongest="";
        try(BufferedReader filReader= new BufferedReader(new FileReader(file)))
        {
            while((line=filReader.readLine())!=null)
            {
                wordSet.add(line);
            }
        }
      catch (Exception e) {
       e.printStackTrace();
        }
        for(String word:wordSet)
        {
            if(isCompoundWord(word, wordSet))
            {
                if(word.length()>longest.length())
                {
                    SecondLongest=longest;
                    longest=word;
                }
                else if( word.length()>SecondLongest.length()&&!word.equals(longest))
                {
                    SecondLongest=word;
                }
            }
        }
        return new String[]{longest,SecondLongest};
    }
    public static void main(String[] args) {
       long startTime=System.currentTimeMillis();
        String file="Input_01.txt";
        String [] resultant=readFileInputs(file);
        System.out.println("Longest Compound word: "+resultant[0]);
        System.out.println("Second Longest Compound word:"+resultant[1]);
        long endTime=System.currentTimeMillis();
        System.out.println("Time taken to process file "+ file +": "+(endTime-startTime)+" milliSeconds");



    }
 }