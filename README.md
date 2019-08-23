
# Test Neomind   

### Summary  
 - [Proposed problem](www.google.com.br)  
 - [What I want to solve](www.google.com.br) 
-  [How I solved](www.google.com.br)

  
## Proposed problem
**Idea:** Write a program that by a given time, can calculate the angle between the two clock pointers.
**Consider:**
• 00:00h has 0° as result.
• 00:15h  has 45° as result.
• 00:30h  has 180° as result.
**Structure:** The following code was given to be an example of desired method:
`public long returnAngleClock(GregorianCalendar time);`

## What I want to solve
After reading a couple of times, I came up with some ideas and questions:

 1. It is not specified which angle between the two pointers is wanted, ~~bigger one or the smallest one~~ so I choose to deal with **the smallest one**, as it is more useful. 
 2. By the examples given to consider, I realized that they do not care about how the hours-pointer is affected by the minutes-pointer. For example, taking *1:30 AM* as our time: The hours-pointer will be in the middle of 1 and 2, because the minutes-pointer is at exactly the half of the clock. I decided to consider this extra detail while creating the program, so it will be more realistic and will give more accurate angles.\
 3. The method has a `long` as it's primitive return type, so we are limited to deal only with exact 'big' angles, but we are not able to deal with decimal results, so I decided to change it to another primitive type (double), and now er are able to handle numbers with fractional values.

## How I solved


I started by thinking what matters when the objective is to calculate the angle between two points in a circle surface (clock). So, the first step was to discover both angles and I made this by using the idea expressed in the picture: <br>
<img src="./imgs/img1.jpg" alt="Image 1" width="200"/>
