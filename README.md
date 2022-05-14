Project Overview:
=================

In this project, you’ll be developing tests for the project class (Under
\\\\ProjectSOFT3406\\src\\main\\java\\), including main() and triangle
() methods.

Your task is to add tests to the projectTest (Under
[\\\\ProjectSOFT3406\\src\\test\\java](file:///\\ProjectSOFT3406\src\test\java)).

You will use MC/DC as a design method.

Deliverable
-----------

Your deliverable is the projectTest.java which tests the project class.
You will also prepare a small project test case document which include a
table (example is below ) and test cases with scenario and expected
result.

public static boolean isTriangle(double a, double b, double c) {\
if ((a + b &gt; c) &&\
(a + c &gt; b) && // should be a + c &gt; b\
(b + c &gt; a)) {\
return true;\
}\
return false;\
}

Modified Condition/Decision Testing

X a+b&gt;c

Y a+c&gt;b

Z b+c&gt;a

X = false / Y = true / Z = true---&gt;decision is evaluated to "false"

X = true / Y = false / Z = true---&gt;decision is evaluated to "false"

X = true / Y = true / Z = false---&gt;decision is evaluated to "false"

X = true / Y = true / Z = true---&gt;decision is evaluated to "true"

Test Cases:

TC1.

Setup No prerequisites

Scenario (with Expected Results)

…

  TC   X       Y       Z       a       b       c
  ---- ------- ------- ------- ------- ------- -------
  1    **F**   **T**   **T**   **1**   **2**   **4**
  2    **T**   **F**   **T**   **0**   **4**   **2**
  3    **T**   **T**   **F**   **5**   **2**   **3**
  4    **T**   **T**   **T**   **5**   **5**   **5**

Evaluation
----------

In order to measure the adequacy of your tests, the mutation analysis
will be used. Many variations of project java file have been created
each with a single fault introduced.

Recommended Setup TestNG Framework(on IntelliJ /Java):
======================================================

Create a new Maven Project (ProjectSOFT3406Team\[i\])

![](media/image1.png){width="4.416666666666667in"
height="3.4794280402449695in"}

![](media/image2.png){width="4.458333333333333in"
height="3.4928193350831145in"}

Project Structure is below:

> ![](media/image3.png){width="3.96875in" height="6.479166666666667in"}
>
> Create a java class (Project) under src\\main\\java and projectTest
> under src\\test\\java
>
> Copy methods main() and triangle () to the project.java class.
>
> New Project structure is:
>
> ![](media/image4.png){width="4.166666666666667in"
> height="6.489583333333333in"}

-   Open Module Settings

![](media/image5.png){width="2.7448720472440944in" height="5.1875in"}

-   Add testng library and Apply

![](media/image6.png){width="2.3125in" height="2.772214566929134in"}

Add all libraries under jar\_files.zip directory similarly.

![](media/image7.png){width="3.5416666666666665in" height="3.15625in"}

Add your tests to the projectTest.java class. An example is below:

![](media/image8.png){width="6.531944444444444in"
height="2.120833333333333in"}
