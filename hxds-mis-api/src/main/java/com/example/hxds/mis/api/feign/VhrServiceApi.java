package com.example.hxds.mis.api.feign;

import com.example.hxds.common.util.R;
import com.example.hxds.mis.api.controller.form.*;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@FeignClient(value = "hxds-vhr")
public interface VhrServiceApi {

    @PostMapping("/voucher/searchVoucherByPage")
    public R searchVoucherByPage(SearchVoucherByPageForm form);

    @PostMapping("/voucher/insertVoucher")
    public R insertVoucher(InsertVoucherForm form);

    @PostMapping("/voucher/updateVoucherStatus")
    public R updateVoucherStatus(UpdateVoucherStatusForm form);

    @PostMapping("/voucher/deleteVoucherByIds")
    public R deleteVoucherByIds(DeleteVoucherByIdsForm form);

}
