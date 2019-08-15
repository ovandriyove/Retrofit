package com.example.friday.Model;

import com.google.gson.annotations.SerializedName;

public class ComptonService {

    @SerializedName("status")
    String status;
    @SerializedName("result")
    ComptonModel comptonModel;
    @SerializedName("message")
    String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ComptonModel getComptonModel() {
        return comptonModel;
    }

    public void setComptonModel(ComptonModel comptonModel) {
        this.comptonModel = comptonModel;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
