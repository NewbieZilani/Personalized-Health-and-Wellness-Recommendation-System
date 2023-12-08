package com.feedback.main.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AllFeedbackResponseDTO {
    private long userId;
    private double rating;
    private String review;
}