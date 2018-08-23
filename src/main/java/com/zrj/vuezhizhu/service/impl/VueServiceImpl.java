package com.zrj.vuezhizhu.service.impl;

import com.zrj.vuezhizhu.dao.VueDao;
import com.zrj.vuezhizhu.entity.*;
import com.zrj.vuezhizhu.service.VueService;
import com.zrj.vuezhizhu.utils.exceptionHandler.ExceptionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class VueServiceImpl implements VueService {
    @Autowired
    private VueDao vueDao;
    @Override
    public Administrator getAdministrator(Administrator administrator) {
        Administrator admin= vueDao.getAdministrator(administrator);
        if(admin==null){
            throw new ExceptionEntity(0,"账户不存在或密码错误");
        }
        return  admin;
    }

    @Override
    public CountList<Student> listStudent(StudentParam studentParam) {
        Integer pageStart=(studentParam.getPageNo()-1)*studentParam.getPageSize();
        studentParam.setPageStart(pageStart);
        return new CountList<>(vueDao.countStudent(studentParam),vueDao.listStudent(studentParam));
    }

    @Override
    public Integer deleteStudent(String openid) {
        return vueDao.deleteStudent(openid);
    }

    @Override
    public Integer updateStudent(StudentParam studentParam) {
        return vueDao.updateStudent(studentParam);
    }

    @Override
    public List<String> listSchool() {
        return vueDao.listSchool();
    }

    @Override
    public List<String> listBuilding(String schoolName) {
        return vueDao.listBuilding(schoolName);
    }

    @Override
    public List<String> listRoom(String schoolName, String building) {
        return vueDao.listRoom(schoolName, building);
    }

    @Override
    public CountList<Repair> listRepair(RepairParam repairParam){
        Integer pageStart=(repairParam.getPageNo()-1)*repairParam.getPageSize();
        repairParam.setPageStart(pageStart);
        return new CountList<>(vueDao.countRepair(repairParam),vueDao.listRepair(repairParam));
    }

    @Override
    public Integer updateRepair(Repair repair) {
        return vueDao.updateRepair(repair);
    }

    @Override
    public CountList<Problem> listProblem(ProblemParam problemParam) {
        Integer pageStart=(problemParam.getPageNo()-1)*problemParam.getPageSize();
        problemParam.setPageStart(pageStart);
        return new CountList<>(vueDao.countProblem(problemParam),vueDao.listProblem(problemParam));
    }

    @Override
    public Integer updateProblem(Problem problem) {
        return vueDao.updateProblem(problem);
    }

    @Override
    public CountList<Room> listRoomInfo(RoomParam roomParam) {
        Integer pageStart=(roomParam.getPageNo()-1)*roomParam.getPageSize();
        roomParam.setPageStart(pageStart);
        List<Room> rooms = vueDao.listRoomInfo(roomParam);
        return new CountList<>(vueDao.countRoom(roomParam),rooms);
    }

    @Override
    public List<Student> listRoomMember(RoomParam roomParam) {
        return vueDao.listRoomMember(roomParam);
    }

    @Override
    public Integer updateRoom(Room room) {
        return vueDao.updateRoom(room);
    }
}
