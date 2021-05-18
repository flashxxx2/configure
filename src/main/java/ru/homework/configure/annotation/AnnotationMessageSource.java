package ru.homework.configure.annotation;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component("db")
public class AnnotationMessageSource implements MessageSource {
    private final ReloadableResourceBundleMessageSource db = new ReloadableResourceBundleMessageSource();

    public AnnotationMessageSource() {
        db.setBasename("db");
        db.setDefaultEncoding("UTF-8");
    }

    @Override
    public String getMessage(String code, Object[] args, String defaultMessage, Locale locale) {
        return db.getMessage(code, args, defaultMessage, locale);
    }

    @Override
    public String getMessage(String code, Object[] args, Locale locale) throws NoSuchMessageException {
        return db.getMessage(code, args, locale);
    }

    @Override
    public String getMessage(MessageSourceResolvable resolvable, Locale locale) throws NoSuchMessageException {
        return db.getMessage(resolvable, locale);
    }
}
