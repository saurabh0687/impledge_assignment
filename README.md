# impledge_assignment
This Java Program finds the longest and the second longest compound word formed by combining two or more words from the inputs text file
#How it works


I divided this problem in to two sub problems - 
   - To find out whether the given word is compound or not
   - To find the longest and the second longest from the founded compound words

                                               
Method 1- #findLongestAndSecondLongestCompoundWords(String file):
    - This method takes the file name as input and have ##BufferedReader to read the file
    - After that we create the HashSet of String type as the given file has inputs in the form of Strings
    - Now we traverse each of the element of the HashSet and Check whether the element is compound or not
    - For checking this we call our IsCompound Method,If word founds to be compound then we check it for 
      longest and second longest and return the array of the same

      
                                         
Method 2- #isCompound(String word,Set<String> wordSet):
    - This method is used to check whether a given word is a compound word.
    - It iterates through the characters of the word, splitting it into a prefix and a suffix.
    - It checks if both the prefix and suffix exist in the wordSet and, if so, returns true.
    - If suffix do not exist in the HashSet then we recursively call our isCompound method for the suffix which breaks it into further prefix and 
      suffix and return true or false accordingly



**** In our main method 
     - we first provide the file name of the input text file
     - we use 'System.currentTimeMillis()' to find out start and end time of the program
     - then we call our #findLongestAndSecondLongestCompoundWords method with the file name as argument
     - print the output which is return by the above function in the required format 


Thank you!!
                                                        
  
