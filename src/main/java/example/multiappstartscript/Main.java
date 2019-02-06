package example.multiappstartscript;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

public class Main {

    public static void main(String... args) {
        System.out.println("Starting gradle-multiappstartscript-example...");

        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        runtimeMXBean.getInputArguments().forEach(System.out::println);
    }
}
