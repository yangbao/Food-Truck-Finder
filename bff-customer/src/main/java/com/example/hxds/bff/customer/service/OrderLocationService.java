package com.example.hxds.bff.customer.service;

import com.example.hxds.bff.customer.controller.form.SearchOrderLocationCacheForm;
import com.example.hxds.common.util.R;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.HashMap;

public interface OrderLocationService {
    public HashMap searchOrderLocationCache(SearchOrderLocationCacheForm form);
}
