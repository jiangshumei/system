package com.oracle.mapper;

import com.oracle.web.bean.Fenlei;
import java.util.List;

public interface FenleiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fenlei
     *
     * @mbg.generated Wed May 08 12:12:17 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fenlei
     *
     * @mbg.generated Wed May 08 12:12:17 GMT+08:00 2019
     */
    int insert(Fenlei record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fenlei
     *
     * @mbg.generated Wed May 08 12:12:17 GMT+08:00 2019
     */
    Fenlei selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fenlei
     *
     * @mbg.generated Wed May 08 12:12:17 GMT+08:00 2019
     */
    List<Fenlei> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fenlei
     *
     * @mbg.generated Wed May 08 12:12:17 GMT+08:00 2019
     */
    int updateByPrimaryKey(Fenlei record);
}