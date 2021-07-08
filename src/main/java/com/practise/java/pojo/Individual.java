package com.practise.java.pojo;

import lombok.*;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class Individual {
    @NonNull
    private String name;
    @NonNull
    private List<Vehicle> vehicles;
    private Map<String, SalaryStack> salaryStackMap;

}
