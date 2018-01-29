package com.example.array;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Array {


    @RequestMapping("/")
    public String arrayproce() {
        int sum = 0;
        double avg=0;

        String total = "";
        String Average="";

        int[] arraynum = new int[3];
        arraynum[0] = 4;
        arraynum[1] = 9;
        arraynum[2] = 33;

        for (int i = 0; i < 3; i++) {
            sum = sum + arraynum[i];
            avg = sum/3;



        }

        total += Integer.toString(sum);
        Average += Double.toString(avg);

        // return something
        return "the total is:" + total+"</br>"+Average;

    }

}
              



