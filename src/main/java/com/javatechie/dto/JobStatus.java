package com.javatechie.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


/*
 * An enum class for JobStatus with two values : SUCCESS and FAILED.
 * Each value has its associated name.
 */
@Getter
public enum JobStatus {
    SUCCESS,FAILED;

    private String name;
}
