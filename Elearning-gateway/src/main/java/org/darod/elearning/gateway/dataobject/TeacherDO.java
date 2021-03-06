package org.darod.elearning.gateway.dataobject;

import java.util.Date;

public class TeacherDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.id
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    private Integer teacherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.user_id
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacher_description
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    private String teacherDescription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.cost_percent
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    private Integer costPercent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacher_name
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    private String teacherName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.apply_time
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    private Date applyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacher_state
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    private Integer teacherState;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.id
     *
     * @return the value of teacher.id
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.id
     *
     * @param teacherId the value for teacher.id
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.user_id
     *
     * @return the value of teacher.user_id
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.user_id
     *
     * @param userId the value for teacher.user_id
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacher_description
     *
     * @return the value of teacher.teacher_description
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public String getTeacherDescription() {
        return teacherDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacher_description
     *
     * @param teacherDescription the value for teacher.teacher_description
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public void setTeacherDescription(String teacherDescription) {
        this.teacherDescription = teacherDescription == null ? null : teacherDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.cost_percent
     *
     * @return the value of teacher.cost_percent
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public Integer getCostPercent() {
        return costPercent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.cost_percent
     *
     * @param costPercent the value for teacher.cost_percent
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public void setCostPercent(Integer costPercent) {
        this.costPercent = costPercent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacher_name
     *
     * @return the value of teacher.teacher_name
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacher_name
     *
     * @param teacherName the value for teacher.teacher_name
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.apply_time
     *
     * @return the value of teacher.apply_time
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public Date getApplyTime() {
        return applyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.apply_time
     *
     * @param applyTime the value for teacher.apply_time
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacher_state
     *
     * @return the value of teacher.teacher_state
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public Integer getTeacherState() {
        return teacherState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacher_state
     *
     * @param teacherState the value for teacher.teacher_state
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public void setTeacherState(Integer teacherState) {
        this.teacherState = teacherState;
    }
}