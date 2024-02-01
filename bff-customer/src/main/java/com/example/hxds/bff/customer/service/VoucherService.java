package com.example.hxds.bff.customer.service;

import com.example.hxds.bff.customer.controller.form.*;
import com.example.hxds.common.util.PageUtils;
import com.example.hxds.common.util.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public interface VoucherService {
    public PageUtils searchUnTakeVoucherByPage(SearchUnTakeVoucherByPageForm form);

    public boolean takeVoucher(TakeVoucherForm form);

    public PageUtils searchUnUseVoucherByPage(SearchUnUseVoucherByPageForm form);

    public PageUtils searchUsedVoucherByPage(SearchUsedVoucherByPageForm form);

    public long searchUnUseVoucherCount(SearchUnUseVoucherCountForm form);
}
