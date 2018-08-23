package com.zrj.vuezhizhu.dao;

import com.zrj.vuezhizhu.entity.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VueDao {
    Administrator getAdministrator(Administrator administrator);

    List<String> listSchool();
    List<String> listBuilding(String schoolName);
    List<String> listRoom(@Param("schoolName") String schoolName, @Param("building") String building);

    Integer countStudent(StudentParam studentParam);
    List<Student> listStudent(StudentParam studentParam);
    Integer deleteStudent(String openid);
    Integer updateStudent(StudentParam studentParam);

    Integer countRepair(RepairParam repairParam);
    List<Repair> listRepair(RepairParam repairParam);
    Integer updateRepair(Repair repair);

    Integer countRoom(RoomParam roomParam);
    List<Room> listRoomInfo(RoomParam roomParam);
    List<Student> listRoomMember(RoomParam roomParam);
    Integer updateRoom(Room room);

    Integer countProblem(ProblemParam problemParam);
    List<Problem> listProblem(ProblemParam problemParam);
    Integer updateProblem(Problem problem);
}
