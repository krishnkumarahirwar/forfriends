package org.cap.controller;

import java.util.List;

import org.cap.dao.TraineeDaoImpl;
import org.cap.entities.*;
import org.cap.service.ITraineeService;
import org.cap.service.TraineeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    private ITraineeService traineeService;

    public ITraineeService getTraineeService(){
        return traineeService;
    }
    @Autowired
    public void setTraineeService(ITraineeService service){
        this.traineeService=service;
    }

    /**
      this method will run on get request /hello
    **/
    @GetMapping("/hello")
    //@RequestMapping(method = {RequestMethod.GET}, value = "/hello")
    public ModelAndView sayHello() {
        return new ModelAndView("hellopage",  "message", "Welcome user");
    }

    @GetMapping("/add")
    public ModelAndView addtrainee() {
        return new ModelAndView("addtrainee");
    }


    @GetMapping("/processaddtrainee")
    public ModelAndView traineeDetails(@RequestParam("traineeId")int traineeId,@RequestParam("traineeName")String traineeName
    		,@RequestParam("traineeDomain")String traineeDomain,@RequestParam("traineeLocation")String traineeLocation) {
        Trainee t=new Trainee(traineeId,traineeName,traineeDomain,traineeLocation);
    	Trainee trainee=getTraineeService().AddTrainee(t);
        return new ModelAndView("traineedetail", "trainee", trainee);
    }


    @GetMapping("/remove")
    public ModelAndView removetrainee() {
    	return new ModelAndView("removetrainee","trainee","trainee");
    }
    @GetMapping("/delete")
    public ModelAndView deletetrainee(@RequestParam("traineeId")int traineeId) {
    	Trainee trainee=traineeService.deleteTrainee(traineeId);
    	return new ModelAndView("deletetrainee");
    	
    }
    @GetMapping("/modify")
    public ModelAndView modifyTrainee() {
    	return new ModelAndView("modify");
    }
    
    @GetMapping("/preocessmodifytrainee")
    public ModelAndView processModify(@RequestParam("traineeId")int traineeId,@RequestParam("traineeName")String traineeName
    		,@RequestParam("traineeDomain")String traineeDomain,@RequestParam("traineeLocation")String traineeLocation) {
    	Trainee trainee=new Trainee();
    	Trainee traine=traineeService.modifyTrainee(trainee);
    	return new ModelAndView("modifyDetails");
    }
    
    @GetMapping("/find")
    public ModelAndView findTrainee() {
    	return new ModelAndView("findTraineeById");
    }
    @GetMapping("/retrieveTrainee")
    public ModelAndView retrieveTrainee(@RequestParam("traineeId")int traineeId) {
    	Trainee trainee=traineeService.retrieveTrainee(traineeId);
    	return new ModelAndView("retrievaltrainee"); 
    }
    @GetMapping("/findAll")
    public ModelAndView findAllTrainee() {
    	List<Trainee> trainee=traineeService.retrieveAllTrainee();
    	return new ModelAndView("allTrainee");
    }
}







