package me.yqiang.book_dao;

import java.util.List;
import me.yqiang.book_pojo.Order;
import me.yqiang.book_pojo.OrderExample;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated Sun Apr 29 13:08:28 CST 2018
     */
    int countByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated Sun Apr 29 13:08:28 CST 2018
     */
    int deleteByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated Sun Apr 29 13:08:28 CST 2018
     */
    int insert(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated Sun Apr 29 13:08:28 CST 2018
     */
    int insertSelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated Sun Apr 29 13:08:28 CST 2018
     */
    List<Order> selectByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated Sun Apr 29 13:08:28 CST 2018
     */
    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated Sun Apr 29 13:08:28 CST 2018
     */
    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);
}