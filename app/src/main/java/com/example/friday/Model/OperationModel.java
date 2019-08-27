package com.example.friday.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class OperationModel {

    @SerializedName("status")
    String status;
    @SerializedName("result")
    ArrayList<ComptonModel> comptonModelArrayList;
    @SerializedName("message")
    String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<ComptonModel> getComptonModels() {
        return comptonModelArrayList;
    }

    public void setComptonModels(ArrayList<ComptonModel> comptonModels) {
        this.comptonModelArrayList = comptonModels;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
