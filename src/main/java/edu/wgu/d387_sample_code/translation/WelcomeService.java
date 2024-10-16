package edu.wgu.d387_sample_code.translation;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface WelcomeService {

    public void startService();
    public String getJsonList() throws JsonProcessingException, InterruptedException;
}