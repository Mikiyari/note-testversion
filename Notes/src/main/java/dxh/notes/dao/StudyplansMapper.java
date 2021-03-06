package dxh.notes.dao;

import dxh.notes.bean.Studyplans;
import dxh.notes.bean.StudyplansExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudyplansMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studyplans
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    long countByExample(StudyplansExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studyplans
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    int deleteByExample(StudyplansExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studyplans
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studyplans
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    int insert(Studyplans record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studyplans
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    int insertSelective(Studyplans record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studyplans
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    List<Studyplans> selectByExample(StudyplansExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studyplans
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    Studyplans selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studyplans
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    int updateByExampleSelective(@Param("record") Studyplans record, @Param("example") StudyplansExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studyplans
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    int updateByExample(@Param("record") Studyplans record, @Param("example") StudyplansExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studyplans
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    int updateByPrimaryKeySelective(Studyplans record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studyplans
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    int updateByPrimaryKey(Studyplans record);
}