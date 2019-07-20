package org.darod.elearning.gateway.dataobject;

import java.util.Date;

public class CourseDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_info.id
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    private Integer courseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_info.course_name
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    private String courseName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_info.teacher_id
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    private Integer teacherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_info.publish_time
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    private Date publishTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_info.price
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    private Double price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_info.learn_num
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    private Integer learnNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_info.course_state
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    private Integer courseState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_info.first_tag
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    private String firstTag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_info.second_tag
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    private String secondTag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_info.third_tag
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    private String thirdTag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_info.course_description
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    private String courseDescription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_info.course_img_url
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    private String courseImgUrl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_info.id
     *
     * @return the value of course_info.id
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_info.id
     *
     * @param courseId the value for course_info.id
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_info.course_name
     *
     * @return the value of course_info.course_name
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_info.course_name
     *
     * @param courseName the value for course_info.course_name
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_info.teacher_id
     *
     * @return the value of course_info.teacher_id
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_info.teacher_id
     *
     * @param teacherId the value for course_info.teacher_id
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_info.publish_time
     *
     * @return the value of course_info.publish_time
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    public Date getPublishTime() {
        return publishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_info.publish_time
     *
     * @param publishTime the value for course_info.publish_time
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_info.price
     *
     * @return the value of course_info.price
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_info.price
     *
     * @param price the value for course_info.price
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_info.learn_num
     *
     * @return the value of course_info.learn_num
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    public Integer getLearnNum() {
        return learnNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_info.learn_num
     *
     * @param learnNum the value for course_info.learn_num
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    public void setLearnNum(Integer learnNum) {
        this.learnNum = learnNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_info.course_state
     *
     * @return the value of course_info.course_state
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    public Integer getCourseState() {
        return courseState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_info.course_state
     *
     * @param courseState the value for course_info.course_state
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    public void setCourseState(Integer courseState) {
        this.courseState = courseState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_info.first_tag
     *
     * @return the value of course_info.first_tag
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    public String getFirstTag() {
        return firstTag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_info.first_tag
     *
     * @param firstTag the value for course_info.first_tag
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    public void setFirstTag(String firstTag) {
        this.firstTag = firstTag == null ? null : firstTag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_info.second_tag
     *
     * @return the value of course_info.second_tag
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    public String getSecondTag() {
        return secondTag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_info.second_tag
     *
     * @param secondTag the value for course_info.second_tag
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    public void setSecondTag(String secondTag) {
        this.secondTag = secondTag == null ? null : secondTag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_info.third_tag
     *
     * @return the value of course_info.third_tag
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    public String getThirdTag() {
        return thirdTag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_info.third_tag
     *
     * @param thirdTag the value for course_info.third_tag
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    public void setThirdTag(String thirdTag) {
        this.thirdTag = thirdTag == null ? null : thirdTag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_info.course_description
     *
     * @return the value of course_info.course_description
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    public String getCourseDescription() {
        return courseDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_info.course_description
     *
     * @param courseDescription the value for course_info.course_description
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription == null ? null : courseDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_info.course_img_url
     *
     * @return the value of course_info.course_img_url
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    public String getCourseImgUrl() {
        return courseImgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_info.course_img_url
     *
     * @param courseImgUrl the value for course_info.course_img_url
     *
     * @mbg.generated Mon Jul 01 19:15:19 CST 2019
     */
    public void setCourseImgUrl(String courseImgUrl) {
        this.courseImgUrl = courseImgUrl == null ? null : courseImgUrl.trim();
    }
}