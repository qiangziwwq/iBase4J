package org.ibase4j.mybatis.generator.dao;

import java.util.List;
import org.ibase4j.mybatis.generator.model.SysSession;

public interface SysSessionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_session
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_session
     *
     * @mbggenerated
     */
    int insert(SysSession record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_session
     *
     * @mbggenerated
     */
    SysSession selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_session
     *
     * @mbggenerated
     */
    List<SysSession> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_session
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SysSession record);
}