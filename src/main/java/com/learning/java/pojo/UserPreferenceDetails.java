package com.learning.java.pojo;

import lombok.*;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class UserPreferenceDetails {
    @NonNull
    private int reservationId;
    @NonNull
    private String offerId;
    private int selectedQuantity;
}
