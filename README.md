The most difficult part of writing this program was writing the Road object. We decided early on that Passenger,
Station, and Car should all be managed within Road, so that the Runner had only to call one method for the entire
program to function. But, as a result of this decision, we had to make sure that Road had access to all the 
information for each object, and that each object could accurately "talk" to Road. In the early stages, it became
difficult to discern when this communication was working and, if it wasn't, where it was going wrong. Once these
questions had been resolved, the program began to take shape more clearly and, with all the functions in one place,
the runner was simple to write. Resultingly, we are quite proud of the way the Road object functions, and we had 
the chance to make the runner as effective and adaptable as possible. Additionally, the formatting of the toStrings
was a challenge, because they needed to both informative and easy on the eyes, given how often they'd be called. So
we're also quite happy with the way the formatting of those strings turned out, which is very informative, and not
a *total* mess. After all this, we designed a tester that could run efficiently and return useful information. A 
total of 100000 runs of each scenario (accessible in the RideshareRunner file) will reveal that, on average, a road
with 20 cars and 50 passengers, will make $11.80 per car ($236 total), and a road with 10 cars and 30 passengers
will make about $11.40 per car (or $114 total). Both testers resulted in between nine and ten passengers not 
making it to their destination. 

HOW TO USE THE RUNNER:
The runner has two methods in it, a testRoad function which, given conditions, runs a simulation of the road under
those conditions. The second method, loopRoad, runs testRoad a given number of times, and prints out the average
reuslts of these tests. In the main() function, you can set these tests to print out the toStrings, or not to. We
have chosen to leave these parameters as 'false', otherwise the terminal would be flooded with the toStrings of over
200000 simulations. However, if you wished to check that the logic of the objects was working as intended, setting 
the first boolean to 'true' will print out the Road's toString once for each five times that advance() is called, 
and setting the second boolean to 'true' will print out one last toString at the end of each simulation (to ensure
that all cars and passengers are in their expected places by the end of the simulation).