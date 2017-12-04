package com.ygy.mapper;

import com.ygy.model.SysRole;
import com.ygy.model.SysroleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysroleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysRole
     *
     * @mbggenerated
     */
    int countByExample(SysroleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysRole
     *
     * @mbggenerated
     */
    int deleteByExample(SysroleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysRole
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysRole
     *
     * @mbggenerated
     */
    int insert(SysRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysRole
     *
     * @mbggenerated
     */
    int insertSelective(SysRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysRole
     *
     * @mbggenerated
     */
    List<SysRole> selectByExample(SysroleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysRole
     *
     * @mbggenerated
     */
    SysRole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysRole
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysroleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysRole
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SysRole record, @Param("example") SysroleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysRole
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SysRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysRole
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SysRole record);
}