package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EIAResponse {
    
    @JsonProperty("status")
    private String status;
    
    @JsonProperty("message")
    private String message;
    
    @JsonProperty("validationResult")
    private String validationResult;
    
    @JsonProperty("cipValidationRequired")
    private boolean cipValidationRequired;
    
    @JsonProperty("cipValidationResult")
    private String cipValidationResult;
    
    @JsonProperty("processInstanceId")
    private String processInstanceId;

    // Default constructor
    public EIAResponse() {}

    // Constructor
    public EIAResponse(String status, String message, String validationResult, 
                      boolean cipValidationRequired, String cipValidationResult, 
                      String processInstanceId) {
        this.status = status;
        this.message = message;
        this.validationResult = validationResult;
        this.cipValidationRequired = cipValidationRequired;
        this.cipValidationResult = cipValidationResult;
        this.processInstanceId = processInstanceId;
    }

    // Getters and Setters
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getValidationResult() {
        return validationResult;
    }

    public void setValidationResult(String validationResult) {
        this.validationResult = validationResult;
    }

    public boolean isCipValidationRequired() {
        return cipValidationRequired;
    }

    public void setCipValidationRequired(boolean cipValidationRequired) {
        this.cipValidationRequired = cipValidationRequired;
    }

    public String getCipValidationResult() {
        return cipValidationResult;
    }

    public void setCipValidationResult(String cipValidationResult) {
        this.cipValidationResult = cipValidationResult;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    @Override
    public String toString() {
        return "EIAResponse{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", validationResult='" + validationResult + '\'' +
                ", cipValidationRequired=" + cipValidationRequired +
                ", cipValidationResult='" + cipValidationResult + '\'' +
                ", processInstanceId='" + processInstanceId + '\'' +
                '}';
    }
}