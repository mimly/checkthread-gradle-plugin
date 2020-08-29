package mimly.checkthread;

import org.gradle.api.Project;
import org.gradle.api.Plugin;

public class CheckThreadPlugin implements Plugin<Project> {
    public void apply(Project project) {
        // Register a task
        project.getTasks().register("checkThread", task -> {
            task.setGroup("Check Thread");
            task.setDescription("Analyzes Java code and detects possible data races, race conditions, deadlocks, livelocks etc.");

//            task.dependsOn("assemble");
            task.doLast(s -> System.out.println("Hello from plugin 'mimly.checkthread'"));
        });
    }
}
