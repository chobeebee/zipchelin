package com.zipchelin.web.resolver;

import com.zipchelin.model.dto.member.MemberSaveDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanWrapperImpl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Slf4j
public class FieldMatchValidator implements ConstraintValidator<FieldMatch, Object> {
    private String firstFieldName;
    private String secondFieldName;

    @Override
    public void initialize(final FieldMatch constraintAnnotation) {
        firstFieldName = constraintAnnotation.first();
        secondFieldName = constraintAnnotation.second();
    }

    @Override
    public boolean isValid(final Object value, final ConstraintValidatorContext context) {
        return value == null || fieldsMatch(value, firstFieldName, secondFieldName);
    }

    private boolean fieldsMatch(Object value, String field1, String field2) {
        try {
            Object fieldValue1 = getField(value, field1);
            Object fieldValue2 = getField(value, field2);

            // Check if both fields are not null before performing the comparison
            return fieldValue1 != null && fieldValue2 != null && fieldValue1.equals(fieldValue2);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            // Log the exception or handle it according to your application's needs
            return false;
        }
    }

    private Object getField(Object value, String fieldName) throws NoSuchFieldException, IllegalAccessException {
        // Ensure the field exists before attempting to access it
        if (value == null) {
            return null;
        }

        try {
            return value.getClass().getDeclaredField(fieldName).get(value);
        } catch (NoSuchFieldException e) {
            // Log the exception or handle it according to your application's needs
            return null;
        }
    }
}
