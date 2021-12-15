package com.learning.java.interview.encora1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@Data
@NoArgsConstructor
@AllArgsConstructor
class IP {
    int firstsubNet;
    int secondSubnet;
    int thirdSubnet;
    int fourthSubnet;

    @Override
    public String toString() {
        return firstsubNet + "." + secondSubnet + "." + thirdSubnet + "." + fourthSubnet;
    }
}

public class LBImplementation {
    public static void main(String[] args) {
        List<IP> serversList = Arrays.asList(new IP(1,2,3,1), new IP(1,2,3,2), new IP(1,2,3,3), new IP(1,2,3,4), new IP(1,2,3,5), new IP(1,2,3,6), new IP(1,2,3,7));

        try {
            IntStream.range(0,1000).forEach(requestNumber -> {
                int index = requestNumber % serversList.size();
                System.out.println(serversList.get(index));
            });
        } catch (Exception e) {
            //LOGGER stating the request details with security/pii data encoded
            //Need to consider if there are any issues in the server
            e.printStackTrace();
        } finally {
            //need to closed the resorces if any needed.
        }
    }
}
