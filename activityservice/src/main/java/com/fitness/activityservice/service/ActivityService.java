package com.fitness.activityservice.service;

import org.springframework.stereotype.Service;
import com.fitness.activityservice.ActivityRepository;
import com.fitness.activityservice.dto.ActivityRequest;
import com.fitness.activityservice.dto.ActivityResponse;
import com.fitness.activityservice.model.Activity;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ActivityService {


    private final ActivityRepository activityRepository;

    public ActivityResponse trackActivity(ActivityRequest request){
        Activity activity = Activity.builder()
                         .userId(request.getUserId())
                         .type(request.getType())
                         .caloriesBurned(request.getCaloriesBurned())
                         .duration(request.getDuration())
                         .startTime(request.getStartTime())
                         .additionalMetric(request.getAdditionalMetrics())
                         .build();
                         Activity savedActivity = activityRepository.save(activity);
                         return mapToResponse(savedActivity);
    }
    private ActivityResponse mapToResponse(Activity activity){
        ActivityResponse response = new ActivityResponse();
        response.setId(activity.getId());
        response.setUserId(activity.getUserId());
        response.setType(activity.getType());
        response.setDuration(activity.getDuration());
        response.setCaloriesBurned(activity.getCaloriesBurned());
        response.setStartTime(activity.getStartTime());
        response.setAdditionalMetric(activity.getAdditionalMetric());
        // response.setCreatedAt(activity.getCreatedAt());
        // response.setUpdatedAt(activity.getUpdatedAt());
        return response;
    }
        
}
