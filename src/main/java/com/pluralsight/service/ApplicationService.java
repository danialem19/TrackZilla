package com.pluralsight.service;

import com.pluralsight.model.Application;

import java.util.List;

public interface ApplicationService {
    List<Application> listApplications();
    Application findApplication(long id);
}


