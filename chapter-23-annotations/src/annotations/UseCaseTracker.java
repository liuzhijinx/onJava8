package annotations;

import java.util.*;
import java.util.stream.*;
import java.lang.reflect.*;

public class UseCaseTracker {
    public static void
    trackUseCases(List<Integer> useCases, Class<?> cl) {
        // cl中所有的方法
        for(Method m : cl.getDeclaredMethods()) {
            // 其中某一方法使用的UseCase注解
            UseCase uc = m.getAnnotation(UseCase.class);
            if(uc != null) {
                System.out.println("Found Use Case " + uc.id() + "\n" + uc.description());
                useCases.remove(Integer.valueOf(uc.id()));
            }
        }
        useCases.forEach(i -> System.out.println("Missing use case " + i));
    }
    public static void main(String[] args) {
        List<Integer> useCases = IntStream.range(47, 51).boxed().collect(Collectors.toList());
        trackUseCases(useCases, PasswordUtils.class);
    }
}
