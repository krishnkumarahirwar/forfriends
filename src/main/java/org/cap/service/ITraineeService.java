package org.cap.service;

import java.util.List;

import org.cap.entities.*;
import org.springframework.stereotype.Component;

public interface ITraineeService {

	Trainee AddTrainee(Trainee traineeId);
    Trainee deleteTrainee(int taineeId);
    Trainee modifyTrainee(Trainee trainee);
    Trainee retrieveTrainee(int traineeId);
    List<Trainee> retrieveAllTrainee();
}
