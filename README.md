# demo-j
# Challenge
Checkout the latest source and run `mvn spring-boot:run`

this would run the server in the console. then you can do the curl on another terminal
`curl -X PUT --data-urlencode value='10+2*3' localhost:6666/calculate`

you have to change the `-d` into `--data-urlencode` since curl interprets + as space

## Plot Twist
I found a library that can do what you are asking. Check out [exp4j](http://projects.congrace.de/exp4j/). Is this your intention?

Majority of the time I spent here is configuring the Spring Framework, which is expected for Java. I just added 2 classes.
[CalculatorService](https://github.com/heinrich10/demo-j/blob/master/src/main/java/hello/CalculatorService.java)
[CalculatorController](https://github.com/heinrich10/demo-j/blob/master/src/main/java/hello/CalculatorController.java)
