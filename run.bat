set ProjectPath=C:\Users\fcoronel\workspace\TestNGExamples
cd %ProjectPath%
set classpath=%ProjectPath%\bin;%ProjectPath%\lib\*
java org.testng.TestNG C:\Users\fcoronel\workspace\TestNGExamples\testng.xml
pause