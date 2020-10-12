package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;


/**
 * @author yt
 * @date 2020/9/23 20:37
 */
public class MyResloverMesagess implements LocaleResolver {

    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        String bundle = httpServletRequest.getParameter("l");
        Locale local = Locale.getDefault();
        if (!StringUtils.isEmpty(bundle)) {
            String[] strs = bundle.split("_");
            local = new Locale(strs[0], strs[1]);
        }
        return local;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
