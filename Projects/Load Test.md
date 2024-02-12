## Load Test (Optional)

The purpose of this exercise is to use the Load Test Routine to detect and fix a memory leak in a sample web application.

It will take you about **3 hours** to complete the task.

Please be aware that the task status is **optional**.

*Please read carefully and do the following:*

1. Download and install the following tools:

   - [VisualVM](https://visualvm.github.io/)
     - be sure to install the VisualGC plugin
   - **[Memory Analyzer Tool (MAT)](https://www.eclipse.org/mat/)**
   - **[JMeter](https://jmeter.apache.org/)**

2. You are going to load test the web app Message Registry. It has two endpoints:

   - POST /message – to receive a message
   - GET /last10 – to get the last 10 received messages

3. Download

    

   message-registry.jar

    

   to the folder where you will run this test application. Go to the folder where

    

   message-registry.jar

    

   is located. To run the application, you need to type a command in the command line:

   ```
   java -jar  message-registry.jar
   ```

   and press "Enter".

   Note that you need at least version 11 of Java to run it.

   This way you will start a web server on your machine using the port 8080 (by default).

   So, you will be able to reach web app endpoints with URLs:

   - **http://localhost:8080/message**
   - **http://localhost:8080/last10**

4. Add to the command above some arguments to reduce the maximum heap size to 50 megabytes and a flag to get information about what garbage collector implementation the JVM applied. After this, start the web app and make sure there are no errors after the application launch.

5. Connect to the application process via VisualVM and look at the VisualGC interface to monitor the heap state.

6. Set up and run a test plan in JMeter to load the endpoints of the application:

   - POST /message - no parameters, add sample message text as a Request Body
   - GET /last10 - no parameters or body

   The test plan should have a lot of threads and run forever.

7. Monitor the heap state via VisualVM and wait until the heap gets stuck. Then, make a heap dump.

8. Use MAT to analyze the heap dump and describe the existent problems.

9. Suggest a solution to these problems.

**This task is successfully completed if:**

- VisualVM, Memory Analyzer Tool (MAT), and JMeter are installed.
- The message-registry-load-test project is cloned and ran as a Spring Boot application with the heap size 50Mb and a flag to get what the garbage collector has applied.
- VisualVM is used to connect to the application process, and the heap state is monitored via the VisualGC interface.
- The appropriate test plan in JMeter was set up and ran to load the endpoints of the application.
- The heap state is monitored via VisualVM, and a heap dump is made when the heap gets stuck.
- The heap dump is analyzed, and the existent problems are described using MAT.
- The solution that can resolve the discovered problems is suggested.