package com.example.demo3.Mapper;

import com.example.demo3.Pojo.Flights;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightsMapper {
    /**
     * 添加
     * @param flights
     * @return
     */
    int Insert(Flights flights);
    /**
     * 根据条件查询
     * @param flights
     * @return
     */
    List<Flights> selectAll(Flights flights);

    /**
     * 删除
     * @param flights
     * @return
     */
    int Delete(Flights flights);

    /**
     * 修改
     * @param flights
     * @return
     */
    int Update(Flights flights);
}
