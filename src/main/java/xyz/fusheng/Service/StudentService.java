/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: StudentService
 * Author:   25610
 * Date:     2020/2/26 11:41
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.Service;

import xyz.fusheng.common.ResultBase;
import xyz.fusheng.entity.TFeedback;
import xyz.fusheng.entity.TLeave;
import xyz.fusheng.entity.TStudent;

public interface StudentService {


    ResultBase login(String code, String password,String  type );

    ResultBase studentEdl(String  studentCode,String password);

    ResultBase selectByCode(String code);

    ResultBase selectByCurriculum(String code);

    ResultBase selectByPerformance(String studentCode);

    ResultBase addLeave(TLeave tLeave);

    ResultBase addFeedback(TFeedback feedback);

    ResultBase selectLeave(String studentCode);

    ResultBase selectFeedback(String studentCode);

    ResultBase selectHomework(String studentCode);

    ResultBase registere(String name, String code, String password, String classs, String sex, String coursecode, String role);

    ResultBase selectDoctorClasscode(String classcode);

}
