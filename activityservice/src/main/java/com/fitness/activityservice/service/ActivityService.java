package com.fitness.activityservice.service;

import org.springframework.stereotype.Service;
import com.fitness.activityservice.ActivityRepository;
import com.fitness.activityservice.dto.ActivityRequest;
import com.fitness.activityservice.dto.ActivityResponse;
import com.fitness.activityservice.model.Activity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@Service
@RequiredArgsConstructor
public class ActivityService {

    private ActivityRepository activityRepository;

    public ActivityResponse trackActivity(ActivityRequest request){
        Activity activity = Activity.builder();
                         .userID(request.getUserID())
                         .type(request.getType())
                         .caloriesBurned(request.getCaloriesBurned());
                         .duration(request.getDuration())
                         .startTime(request.getStartTime())
                         .additionalMetric(request.getAdditionalMetric())
                         .build();

                         Activity savedActivity = activityRepository.save(activity);
                         return mapToResponse(activity);
    }
    private ActivityResponse mapToResponse(Activity activity){
        ActivityResponse response = new ActivityResponse();
        response.setId(activity.getId());
        response.setUserID(activity.getUserID());
        response.setType(activity.getType());
        response.setDuration(activity.getDuration());
        response.setCaloriesBurned(activity.getCaloriesBurned());
        response.setStartTime(activity.getStartTime());
        response.setAdditionalMetric(activity.getAdditionalMetric());
        return response;
    }
        
}
