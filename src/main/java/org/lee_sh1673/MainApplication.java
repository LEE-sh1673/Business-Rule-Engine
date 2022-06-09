package org.lee_sh1673;

public class MainApplication {
    public static void main(String[] args) {

        var env = new Facts();
        env.addFact("name", "Bob");
        env.addFact("jobTitle", "CEO");

        final var businessRuleEngine = new BusinessRuleEngine(env);

        businessRuleEngine.addAction(facts -> {
            var jobTitle = facts.getFact("jobTitle");

            if ("CEO".equals(jobTitle)) {
                var name = facts.getFact("name");
                System.out.println("Relevant customer!!!: " + name);
            }
        });
        businessRuleEngine.run();
    }
}
