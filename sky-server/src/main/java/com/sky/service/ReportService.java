package com.sky.service;

import com.sky.vo.TurnoverReportVO;
import java.time.LocalDate;



public interface ReportService {

    /**
     * 统计指定起止日期内的营业额
     * @param begin
     * @param end
     * @return
     */
    TurnoverReportVO getTurnoverStatistics(LocalDate begin, LocalDate end);
}
