package com.eastrobot.kbs.template.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

/**
 * @author <a href="yogurt_lei@foxmail.com">Yogurt_lei</a>
 * @version v1.0 , 2019-03-14 20:57
 */
@Component
public class EnvironmentUtil implements ApplicationContextAware {
    private static ApplicationContext CTX;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        CTX = applicationContext;
    }

    public static ApplicationContext ofCtx() {
        return CTX;
    }

    public static String ofUid() {
        return SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
    }
}