package org.miao.reconstruction.chapter6.substitute_algorithm;

import java.util.Arrays;
import java.util.List;

public class Demo {
    String foundPerson(String[] people) {
        List<String> candidates = Arrays.asList(new String[]{"Don","John","Kent"});
        for(int i = 0; i < people.length; i++){
           if(candidates.contains(people[i])){
               return people[i];
           }
        }
        return "";
    }
}
