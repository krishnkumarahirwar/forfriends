package org.cap.service;

import java.util.List;

import org.cap.dao.ITraineeDao;
import org.cap.dao.TraineeDaoImpl;
import org.cap.entities.*;
import org.cap.entities.Trainee;
import org.hibernate.tool.schema.extract.spi.ExtractionContext.DatabaseObjectAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class TraineeServiceImpl implements ITraineeService{
    private ITraineeDao traineeDao;
	private TraineeDaoImpl traineeDaoImpl;

    public TraineeServiceImpl(TraineeDaoImpl traineeDaoImpl) {
		this.traineeDaoImpl=traineeDaoImpl;
	}

	public ITraineeDao getEmployeeDao(){
        return traineeDao;
    }

    @Autowired
    public void setEmployeeDao(ITraineeDao dao){
        this.traineeDao=dao;
    }

	@Override
	public Trainee AddTrainee(Trainee trainee) {
		Trainee rtrainee=traineeDao.AddTrainee(trainee);
		return rtrainee;
	}

	@Override
	public Trainee deleteTrainee(int taineeId) {
		Trainee rtrainee=traineeDao.deleteTrainee(taineeId);
		return rtrainee;
	}

	@Override
	public Trainee modifyTrainee(Trainee trainee) {
		return traineeDao.modifyTrainee(trainee);
	}

	@Override
	public Trainee retrieveTrainee(int traineeId) {
			return traineeDao.retrieveTrainee(traineeId);
	}

	@Override
	public List<Trainee> retrieveAllTrainee() {
		return traineeDao.retrieveAllTrainee();
	}

   
}
