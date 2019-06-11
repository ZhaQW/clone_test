package com.watch.glamour.dao.deal;

import com.watch.glamour.pojo.deal.DealAbolishFee;

import java.util.List;

/**
 *   测试中介交易取消费用说明
 */
public interface DealAbolishFeeDao {
    /**
     * 查看中介交易取消费用说明
     *
     * @return
     */
    List<DealAbolishFee> findAllRepairFee();
}
