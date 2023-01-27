# Wagons of War
> All good armies need wagons to transport supplies to the front lines.  These wagons are magically endowed with the abilities to allow their oxen to pull them farther than normal wagons with heavier loads.

## Objectives required to complete
This quest has us working with designing and writing classes.  We have a goal to write a class based upon the given description and sample interaction.

### Objective 1 - Starting the project
Read this description carefully so as to not miss any details.

### Objective 2 - Designing a Plan 
Everyone needs a good plan of attack

### Objective 3 - Cloning
Clone this repo into `IntelliJ`.

## Quest Requirements
**All method names should be as stated in order to avoid errors on unit tests.**

### Objective 1 - The constructors and methods
Write a `Wagon` class that will keep track of miles traveled and when you need to change the oxen.

| Statements and Expressions            | Value Returned  (blank if none)  | Comments                    |
| ---------------------------           | ----------------- | --------------------------------           |
| `Wagon w = new Wagon(9000, 3000);`    |                   | Single constructor that takes in miles driven and when to change the oxen. Assumes wagon has never had an oxen change. Sets last oxen change mileage to 0         |
| `out.println(w.timeForOxenChange());` | `true`            | Checks if it is time to change oxen. Returns true as 9000 is >= 3000 and resets last oxen change mileage to 0       |
| `w.addMiles(2000);`                   |                   | add 2000 miles to miles driven             |
| `out.println(w.timeForOxenChange());` | `false`           | Checks if it is time to change oxen. Wagon has driven 2000 miles since last oxen change - returns false           |
| `w.addMiles(2000);`                   |                   | add 2000 miles to miles driven             |
| `out.println(w.timeForOxenChange());` | `true`            | Checks if it is time to change oxen. Wagon has now driven 4000 miles since last oxen change - returns true. 4000 is >= 3000 so time to change oxen     |


	
### Objective 2 - Testing with the main
- Call all the methods on each array in the main
- Display the various results to the user in a friendly format

### Objective 3 - Pushing
Reminder to push code from `IntelliJ` back to GitHub.

