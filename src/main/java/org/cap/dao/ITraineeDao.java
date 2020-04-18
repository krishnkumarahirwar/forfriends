package org.cap.dao;

import java.util.List;

import org.cap.entities.*;

public interface ITraineeDao {

    Trainee AddTrainee(Trainee employee);
    Trainee deleteTrainee(int taineeId);
    Trainee modifyTrainee(Trainee trainee);
    Trainee retrieveTrainee(int traineeId);
    List<Trainee> retrieveAllTrainee();
}
