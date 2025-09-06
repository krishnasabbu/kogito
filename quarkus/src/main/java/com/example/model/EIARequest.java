package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EIARequest {
    
    @JsonProperty("projectId")
    private String projectId;
    
    @JsonProperty("projectName")
    private String projectName;
    
    @JsonProperty("projectType")
    private String projectType;
    
    @JsonProperty("environmentalImpact")
    private String environmentalImpact;
    
    @JsonProperty("location")
    private String location;
    
    @JsonProperty("submittedBy")
    private String submittedBy;

    // Default constructor
    public EIARequest() {}

    // Constructor with all fields
    public EIARequest(String projectId, String projectName, String projectType, 
                     String environmentalImpact, String location, String submittedBy) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectType = projectType;
        this.environmentalImpact = environmentalImpact;
        this.location = location;
        this.submittedBy = submittedBy;
    }

    // Getters and Setters
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getEnvironmentalImpact() {
        return environmentalImpact;
    }

    public void setEnvironmentalImpact(String environmentalImpact) {
        this.environmentalImpact = environmentalImpact;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }

    @Override
    public String toString() {
        return "EIARequest{" +
                "projectId='" + projectId + '\'' +
                ", projectName='" + projectName + '\'' +
                ", projectType='" + projectType + '\'' +
                ", environmentalImpact='" + environmentalImpact + '\'' +
                ", location='" + location + '\'' +
                ", submittedBy='" + submittedBy + '\'' +
                '}';
    }
}