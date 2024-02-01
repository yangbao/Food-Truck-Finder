package com.example.hxds.mis.api.service;

import com.example.hxds.common.util.PageUtils;
import com.example.hxds.mis.api.controller.form.*;

import java.util.HashMap;

public interface VoucherService {
    public PageUtils searchVoucherByPage(SearchVoucherByPageForm form);

    public int insertVoucher(InsertVoucherForm form);

    public int updateVoucherStatus(UpdateVoucherStatusForm form);

    public int deleteVoucherByIds(DeleteVoucherByIdsForm form);
}
