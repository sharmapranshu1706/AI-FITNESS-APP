package com.fitness.activityservice.dto;

import java.time.LocalDateTime;
import java.util.Map;
import com.fitness.activityservice.model.ActivityType;
import lombok.Data;

@Data
public class ActivityRequest {
    private String userID;
    private ActivityType type;
    private Integer duration;
    private Integer caloriesBurned;
    private LocalDateTime startTime;
    private Map<String, Object> additionalMetric;

}
