package com.oracle.mapper;

import com.oracle.web.bean.Book;
import java.util.List;

public interface BookMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Wed May 08 12:12:17 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Integer bid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Wed May 08 12:12:17 GMT+08:00 2019
     */
    int insert(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Wed May 08 12:12:17 GMT+08:00 2019
     */
    Book selectByPrimaryKey(Integer bid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Wed May 08 12:12:17 GMT+08:00 2019
     */
    List<Book> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Wed May 08 12:12:17 GMT+08:00 2019
     */
    int updateByPrimaryKey(Book record);
}