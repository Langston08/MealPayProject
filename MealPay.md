# MealPay Project

In this project, you will write a series of classes that allows you to complete the project description specified below. Whereas in previous projects we had a specific series of methods and classes to create, here it is up to you how to implement a working solution.

## Project Description

A college needs to implement a system to keep track of student meal account balances. At the college there is only one option for lunch, which always costs $7. In the system, all students have an account balance in which they can be charged for lunch or add funds to their account. The students' balances can go negative.

Because enrollment may change, the system needs to be able to add new students whose balance will start at $0. All students have a unique ID number in order to prevent confusion if two students have the same name. The system needs to be able to retrieve student accounts based on their ID number as well display all student accounts and just those whose balance is negative. Additionally, the program needs to be able to display all transactions on a given date.

In order to document all transactions, each instance of a purchase or fund addition needs to be logged and have a date associated with it. Multiple transactions can occur on the same date.

## Sample Output

Here is an example of how the program can demonstrate successful implementation. Your solution does not need to look the same, but should meet the project description.

```
Welcome to the MealPay program!

Adding students to the program...

Displaying students...
Student: Bobby Bobbs ID: 1 Balance: $0.0 Transactions:
Student: Joe Schmo ID: 2 Balance: $0.0 Transactions:
Student: Kelly Shelly ID: 3 Balance: $0.0 Transactions:
Student: Bobby Bobbs ID: 4 Balance: $0.0 Transactions:

Adding some funds and making some purchases...
Student: Bobby Bobbs ID: 1 Balance: $-14.0 Transactions: (2/4, $-7.0), (2/6, $-7.0)
Student: Joe Schmo ID: 2 Balance: $33.0 Transactions: (2/4, $40), (2/5, $-7.0)
Student: Kelly Shelly ID: 3 Balance: $-56.0 Transactions: (2/4, $-7.0), (2/4, $-7.0), (2/4, $-7.0), (2/4, $-7.0), (2/4, $-7.0), (2/4, $-7.0), (2/8, $-7.0), (2/8, $-7.0)
Student: Bobby Bobbs ID: 4 Balance: $10.0 Transactions: (2/9, $5.0), (2/9, $5.0)

Displaying just those with negative balances...
Student: Bobby Bobbs ID: 1 Balance: $-14.0 Transactions: (2/4, $-7.0), (2/6, $-7.0)
Student: Kelly Shelly ID: 3 Balance: $-56.0 Transactions: (2/4, $-7.0), (2/4, $-7.0), (2/4, $-7.0), (2/4, $-7.0), (2/4, $-7.0), (2/4, $-7.0), (2/8, $-7.0), (2/8, $-7.0)

Looking up student with ID number of 2:
Student: Joe Schmo ID: 2 Balance: $33.0 Transactions: (2/4, $40), (2/5, $-7.0)

Displaying all transactions on 2/4...
(2/4, $-7.0) by Bobby Bobbs ID: 1
(2/4, $40.0) by Joe Schmo ID: 2
(2/4, $-7.0) by Kelly Shelly ID: 3
(2/4, $-7.0) by Kelly Shelly ID: 3
(2/4, $-7.0) by Kelly Shelly ID: 3
(2/4, $-7.0) by Kelly Shelly ID: 3
(2/4, $-7.0) by Kelly Shelly ID: 3
(2/4, $-7.0) by Kelly Shelly ID: 3
(2/4, $-7.0) by Kelly Shelly ID: 3
(2/4, $-7.0) by Kelly Shelly ID: 3
```

## Rubric

The following needs to be met in order to receive full credit:

- The program demonstrates effective use of multiple classes to keep track of information (5 pts)
- The program satisfies all criteria of functionality listed in the project description (20 pts)
- The program includes sample output demonstrating all capabilities (10 pts)
- The program includes a `git` (either locally or on GitHub) commit history with reasonable updates to commits. (5 pts)