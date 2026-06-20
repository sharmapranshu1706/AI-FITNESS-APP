package com.fitness.activityservice.dto;

import java.time.LocalDateTime;
import com.fitness.activityservice.model.ActivityType;
import lombok.Data;
import java.util.Map;

@Data
public class ActivityResponse {
    private String id;
    private String userID;
    private ActivityType type;
    private Integer duration;
    private Integer caloriesBurned;
    private LocalDateTime startTime;
    private Map<String, Object> additionalMetric;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
