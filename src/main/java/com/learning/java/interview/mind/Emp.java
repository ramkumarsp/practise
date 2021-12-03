package com.learning.java.interview.mind;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Emp {
    private String id;
    private String name;
    private List<String> phoneNumber;
}
