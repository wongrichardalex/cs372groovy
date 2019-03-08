/*
Author: Hannah Smith & Richard Wong
Date: 03/08/2018
*/

class HelloWorldAndSome{
    
    static void main(String[] args){
        
        helloWorld();
        
        sortBoi();
    
    }

    static void helloWorld(){
    /*
        This method will simply print "Hello World!"
    */
    
        //This is a variable hw defined as a string literal "Hello World" 
        def hw = "Hello World!"

        //The keyword println executes hw in the same way System.out.println(hw)
        //would work in Java
        println hw
    }
    
    static void sortBoi(){
    /*
        This method will accept user input from the command line 
        in the form of a single string of integers separated by
        spaces.  It will then print out the integers sorted in
        ascending order via insertion sort.  
    */
    
        Scanner scan = new Scanner(System.in);
        
        String s = scan.nextLine()
        
        String[] splitInput = s.split()
        
        def splitInts = []
        
        for(character in splitInput){
            splitInts.add(character as Integer);
        }
        
        //println splitInts
        
        splitInts = insertionSort(splitInts)
        
        for(integer in splitInts){
            print((String)integer + " ")
        }
    
    }
    
    static int[] insertionSort(arr){
        int i, key, j;
        for (i = 1; i < arr.size(); i++){
            key = arr[i]
            j = i - 1
            
            while( j>= 0 && arr[j] > key){
                arr[j+1] = arr[j]
                j = j -1
            }
            
            arr[j+1] = key
        }
        
        return arr
    }
        
}

