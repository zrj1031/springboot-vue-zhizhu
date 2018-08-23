package com.zrj.vuezhizhu.controller;

import com.zrj.vuezhizhu.entity.*;
import com.zrj.vuezhizhu.service.VueService;
import com.zrj.vuezhizhu.utils.resultHandler.ResultEntity;
import com.zrj.vuezhizhu.utils.resultHandler.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VueController extends Cors{
    @Autowired
    private VueService vueService;
    @PostMapping("getAdministrator")
    public ResultEntity getAdministrator(@RequestBody Administrator administrator){
        return ResultUtil.resultSuccess(vueService.getAdministrator(administrator));
    }
    @PostMapping("listStudent")
    public ResultEntity listStudent(@RequestBody StudentParam studentParam){
        return ResultUtil.resultSuccess(vueService.listStudent(studentParam));
    }
    @PostMapping("deleteStudent")
    public ResultEntity deleteStudent(@RequestParam String openid){
        return ResultUtil.resultSuccess(vueService.deleteStudent(openid));
    }
    @PostMapping("updateStudent")
    public ResultEntity updateStudent(@RequestBody StudentParam studentParam){
        return ResultUtil.resultSuccess(vueService.updateStudent(studentParam));
    }
    @PostMapping("listSchool")
    public ResultEntity listSchool(){
        return ResultUtil.resultSuccess(vueService.listSchool());
    }

    @PostMapping("listBuilding")
    public ResultEntity listBuilding(@RequestParam String schoolName){
        return ResultUtil.resultSuccess(vueService.listBuilding(schoolName));
    }
    @PostMapping("listRoom")
    public ResultEntity listRoom(@RequestParam String schoolName,@RequestParam String building){
        return ResultUtil.resultSuccess(vueService.listRoom(schoolName,building));
    }
    @PostMapping("listRepair")
    public ResultEntity listRepair(@RequestBody RepairParam repairParam){
        return ResultUtil.resultSuccess(vueService.listRepair(repairParam));
    }
    @PostMapping("updateRepair")
    public ResultEntity updateRepair(@RequestBody Repair repair) {
        return ResultUtil.resultSuccess(vueService.updateRepair(repair));
    }
    @PostMapping("listRoomInfo")
    public ResultEntity listRoomInfo(@RequestBody RoomParam roomParam){
        return ResultUtil.resultSuccess(vueService.listRoomInfo(roomParam));
    }
    @PostMapping("listRoomMember")
    public ResultEntity listRoomMember(@RequestBody RoomParam roomParam){
        return ResultUtil.resultSuccess(vueService.listRoomMember(roomParam));
    }
    @PostMapping("updateRoom")
    public ResultEntity updateRoom(@RequestBody Room room) {
        return ResultUtil.resultSuccess(vueService.updateRoom(room));
    }

    @PostMapping("listProblem")
    public ResultEntity listProblem(@RequestBody ProblemParam problemParam){
        return ResultUtil.resultSuccess(vueService.listProblem(problemParam));
    }
    @PostMapping("updateProblem")
    public ResultEntity updateProblem(@RequestBody Problem problem) {
        return ResultUtil.resultSuccess(vueService.updateProblem(problem));
    }


}
