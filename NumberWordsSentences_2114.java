// Question Link  https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/

public class NumberWordsSentences_2114 {

    public static int mostWordsFound(String[] sentences) {
        int maxCount = Integer.MIN_VALUE;
        System.out.println();
        for(int i=0; i<sentences.length; i++)
        {
            int len = sentences[i].split(" ").length;
            if(maxCount < len)
                maxCount = len;
        }
        return maxCount;

        // int maxCount = Integer.MIN_VALUE;
        // System.out.println();
        // for(int i=0; i<sentences.length; i++)
        // {
        //     String [] words = sentences[i].split(" ");
        //     if(maxCount < words.length)
        //         maxCount = words.length;
        // }
        // return maxCount;

        // int maxCount = Integer.MIN_VALUE;
        // System.out.println();
        // for(int i=0; i<sentences.length; i++)
        // {
        //     int count = 0;
        //     for(int j=0; j<sentences[i].length(); j++)
        //     {
        //         if(sentences[i].charAt(j) == ' ')
        //             count++;
        //     }
        //     if(maxCount < count)
        //         maxCount = count;
        // }
        // return maxCount+1;
    }

    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println();
        System.out.println("The max is : " + mostWordsFound(sentences));
    }

}