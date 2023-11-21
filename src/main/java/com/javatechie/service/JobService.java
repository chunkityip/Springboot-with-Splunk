package com.javatechie.service;
import java.security.SecureRandom;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.javatechie.dto.JobStatus;
import com.javatechie.dto.Order;
import com.javatechie.util.Mapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
JobService is a service class used to process an order, by calling other APIs.
It returns a JobStatus of either SUCCESS or FAILED depending on the results of the other API.
 */
@Service
public class JobService {

    Logger logger = LogManager.getLogger(JobService.class);

    public JobStatus process(Order order) {
        logger.info("JobService: process request {} ", Mapper.mapToJsonString(order));
        if (otherApiResults()) {
            return JobStatus.SUCCESS;
        } else {
            return JobStatus.FAILED;
        }
    }

    private boolean otherApiResults() {
        return new SecureRandom().nextBoolean();
    }
}
