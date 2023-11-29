# Try-with-resource



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
1. Create an instance of `FileReader`, and pass it as a resource object.
2. Use the `BufferedReader` class to read `data.txt` file content.
3. Print the content of `data.txt` file.

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
