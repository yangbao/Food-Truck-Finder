package com.example.hxds.mis.api.service;

import com.example.hxds.common.util.PageUtils;
import com.example.hxds.mis.api.controller.form.SearchOrderByPageForm;
import com.example.hxds.mis.api.controller.form.SearchOrderLastGpsForm;

import java.util.ArrayList;
import java.util.HashMap;

public interface OrderService {

    public PageUtils searchOrderByPage(SearchOrderByPageForm form);

    public HashMap searchOrderComprehensiveInfo(long orderId);

    public HashMap searchOrderLastGps(SearchOrderLastGpsForm form);

    public ArrayList<HashMap> searchOrderStartLocationIn30Days();


}
