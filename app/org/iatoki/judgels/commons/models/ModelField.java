package org.iatoki.judgels.commons.models;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ModelField {

    ReferenceType reference() default ReferenceType.NO_REFERENCE;

    Class accessorEntity() default void.class;

    String formName() default "";

    String defaultValue() default "";
}