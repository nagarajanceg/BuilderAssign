TEAM MEMBERS:
Nagarajan Gopal
Abinaya Kethireddy


"I have done this assignment completely on my own. I have not copied it, nor have I given my solution to anyone else. 
I understand that if I am involved in plagiarism or cheating I will have to sign an official form that I have cheated 
and that this form will be stored in my official university record. I also understand that I will receive a grade of 
0 for the involved assignment for my first offense and that I will receive a grade of F for the course for any additional offense."

[Date:04/10/2018]
------------------------------------------------------------------------


Assuming you are in the directory containing this README:

## To clean:
ant -buildfile src/build.xml clean

-----------------------------------------------------------------------
## To compile:
ant -buildfile src/build.xml all

-----------------------------------------------------------------------
## We will use this to run your code
ant -buildfile src/build.xml run

-----------------------------------------------------------------------
##To generate a javadoc from command line
ant -buildfile src/build.xml doc
-----------------------------------------------------------------------

PATTERNS USED:
(1)	Builder pattern
(2)	Simple factory method
We used builder pattern to construct the event umbrella object. Simple Factory is  used to get the necessary concrete


Our Assumptions:
�	Event instances are based on the type of enum chosen in the driver code.
�	In driver code the user options provided to the builder should have 5 arguments(SchoolTypes,  SchoolBuildingCommute, GiftShop, Cafe, Lecture ) but the order of arguments doesn't matter. And we are having a validator to verify those 5 arguments in builder constructor itself. Suppose in case of any missed arguments it will throw an exception with message "Chosen events not satisfied the Mandatory List".
�	Few other sample input enums are commented in driver code.


