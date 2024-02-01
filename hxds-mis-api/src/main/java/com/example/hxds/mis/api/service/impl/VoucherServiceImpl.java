package com.example.hxds.mis.api.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.map.MapUtil;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.example.hxds.common.util.PageUtils;
import com.example.hxds.common.util.R;
import com.example.hxds.mis.api.controller.form.*;
import com.example.hxds.mis.api.feign.VhrServiceApi;
import com.example.hxds.mis.api.service.VoucherService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;

@Service
public class VoucherServiceImpl implements VoucherService {
    @Resource
    private VhrServiceApi vhrServiceApi;


    @Override
    public PageUtils searchVoucherByPage(SearchVoucherByPageForm form) {
        R r = vhrServiceApi.searchVoucherByPage(form);
        HashMap map = (HashMap) r.get("result");
        PageUtils pageUtils = BeanUtil.toBean(map, PageUtils.class);
        return pageUtils;
    }

    @Override
    @Transactional
    @LcnTransaction
    public int insertVoucher(InsertVoucherForm form) {
        R r = vhrServiceApi.insertVoucher(form);
        int rows = MapUtil.getInt(r, "rows");
        return rows;
    }

    @Override
    @Transactional
    @LcnTransaction
    public int updateVoucherStatus(UpdateVoucherStatusForm form) {
        R r = vhrServiceApi.updateVoucherStatus(form);
        int rows = MapUtil.getInt(r, "rows");
        return rows;
    }

    @Override
    @Transactional
    @LcnTransaction
    public int deleteVoucherByIds(DeleteVoucherByIdsForm form) {
        R r = vhrServiceApi.deleteVoucherByIds(form);
        int rows = MapUtil.getInt(r, "rows");
        return rows;
    }
}
