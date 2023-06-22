package lk.ijse.dep10.spring.util;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Boolean createFlag = context.getEnvironment()
                .getRequiredProperty("app.bean.creation", Boolean.class);
        return createFlag;
    }
}
