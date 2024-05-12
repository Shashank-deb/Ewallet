package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

/*
*   Java Stream->1,8
*
* Streams are not collections,rather streams are operating on collection
* Streams are Group processing
*
* */
    public static void main(String[] args) {

        System.out.println("This is normal List working");
        List<Integer> numList= List.of(1,2,3,4,5,6,7,8,9,10);
        for (Integer i:numList){
            System.out.println(i);
        }


        System.out.println("This is flat map working ");
        List<String> words = Arrays.asList("Hello", "World");

        // Using flatMap to split each word into its characters
        Stream<String> letters = words.stream()
                .flatMap(word -> Arrays.stream(word.split("")));

        letters.forEach(System.out::println);


        System.out.println("Working of the streams");

        List<Integer> squaredList=numList.stream().map(StreamExample::squareIt).collect(Collectors.toList());
        for (Integer i:squaredList){
            System.out.println(i);
        }


    }

    public static Integer squareIt(Integer x){
        return x*x;
    }

    /***
     * 1.there is a stream of Integers from numList
     * 2.map->we want to take an action on the items flowing the stream.Action here is : calling a squareIT method
     * 3.collecting the return of the squareIt into a different list and assinging it back to squareIt
     *
     *
     * Stream Functions
     * 1.Filter->filters the items based on the conditions provided in form predicate.
     * 2.Map->Convert/map the item into the another data type or object that is required
     * 3.Flatmap->FlatMap applies a function to each element of the original stream,
     *             where the function returns a stream for each element, and flattens
     *             these streams into a single stream.
     *
     *
     * Create a key value collection where key is symbol and value is list of trade
     *
     *
     * OPTIONAL is used for  the null pointer exception
     *
     */
}
