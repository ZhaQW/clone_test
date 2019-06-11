package com.watch.glamour.dao.deal;

import com.watch.glamour.pojo.deal.DealAbolishFee;

import java.util.List;

/**
 *   中介交易取消费用说明AA
 */
public interface DealAbolishFeeDao {
    /**
     * 查看中介交易取消费用说明AABBCCDD
     *
     * @return
     */
    List<DealAbolishFee> findAllRepairFee();
}
