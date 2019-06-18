package com.ming;

import com.ming.organization.dao.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/test")
public class WER {

    @Autowired
    Organization organization;

    @RequestMapping("/org")
    @ResponseBody
    public String getorg() {
        String or = organization.getOrganizationName(1);
        return or;
    }
}
