package com.uncgcapstone.android.seniorcapstone.data;

/**
 * Created by jon on 10/21/2016.
 */

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Steps {

    @SerializedName("Steps")
    @Expose
    private List<Step> steps = new ArrayList<Step>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Steps() {
    }

    /**
     *
     * @param steps
     */
    public Steps(List<Step> steps) {
        this.steps = steps;
    }

    /**
     *
     * @return
     * The steps
     */
    public List<Step> getSteps() {
        return steps;
    }

    /**
     *
     * @param steps
     * The Steps
     */
    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

}