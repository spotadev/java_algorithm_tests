====================================================================================================
docs/testng/testng_README.txt
====================================================================================================

testng is used for automated unit tests.

We use testng for automated unit tests and jUnit for automated spring tests - although both testng 
and junit can be used for unit tests.

To get testng working in STS do following:

    (i) Help ==> Eclipse Market Place
    
    (ii) In Find box type:   testng   and press return.
    
    (iv) Install TestNG for Eclipse - Confirm all options - you will be asked to accept unsigned 
         content and to reboot STS - say yes.
    
    (v) To open a test class:   ctr-shift-t  and type Misc_UT
    
        Note on the Mac you use "command" instead of ctr

    (vi) Highlight the “additionTest()” method and right click and choose “run as testNG Test”
