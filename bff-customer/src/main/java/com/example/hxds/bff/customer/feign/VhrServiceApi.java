package com.example.hxds.bff.customer.feign;

import com.example.hxds.bff.customer.controller.form.*;
import com.example.hxds.common.util.R;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@FeignClient(value = "hxds-vhr")
public interface VhrServiceApi {

    @PostMapping("/voucher/customer/useVoucher")
    public R useVoucher(UseVoucherForm form);

    @PostMapping("/voucher/searchUnTakeVoucherByPage")
    public R searchUnTakeVoucherByPage(SearchUnTakeVoucherByPageForm form);

    @PostMapping("/voucher/takeVoucher")
    public R takeVoucher(TakeVoucherForm form);

    @PostMapping("/voucher/searchUnUseVoucherByPage")
    public R searchUnUseVoucherByPage(SearchUnUseVoucherByPageForm form);

    @PostMapping("/voucher/searchUsedVoucherByPage")
    public R searchUsedVoucherByPage(SearchUsedVoucherByPageForm form);

    @PostMapping("/voucher/searchBestUnUseVoucher")
    public R searchBestUnUseVoucher(SearchBestUnUseVoucherForm form);

    @PostMapping("/voucher/searchUnUseVoucherCount")
    public R searchUnUseVoucherCount(SearchUnUseVoucherCountForm form);
}