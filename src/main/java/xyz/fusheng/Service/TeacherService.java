package xyz.fusheng.Service;

import xyz.fusheng.common.ResultBase;
import xyz.fusheng.entity.THomework;
import xyz.fusheng.entity.TTeacher;

public interface TeacherService {
    ResultBase login(String code, String oldPassword);

    ResultBase teacherEdl(String teacherCode ,String password);


    ResultBase selectByCode(String teacherCode);

    ResultBase addHomework(THomework homework);

    ResultBase selectHomework(String teacherCode);

    ResultBase selectFeedback(String teacherCode);

    ResultBase edlLeave(String leaveId, String opinion);

    ResultBase selectLeave(String teacherCode);

    ResultBase selectCourse();


    ResultBase selectByClass();


}
