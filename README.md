# Java-Logger-API
A API made for better logging! #NoMoreSystemOut
Hope you like it. (Made in CoderDojo)


# Documentation
# How to get started
- First add this to your 'public void main(string args[])' code line: 'MainCode.initAPI();'
- Import the package 'net.coderdojo.*'
Done!

# How to use the Logger
- Import the package 'net.coderdojo.*'
- Add this to the main-method of your class: 'public Logger l = new Logger();'
- Use the Logger.

# Logger Examples
- Code: l.logDebug("input"); - Result: [Log]: input
- Code: l.logWarn("input"); - Result: [Warn]: input
- Code: l.logErr("input", true); - Result: [Err]: input (& will close your program if boolean is true)
