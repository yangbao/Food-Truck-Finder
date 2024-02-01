package com.example.hxds.bff.customer.service;

import com.example.hxds.bff.customer.controller.form.*;
import com.example.hxds.common.util.R;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.HashMap;

public interface CustomerService {
    public long registerNewCustomer(RegisterNewCustomerForm form);

    public Long login(LoginForm form);

}
