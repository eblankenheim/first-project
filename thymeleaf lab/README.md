### Lab: Translate to Thymeleaf



#### Instructions



**Download the translate-to-thymeleaf project from Teams.**



Extract it. It's a collection of small UIs implemented in HTML, CSS, and JavaScript. Open `index.html` with your browser and try its options to get a sense of what the interfaces do.



Work with a team to re-implement the interfaces and behaviors in Thymeleaf. JavaScript is strictly forbidden in the Thymeleaf version.



#### Set Up



1. Create a GitHub repo.



2. Create a new Maven project.



3. Add Spring Boot, Spring MVC, Thymeleaf, and Dev Tools dependencies to POM.



4. Create a `templates` directory in `/project-name/src/main/resources`.



5. Add a `main` application entry point in a class annotated with `@SpringBootApplication`. Launch the application with `SpringApplication.run`.



6. Add at least one UI controller annotated with `@Controller`.



7. Implement controller handler methods with corresponding Thymeleaf templates for each `translate-to-thymeleaf` UI. Some UIs require two handler methods because they use the GET->POST pattern to trigger an action on the server.



#### Approach



Implement all UIs (or as many as you have time for). Start with `index.html`. The URL, http://localhost:8080/, should serve HTML equivalent to `index.html` and provide link navigation to the 6 challenges, not as files but as URL patterns.



##### Suggested URLs



| Original File | URL |
| --- | --- |
| `index.html` | `/` |
| `random-encouragement.html` | `/encouragement` |
| `personalized-encouragement.html` | `/personal/encouragement` |
| `tip-calculator.html` | `/tip` |
| `set-color.html` | `/color` |
| `math.html` | `/math` |
| `hockey.html` | `/hockey` |



Challenges are in order of difficulty. Work from top to bottom. Don't work on more than one challenge at a time. Complete a challenge before moving on.



Steal HTML from `translate-to-thymeleaf` for your Thymeleaf templates. Remove all JavaScript files and references. You are not allowed to use JavaScript in the Thymeleaf version.



Anywhere you see a `<form>`, it's a hint that a POST is required and must be handled on the server. A GET request renders the initial UI/template. The POST triggers some action or calculation and either re-renders the original template with embedded data or renders a result template.



Challenges may contain hints in code or in the UI.



Reminder: **No JavaScript**.