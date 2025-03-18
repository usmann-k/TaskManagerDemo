Task Management System Using Polymorphism 

Problem Statement 
The program is a simple Task Management System that allows users to create and manage different types of tasks. These tasks include a General Task with a title and description, a Deadline Task with a due date, and a Priority Task with a priority level (High, Medium, Low).   

Without Polymorphism   
In the approach without polymorphism, each task type is handled separately in different classes without a shared structure. This results in repetitive code and makes it harder to modify or add new task types. If a new task type is needed, additional logic must be manually written in multiple places, increasing complexity and reducing maintainability.   

With Polymorphism   
Using polymorphism, a base class called `Task` is created, and all specific task types inherit from it. Each task type overrides common methods to provide its own specialized behavior while maintaining a shared structure. This reduces code duplication, improves readability, and makes the system more scalable. If a new task type is needed, it can simply extend the `Task` class without affecting existing functionality.   

Key Differences   
Polymorphism helps organize similar behaviors under a single structure, making the program more flexible and easier to understand. Instead of writing separate logic for each task type, the base class provides a standard way to handle all tasks while allowing for customization through method overriding. This approach ensures a cleaner, more maintainable, and extensible system. 
 
Explanatory Video Link:  
