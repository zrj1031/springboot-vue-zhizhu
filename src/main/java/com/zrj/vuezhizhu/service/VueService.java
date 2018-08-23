package com.zrj.vuezhizhu.service;

import com.zrj.vuezhizhu.entity.*;

import java.util.List;


public interface VueService {
    Administrator getAdministrator(Administrator administrator);

    CountList<Student> listStudent(StudentParam studentParam);
    Integer deleteStudent(String openid);
    Integer updateStudent(StudentParam studentParam);

    List<String> listSchool();
    List<String> listBuilding(String schoolName);
    List<String> listRoom(String schoolName,String building);

    CountList<Repair> listRepair(RepairParam repairParam);
    Integer updateRepair(Repair repair);

    CountList<Problem> listProblem(ProblemParam problemParam);
    Integer updateProblem(Problem problem);

    CountList<Room> listRoomInfo(RoomParam roomParam);
    List<Student> listRoomMember(RoomParam roomParam);
    Integer updateRoom(Room room);
}
