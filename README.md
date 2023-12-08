# Try with Resource



**Objective**

 In this project we will learn, The `try-with-resource` statement.

**Concepts**

| Concept   |      Resources      |
|----------|:-------------:|
|Java try with resource | [try with resource (Tutorial)](https://www.youtube.com/watch?v=Cd-psBep2f4)|
|Explanation of try with resource|[try-with-resource documentation](https://javabeginnerstutorial.com/core-java-tutorial/exception-handling-try-resources/)|


**Problem**

Use the `try-with-resource` statement to read a file and perform a specific action.

**Implementation**

Using the provided `data.txt` file, and `try with resource` to do the following steps.
* Create a BufferedReader instance within a try-with-resources block, which reads the content file `new FileReader(path)`.
* Within the try block, use a while loop to read each line from the file and print it.
* If any `IOException` occurs during file reading, catch it in the catch block and print an error message indicating that an error occurred while reading the file.
  
> Make sure that the "data.txt" file is located at the correct path relative to the current working directory before running the code.


> Note: `try-with-resource` block is used to read the file and automatically close it once the try block is finished with execution.

  
```Java

public class Main {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        
        System.out.println(path);
        
        /* your code here */
    }
}

```
